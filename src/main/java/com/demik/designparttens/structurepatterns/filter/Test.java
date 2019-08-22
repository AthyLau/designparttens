package com.demik.designparttens.structurepatterns.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/22 10:54 AM
 * @since JDK 1.8
 */
public class Test {

    public static void main(String args[]){
        Person person1 = new Person("1" , "1", "male", 123);
        Person person2 = new Person("2" , "1", "male", 6);
        Person person3 = new Person("3" , "1", "male", 6);
        Person person4 = new Person("4" , "1", "female", 13);
        Person person5 = new Person("5" , "1", "female", 9);
        Person person6 = new Person("6" , "1", "male", 8);
        Person person7 = new Person("7" , "1", "male", 13);
        Person person8 = new Person("8" , "1", "male", 13);
        Person person9 = new Person("9" , "1", "female", 8);
        Person person10 = new Person("10" , "1", "female", 15);
        List<Person> personList = new ArrayList<Person>(){{
            add(person1);add(person6);
            add(person2);add(person7);
            add(person3);add(person8);
            add(person4);add(person9);
            add(person5); add(person10);
        }};

        //大于等于10岁的男生
        AndFliter andFliter = new AndFliter(new SexFliter(), new AgeFliter());
        andFliter.fliterStart(personList).forEach(x->{
            System.out.print(x.getId()+"  ");
        });
        System.out.println();
        System.out.println();
        //大于等于10岁 或者 男生
        OrFliter orFliter = new OrFliter(new SexFliter(), new AgeFliter());
        orFliter.fliterStart(personList).forEach(x->{
            System.out.print(x.getId()+"  ");
        });

    }

}
