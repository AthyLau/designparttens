package com.demik.designparttens.structurepatterns.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/22 3:35 PM
 * @since JDK 1.8
 */
public class Test {

    private static EmailFactory emailFactory = new EmailFactory();

    public static void main(String args[]){
        List<Object> objs = new ArrayList<>();
        for(int i = 0 ;i < 100 ;i ++){
            String type = getRandomEmailType();
            AliEmail aliEmail = (AliEmail) emailFactory.getEmail(type);
            aliEmail.setReceiver(getRandomUser());
            aliEmail.setTime(System.currentTimeMillis());
            System.out.println(aliEmail.getEmail());
            if(!objs.contains(aliEmail)){
                objs.add(aliEmail);
            }
        }
        System.out.println(objs.size());
    }
    public static String getRandomEmailType(){
        EmailType[] types = EmailType.values();
        return types[(int)(Math.random()*types.length)].name();
    }
    public static String getRandomUser(){
        return UUID.randomUUID().toString().substring(0,5);
    }
}
