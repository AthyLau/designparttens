package com.demik.designparttens.testpatterns.prototype;

import java.util.List;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/21 11:37 AM
 * @since JDK 1.8
 */
public class Monkey extends ClonePrototype<Monkey>{

    public String monkeyId;

    public String monkeyName;

    public List<String> monkeyHobbies;

    public Monkey(String monkeyId, String monkeyName, List<String> monkeyHobbies) {
        this.monkeyId = monkeyId;
        this.monkeyName = monkeyName;
        this.monkeyHobbies = monkeyHobbies;
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "monkeyId='" + monkeyId + '\'' +
                ", monkeyName='" + monkeyName + '\'' +
                ", monkeyHobbies=" + monkeyHobbies +
                '}';
    }

    public String getMonkeyId() {
        return monkeyId;
    }

    public void setMonkeyId(String monkeyId) {
        this.monkeyId = monkeyId;
    }

    public String getMonkeyName() {
        return monkeyName;
    }

    public void setMonkeyName(String monkeyName) {
        this.monkeyName = monkeyName;
    }

    public List<String> getMonkeyHobbies() {
        return monkeyHobbies;
    }

    public void setMonkeyHobbies(List<String> monkeyHobbies) {
        this.monkeyHobbies = monkeyHobbies;
    }
}
