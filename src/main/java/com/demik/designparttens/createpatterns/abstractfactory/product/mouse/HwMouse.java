package com.demik.designparttens.createpatterns.abstractfactory.product.mouse;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/5 7:11 PM
 * @since JDK 1.8
 */
public class HwMouse implements Mouse{

    @Override
    public void sayHello() {
        System.out.println("Hello I am a Hw Mouse");
    }
}
