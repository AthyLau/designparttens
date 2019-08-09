package com.demik.designparttens.createpatterns.factory;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/5 2:57 PM
 * @since JDK 1.8
 */
public class ThirdAuthType implements AbstractAuth {
    @Override
    public void speakAuthType() {
        System.out.println("I am the third auth type");
    }
}
