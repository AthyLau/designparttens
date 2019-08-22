package com.demik.designparttens.testpatterns.builder;

import java.util.HashMap;
import java.util.Map;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/21 5:07 PM
 * @since JDK 1.8
 */
public class Order {

    public Map<Integer,Product> getYesterdayOrder(){
        return new HashMap<Integer,Product>(){{
            put(1,new JDShoes());
            put(2,new SenMaCoat());
        }};
    }

    public Map<Integer,Product> getTodayOrder(){
        return new HashMap<Integer,Product>(){{
            put(1,new JDShoes());
            put(1,new SenMaCoat());
        }};
    }

}
