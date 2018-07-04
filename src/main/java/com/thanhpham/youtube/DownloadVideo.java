/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thanhpham.youtube;

import com.github.axet.vget.VGet;
import java.io.File;
import java.net.URL;

/**
 *
 * @author Administrator
 */
public class DownloadVideo {

    public static void main(String[] args) {
        try {
            String url = "https://www.youtube.com/watch?v=5Sl7boMNARw";
            String path = "D:\\";
            VGet v = new VGet(new URL(url), new File(path));
            v.download();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
