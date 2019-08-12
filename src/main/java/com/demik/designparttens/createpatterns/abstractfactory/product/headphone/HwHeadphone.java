package com.demik.designparttens.createpatterns.abstractfactory.product.headphone;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/5 7:15 PM
 * @since JDK 1.8
 */
public class HwHeadphone implements Headphone{

    @Override
    public void sayHello() {
        System.out.println("hello i am a HW Headphone");
    }
}
