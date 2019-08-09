package com.demik.designparttens.createpatterns.abstractfactory.product.keyboard;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/5 7:18 PM
 * @since JDK 1.8
 */
public class DellKeyboard implements Keyboard {
    @Override
    public void sayHello() {
        System.out.println("hello i am a dell Keyboard");
    }
}
