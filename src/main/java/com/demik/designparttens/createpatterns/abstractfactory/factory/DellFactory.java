package com.demik.designparttens.createpatterns.abstractfactory.factory;

import com.demik.designparttens.createpatterns.abstractfactory.product.headphone.DellHeadphone;
import com.demik.designparttens.createpatterns.abstractfactory.product.headphone.Headphone;
import com.demik.designparttens.createpatterns.abstractfactory.product.keyboard.DellKeyboard;
import com.demik.designparttens.createpatterns.abstractfactory.product.keyboard.Keyboard;
import com.demik.designparttens.createpatterns.abstractfactory.product.mouse.DellMouse;
import com.demik.designparttens.createpatterns.abstractfactory.product.mouse.Mouse;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/5 7:24 PM
 * @since JDK 1.8
 */
public class DellFactory extends AbstractTotalFactory {


    @Override
    public Headphone getHeadphone() {
        return new DellHeadphone();
    }

    @Override
    public Keyboard getKeyboard() {
        return new DellKeyboard();
    }

    @Override
    public Mouse getMouse() {
        return new DellMouse();
    }

}
