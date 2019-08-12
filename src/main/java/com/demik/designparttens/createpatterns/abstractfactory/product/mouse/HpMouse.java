package com.demik.designparttens.createpatterns.abstractfactory.product.mouse;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/5 6:09 PM
 * @since JDK 1.8
 */
public class HpMouse implements Mouse{

    @Override
    public void sayHello() {
        System.out.println("Hello I am a Hp Mouse");
    }

}
