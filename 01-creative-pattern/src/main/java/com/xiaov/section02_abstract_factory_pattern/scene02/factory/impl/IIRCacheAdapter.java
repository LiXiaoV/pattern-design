package com.xiaov.section02_abstract_factory_pattern.scene02.factory.impl;

import com.xiaov.section02_abstract_factory_pattern.scene00.matter.IIR;
import com.xiaov.section02_abstract_factory_pattern.scene02.factory.ICacheAdapter;

import java.util.concurrent.TimeUnit;

/**
 * @author xiaov
 * @since 2021-05-19 11:38
 */
public class IIRCacheAdapter implements ICacheAdapter {
    private IIR iir = new IIR();

    public String get(String key) {
        return iir.get(key);
    }

    public void set(String key, String value) {
        iir.set(key,value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        iir.setExpire(key,value,timeout,timeUnit);
    }

    public void del(String key) {
        iir.del(key);
    }
}
