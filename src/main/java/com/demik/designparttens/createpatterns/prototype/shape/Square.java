package com.demik.designparttens.createpatterns.prototype.shape;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/12 11:00 AM
 * @since JDK 1.8
 */
public class Square extends Shape{

    public Square(Integer id){
        this.setId(id);
        this.setShapeName("square");
    }
    public Square(){
        this.setShapeName("square");
    }

    @Override
    public void say() {
        System.out.print(this.getId()+" "+this.getShapeName()+"  "+this.getClass() );
    }


}
