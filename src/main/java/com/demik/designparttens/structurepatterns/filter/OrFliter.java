package com.demik.designparttens.structurepatterns.filter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/22 10:46 AM
 * @since JDK 1.8
 */
public class OrFliter implements PersonFliter {

    private PersonFliter oneFliter;

    private PersonFliter otherFliter;

    public OrFliter(PersonFliter oneFliter,PersonFliter otherFliter){
        this.oneFliter = oneFliter;
        this.otherFliter = otherFliter;
    }

    @Override
    public List<Person> fliterStart(List<Person> personList) {
        return new ArrayList<>(new HashSet<Person>(){{
            addAll(oneFliter.fliterStart(personList));
            addAll(otherFliter.fliterStart(personList));
        }});
    }
}
