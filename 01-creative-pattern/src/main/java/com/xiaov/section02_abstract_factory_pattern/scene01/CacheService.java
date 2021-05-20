package com.xiaov.section02_abstract_factory_pattern.scene01;

import java.util.concurrent.TimeUnit;

/**
 * @author xiaov
 * @since 2021-05-19 10:37
 */
public interface CacheService {

    String get(final String key, int redisType);

    void set(String key, String value, int RedisType);

    void set(String key, String value, long timeout, TimeUnit timeUnit, int redisType);

    void del(String key, int redisType);
}
