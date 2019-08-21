package com.demik.designparttens.testpatterns.prototype;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/21 11:32 AM
 * @since JDK 1.8
 */
public abstract class ClonePrototype<T> implements Cloneable {

    public T cloneObj() {
        T clone = null;
        try {
            clone = (T) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
