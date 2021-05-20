package com.xiaov.section02_abstract_factory_pattern.scene00;

import java.util.concurrent.TimeUnit;

/**
 * @author xiaov
 * @since 2021-05-19 10:24
 */
public interface CacheService {

    String get(final String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
