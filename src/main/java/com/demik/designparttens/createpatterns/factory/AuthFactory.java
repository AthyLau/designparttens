package com.demik.designparttens.createpatterns.factory;


/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/5 2:50 PM
 * @since JDK 1.8
 */
public class AuthFactory {

    public static AbstractAuth getAuthType(String type){
        switch (type){
            case "first":
                return new FirstAuthType();
            case "second":
                return new SecondAuthType();
            case "third":
                return new ThirdAuthType();
            default:
                return null;
        }
    }

}
