package com.demik.designparttens.structurepatterns.adapter.mediaplayer;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/13 11:10 AM
 * @since JDK 1.8
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void play(String fileName) {

        if (fileName.toLowerCase().endsWith(".mp4")) {
            System.out.println("playing " + fileName + "now");
        } else {
            System.out.println("I can't play this file!");
        }
    }
}
