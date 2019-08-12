package com.demik.designparttens.createpatterns.prototype.shape;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/12 11:00 AM
 * @since JDK 1.8
 */
public class Circle extends Shape {

    public Circle(Integer id){
        this.setId(id);
        this.setShapeName("circle");
    }

    public Circle(){
        this.setShapeName("circle");
    }

    @Override
    public void say() {
        System.out.print(this.getId()+" "+this.getShapeName()+"  "+this.getClass() );
    }

}
