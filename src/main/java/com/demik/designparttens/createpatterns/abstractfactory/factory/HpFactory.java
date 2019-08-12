package com.demik.designparttens.createpatterns.abstractfactory.factory;

import com.demik.designparttens.createpatterns.abstractfactory.product.headphone.Headphone;
import com.demik.designparttens.createpatterns.abstractfactory.product.headphone.HpHeadphone;
import com.demik.designparttens.createpatterns.abstractfactory.product.keyboard.HpKeyboard;
import com.demik.designparttens.createpatterns.abstractfactory.product.keyboard.Keyboard;
import com.demik.designparttens.createpatterns.abstractfactory.product.mouse.HpMouse;
import com.demik.designparttens.createpatterns.abstractfactory.product.mouse.Mouse;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/5 7:24 PM
 * @since JDK 1.8
 */
public class HpFactory extends AbstractTotalFactory {

    @Override
    public Headphone getHeadphone() {
        return new HpHeadphone();
    }

    @Override
    public Keyboard getKeyboard() {
        return new HpKeyboard();
    }

    @Override
    public Mouse getMouse() {
        return new HpMouse();
    }

}
