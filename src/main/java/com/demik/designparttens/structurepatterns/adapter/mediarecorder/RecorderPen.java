package com.demik.designparttens.structurepatterns.adapter.mediarecorder;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/13 11:20 AM
 * @since JDK 1.8
 */
public class RecorderPen implements AdvancedMediaRecorder{
    @Override
    public void record() {
        System.out.println("I am a RecorderPen who can record voice!");
    }
}
