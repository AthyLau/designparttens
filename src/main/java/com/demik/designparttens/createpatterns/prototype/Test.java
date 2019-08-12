package com.demik.designparttens.createpatterns.prototype;

import com.demik.designparttens.createpatterns.prototype.shape.Shape;
import com.demik.designparttens.createpatterns.prototype.shape.ShapeFactory;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/12 10:55 AM
 * @since JDK 1.8
 */
public class Test {

    public static void main(String args[]){

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape = shapeFactory.getShape("circle");
        shape.setId(1);
        shape.clone();

        shape = shapeFactory.getShape("rectangle");
        shape.setId(2);
        shape.clone();

        shape = shapeFactory.getShape("square");
        shape.setId(1);
        shape.clone();

        System.out.println(Prototype.getAllCloneFromCache());


    }

}
