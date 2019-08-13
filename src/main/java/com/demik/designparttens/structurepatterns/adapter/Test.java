package com.demik.designparttens.structurepatterns.adapter;

import com.demik.designparttens.structurepatterns.adapter.adapter.RecoderMp4Pen;

/**
 * Function:有一个媒体录音器跟一个媒体播放器的类，录音器只有一个录音笔实现类，播放器分为mp4跟vcl，我现在想弄一个既能播放mp4又能录音的笔
 *
 * 使用适配器模式来搞。
 *
 * 使用继承+实现的方式创建完成适配器之后就可以拿适配器来创建新的对象了。创建出来的对象能播放mp4能录音
 *
 * @author liubing
 * Date: 2019/8/13 11:06 AM
 * @since JDK 1.8
 */
public class Test {

    public static void main(String args[]){
        RecoderMp4Pen recoderMp4Pen = new RecoderMp4Pen();
        recoderMp4Pen.play("abc.mp4");
        recoderMp4Pen.record();
    }

}
