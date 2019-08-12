package com.demik.designparttens.createpatterns.prototype.shape;

import com.demik.designparttens.createpatterns.prototype.Prototype;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/12 10:55 AM
 * @since JDK 1.8
 */
public abstract class Shape implements Cloneable{

    private Integer id;

    private String shapeName;

    abstract public void say();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public Object clone(){
        Shape shape = null;
        try {
            shape = (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        if(shape!=null && Prototype.addCloneToCache(shape)){
            return shape;
        }
        return null;
    }
}
