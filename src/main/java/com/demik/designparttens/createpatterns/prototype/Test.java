package com.demik.designparttens.createpatterns.prototype;

import com.demik.designparttens.createpatterns.prototype.shape.Shape;
import com.demik.designparttens.createpatterns.prototype.shape.ShapeFactory;

/**
 * Function:原型模式test
 *
 * 感觉其实就像是把比较难从数据库查的对象放到缓存里，下次查的时候直接从缓存里拿出来用了
 *
 * 原型模式比较常搭配的是工厂模式。一般都与工厂模式搭配使用
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
