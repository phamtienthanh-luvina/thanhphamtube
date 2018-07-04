/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thanhpham.video;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class ExecuteCommand {

//    public static void main(String[] args) {
//        GenerateVideo generateVideo = new GenerateVideo();
//        String imagePath = "\"S:\\0.SPECIAL\\GAU\\Con gai 6 thang\\DSC_1330.jpg\"";
//        String audioPath = "C:\\Users\\Administrator\\Desktop\\Dung-Quen-Ten-Anh-Hoa-Vinh.mp3";
//        String outPath = "C:/Users/Administrator/Desktop/thanhpham.mp4";
//        Runtime rt = Runtime.getRuntime();
//        try {
//            if (generateVideo.generateMp4FromImageAndAudio(imagePath, audioPath, outPath, rt)) {
//                System.out.println("Generate MP4 success !");
//            }
//            rt.exit(0);
//        } catch (Exception ex) {
//            rt.exit(0);
//            Logger.getLogger(ExecuteCommand.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    public static void main(String[] args) {
        GenerateVideo generateVideo = new GenerateVideo();
        String mp4Path = "C:/Users/Administrator/Desktop/thanhpham.mp4";
        Runtime rt = Runtime.getRuntime();
        try {
            String subtitlesPath = "C\\\\:/Users/Administrator/Desktop/srt_test.srt";
            String outSubtitlesVideo = "C:/Users/Administrator/Desktop/video_with_subtitles.mp4";
            if (generateVideo.addSubtitles2Video(mp4Path, subtitlesPath, outSubtitlesVideo, rt)) {
                System.out.println("Add subtitles success !");
            }
            rt.exit(0);
        } catch (Exception ex) {
            rt.exit(0);
            Logger.getLogger(ExecuteCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
