package com.xiaov.section02_abstract_factory_pattern.scene01;

import com.xiaov.section02_abstract_factory_pattern.scene01.impl.CacheServiceImpl;
import org.junit.Test;

/**
 * @author xiaov
 * @since 2021-05-19 10:51
 */
public class ApiTest {

    @Test
    public void test_CacheService(){

        CacheServiceImpl cacheService = new CacheServiceImpl();

        cacheService.set("username","xiaov",1);
        String username = cacheService.get("username", 1);
        System.out.println("username = " + username);

    }
}
