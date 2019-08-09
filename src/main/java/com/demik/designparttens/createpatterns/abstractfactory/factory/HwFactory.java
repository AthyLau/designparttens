package com.demik.designparttens.createpatterns.abstractfactory.factory;

import com.demik.designparttens.createpatterns.abstractfactory.product.headphone.Headphone;
import com.demik.designparttens.createpatterns.abstractfactory.product.headphone.HwHeadphone;
import com.demik.designparttens.createpatterns.abstractfactory.product.keyboard.HwKeyboard;
import com.demik.designparttens.createpatterns.abstractfactory.product.keyboard.Keyboard;
import com.demik.designparttens.createpatterns.abstractfactory.product.mouse.HwMouse;
import com.demik.designparttens.createpatterns.abstractfactory.product.mouse.Mouse;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/5 7:24 PM
 * @since JDK 1.8
 */
public class HwFactory extends AbstractTotalFactory {

    @Override
    public Headphone getHeadphone() {
        return new HwHeadphone();
    }

    @Override
    public Keyboard getKeyboard() {
        return new HwKeyboard();
    }

    @Override
    public Mouse getMouse() {
        return new HwMouse();
    }
}
