package com.demik.designparttens.createpatterns.prototype.shape;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/12 11:03 AM
 * @since JDK 1.8
 */
public class ShapeFactory {

    public Shape getShape(String type){
        switch (type.toLowerCase()){
            case "rectangle":
                return new Rectangle();
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            default:
                return null;
        }
    }
}
