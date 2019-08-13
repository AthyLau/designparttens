package com.demik.designparttens.structurepatterns.adapter.mediaplayer;

import com.demik.designparttens.structurepatterns.adapter.mediaplayer.AdvancedMediaPlayer;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/13 11:08 AM
 * @since JDK 1.8
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void play(String fileName) {

        if (fileName.toLowerCase().endsWith(".vlc")) {
            System.out.println("playing now");
        }
        System.out.println("I can't play this file!");

    }

}
