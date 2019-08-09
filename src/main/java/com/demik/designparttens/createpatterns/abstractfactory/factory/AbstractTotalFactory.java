package com.demik.designparttens.createpatterns.abstractfactory.factory;

import com.demik.designparttens.createpatterns.abstractfactory.ConstType;
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
 * Date: 2019/8/5 7:19 PM
 * @since JDK 1.8
 */
public abstract class AbstractTotalFactory {

    public abstract Headphone getHeadphone();

    public abstract Keyboard getKeyboard();

    public abstract Mouse getMouse();

    public static AbstractTotalFactory getFactory(String factoryType){
        switch (factoryType){
            case "hp":
                return new HpFactory();
            case "hw":
                return new HwFactory();
            case "dell":
                return new DellFactory();
            default:
                return null;
        }
    }

}
