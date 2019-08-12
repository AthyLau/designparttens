package com.demik.designparttens.createpatterns.factory;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/5 2:55 PM
 * @since JDK 1.8
 */
public class FirstAuthType implements AbstractAuth {
    @Override
    public void speakAuthType() {
        System.out.println("I am the first auth type");
    }
}
