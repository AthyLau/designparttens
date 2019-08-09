package com.demik.designparttens.createpatterns.factory;

import org.springframework.beans.factory.annotation.Value;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/5 2:56 PM
 * @since JDK 1.8
 */
public class SecondAuthType implements AbstractAuth {

    @Override
    public void speakAuthType() {
        System.out.println("I am the second auth type");
    }
}
