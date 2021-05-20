package com.xiaov.section02_abstract_factory_pattern.scene02.impl;

import com.xiaov.section02_abstract_factory_pattern.scene00.CacheService;
import com.xiaov.section02_abstract_factory_pattern.scene00.RedisUtils;

import java.util.concurrent.TimeUnit;

/**
 * @author xiaov
 * @since 2021-05-19 10:33
 */
public class CacheServiceImpl implements CacheService {

    private RedisUtils redisUtils = new RedisUtils();

    public String get(String key) {
        return redisUtils.get(key);
    }

    public void set(String key, String value) {
        redisUtils.set(key,value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key,value,timeout,timeUnit);
    }

    public void del(String key) {
        redisUtils.del(key);
    }
}
