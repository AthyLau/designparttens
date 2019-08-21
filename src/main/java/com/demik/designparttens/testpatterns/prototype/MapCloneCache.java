package com.demik.designparttens.testpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/21 11:18 AM
 * @since JDK 1.8
 */
public class MapCloneCache {

    //可以自己定义规则来生成 String 的 key
    public static volatile Map<String, Object> cache;

    private MapCloneCache() {
    }

    public static Map<String, Object> initCache() {
        synchronized (MapCloneCache.class) {
            if (cache == null) {
                cache = new HashMap<>();
            } else {
                cache.clear();
            }
        }
        return cache;
    }

    public static boolean addCache(String key, Object value) {
        synchronized (MapCloneCache.class) {
            if (cache == null) {
                initCache();
            }
            cache.put(key, value);
            return true;
        }
    }

    public static boolean removeCache(String key) {
        synchronized (MapCloneCache.class) {
            if (cache == null) {
                initCache();
                return false;
            }
            cache.remove(key);
            return true;
        }
    }
}
