package com.xiaov.section02_abstract_factory_pattern.scene02.factory.impl;

import com.xiaov.section02_abstract_factory_pattern.scene00.matter.EGM;
import com.xiaov.section02_abstract_factory_pattern.scene02.factory.ICacheAdapter;

import java.util.concurrent.TimeUnit;

/**
 * @author xiaov
 * @since 2021-05-19 11:35
 */
public class EGMCacheAdapter implements ICacheAdapter {
    private EGM egm = new EGM();

    public String get(String key) {
        return egm.gain(key);
    }

    public void set(String key, String value) {
        egm.set(key,value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        egm.setEx(key,value,timeout,timeUnit);
    }

    public void del(String key) {
        egm.delete(key);
    }
}
