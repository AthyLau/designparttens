package com.demik.designparttens.createpatterns.abstractfactory;

import com.demik.designparttens.createpatterns.abstractfactory.factory.AbstractTotalFactory;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/5 7:38 PM
 * @since JDK 1.8
 */
public class Test {

    public static void main(String args[]){
        AbstractTotalFactory factory1 = AbstractTotalFactory.getFactory("dell");
        if(factory1!=null){
            factory1.getHeadphone().sayHello();
            factory1.getKeyboard().sayHello();;
            factory1.getMouse().sayHello();;
        }
        AbstractTotalFactory factory2 = AbstractTotalFactory.getFactory("hp");
        if(factory2!=null){
            factory2.getHeadphone().sayHello();
            factory2.getKeyboard().sayHello();;
            factory2.getMouse().sayHello();;
        }
        AbstractTotalFactory factory3 = AbstractTotalFactory.getFactory("hw");
        if(factory3!=null){
            factory3.getHeadphone().sayHello();
            factory3.getKeyboard().sayHello();;
            factory3.getMouse().sayHello();;
        }
    }

}
