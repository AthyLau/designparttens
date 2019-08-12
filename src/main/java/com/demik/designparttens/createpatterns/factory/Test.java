package com.demik.designparttens.createpatterns.factory;

/**
 * Function:简单的工厂模式
 *
 * @author liubing
 * Date: 2019/8/5 2:58 PM
 * @since JDK 1.8
 */
public class Test {

    public static void main(String args[]){
        AbstractAuth auth = AuthFactory.getAuthType("second");
        if(auth!=null){
            auth.speakAuthType();
        }
    }

}
