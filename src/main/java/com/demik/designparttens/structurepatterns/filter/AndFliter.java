package com.demik.designparttens.structurepatterns.filter;

import java.util.List;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/22 10:52 AM
 * @since JDK 1.8
 */
public class AndFliter implements PersonFliter {

    private PersonFliter otherFliter;
    private PersonFliter oneFliter;

    public AndFliter(PersonFliter oneFliter, PersonFliter otherFliter) {
        this.oneFliter = oneFliter;
        this.otherFliter = otherFliter;
    }

    @Override
    public List<Person> fliterStart(List<Person> personList) {
        return otherFliter.fliterStart(oneFliter.fliterStart(personList));
    }

}
