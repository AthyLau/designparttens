package com.demik.designparttens.testpatterns.prototype;

import java.util.ArrayList;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/21 11:39 AM
 * @since JDK 1.8
 */
public class Test {

    public static void main(String args[]){

        Monkey monkey = new Monkey("1","xiaohouzi",new ArrayList<String>(){{add("sing songs");add("dancing");}});
        MapCloneCache.addCache("monkey-1",monkey.cloneObj());

        monkey.setMonkeyName("xiaowangba");

        Monkey m1 = (Monkey) MapCloneCache.cache.get("monkey-1");
        System.out.println(m1.getMonkeyId()+" "+m1.monkeyName);

    }

}
