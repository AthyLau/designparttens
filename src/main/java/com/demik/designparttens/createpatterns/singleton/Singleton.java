package com.demik.designparttens.createpatterns.singleton;

/**
 * Function:单例模式dcl
 *
 * @author liubing
 * Date: 2019/8/6 11:15 AM
 * @since JDK 1.8
 */
public class Singleton {

    public static volatile Singleton singleton;

    private Singleton(){}

    public static Singleton getSingleton(){
        if(singleton==null){
            synchronized (Singleton.class){
                if(singleton==null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}
