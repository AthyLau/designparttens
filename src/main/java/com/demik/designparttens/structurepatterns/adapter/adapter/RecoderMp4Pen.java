package com.demik.designparttens.structurepatterns.adapter.adapter;

import com.demik.designparttens.structurepatterns.adapter.mediaplayer.Mp4Player;
import com.demik.designparttens.structurepatterns.adapter.mediarecorder.AdvancedMediaRecorder;

/**
 * Function:使用继承加实现接口的方式完成适配器的创建。
 *
 * @author liubing
 * Date: 2019/8/13 11:25 AM
 * @since JDK 1.8
 */
public class RecoderMp4Pen extends Mp4Player implements AdvancedMediaRecorder{

    @Override
    public void record() {
        System.out.println("I am a RecoderMp4Pen who can record voice !");
    }

    @Override
    public void play(String fileName) {
        super.play(fileName);
    }
}
