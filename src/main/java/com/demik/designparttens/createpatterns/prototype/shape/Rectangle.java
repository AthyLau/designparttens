package com.demik.designparttens.createpatterns.prototype.shape;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/12 11:00 AM
 * @since JDK 1.8
 */
public class Rectangle extends Shape{

    public Rectangle(Integer id){
        this.setId(id);
        this.setShapeName("rectangle");
    }

    public Rectangle(){
        this.setShapeName("rectangle");
    }

    @Override
    public void say() {
        System.out.print(this.getId()+" "+this.getShapeName()+"  "+this.getClass() );
    }
}
