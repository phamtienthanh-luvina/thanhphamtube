/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thanhpham.video;

import java.io.File;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class GenerateVideo {

    public GenerateVideo() {
    }

    public boolean generateMp4FromImageAndAudio(String imagePath, String audioPath, String outPath, Runtime rt) {
        try {
            String generateMp4 = "ffmpeg.exe -r 1 -loop 1 -i "
                    + imagePath + " -i "
                    + audioPath + " -acodec copy -r 1 -shortest -vf scale=1280:720 "
                    + outPath;
            rt.exec(generateMp4);
            System.out.println("0: " + new Date());
            File fileOut = new File(outPath);
            while (!fileOut.isFile()) {
                System.out.println("Chua generate xong");
                Thread.sleep(5000);
            }
            return true;
        } catch (Exception ex) {
            Logger.getLogger(ExecuteCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean addSubtitles2Video(String mp4Path, String subtitlesPath, String outPath, Runtime rt) {
        try {
            String addSubtitles = "ffmpeg -i "
                    + mp4Path + " -vf subtitles="
                    + subtitlesPath + " "
                    + outPath;
            rt.exec(addSubtitles);
            File fileOutSubtitles = new File(outPath);
            while (!fileOutSubtitles.isFile()) {
                System.out.println("chua add sub xong");
                Thread.sleep(5000);
            }
            return true;
        } catch (Exception ex) {
            Logger.getLogger(ExecuteCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
