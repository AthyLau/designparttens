package com.demik.designparttens.createpatterns.prototype;

import com.demik.designparttens.createpatterns.prototype.shape.Shape;

import java.util.HashMap;
import java.util.Map;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/12 11:12 AM
 * @since JDK 1.8
 */
public class Prototype {

    private static Map<Integer,Object> cloneObj = new HashMap<>();

    public static boolean addCloneToCache(Shape shape){
        if(!cloneObj.containsKey(shape.getId())){
            cloneObj.put(shape.getId(),shape);
        }
        return false;
    }

    public static Object getCloneFromCache(Integer id){
        return cloneObj.getOrDefault(id,null);
    }

    public static Object getAllCloneFromCache(){
        return cloneObj.values();
    }

}
