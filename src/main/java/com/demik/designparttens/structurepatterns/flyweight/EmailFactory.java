package com.demik.designparttens.structurepatterns.flyweight;


import java.util.HashMap;
import java.util.Map;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/22 3:19 PM
 * @since JDK 1.8
 */
public class EmailFactory {

    public static Map<String, EmailInf> emailMap = new HashMap<String, EmailInf>(){{
        for (EmailType emailType : EmailType.values()) {
            put(emailType.name(), new AliEmail(null,"ALi","contentcontentcontentcontentcontentcontentcontentcontentcontent",null,emailType.name()));
        }
    }};

    public EmailFactory(){

    }

    public EmailInf getEmail(String emailType){
        return emailMap.get(emailType);
    }

}
