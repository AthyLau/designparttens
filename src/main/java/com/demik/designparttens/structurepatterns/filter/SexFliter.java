package com.demik.designparttens.structurepatterns.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/22 10:43 AM
 * @since JDK 1.8
 */
public class SexFliter implements PersonFliter{

    @Override
    public List<Person> fliterStart(List<Person> personList) {
        List<Person> ret = new ArrayList<>();
        personList.forEach(x->{
            if(x.getSex().equals("male")){
                ret.add(x);
            }
        });
        return ret;
    }

}
