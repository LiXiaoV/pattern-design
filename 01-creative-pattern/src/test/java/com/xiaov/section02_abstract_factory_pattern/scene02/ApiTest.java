package com.xiaov.section02_abstract_factory_pattern.scene02;

import com.xiaov.section02_abstract_factory_pattern.scene00.CacheService;
import com.xiaov.section02_abstract_factory_pattern.scene02.factory.JDKProxy;
import com.xiaov.section02_abstract_factory_pattern.scene02.factory.impl.EGMCacheAdapter;
import com.xiaov.section02_abstract_factory_pattern.scene02.factory.impl.IIRCacheAdapter;
import com.xiaov.section02_abstract_factory_pattern.scene02.impl.CacheServiceImpl;
import org.junit.Test;

/**
 * @author xiaov
 * @since 2021-05-19 11:54
 */
public class ApiTest {

    @Test
    public void test_CacheService() throws Exception {
        CacheService proxy_EGM = JDKProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter());
        proxy_EGM.set("username","xiaov");
        String username = proxy_EGM.get("username");
        System.out.println("username = " + username);

        CacheService proxy_IIR = JDKProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
        proxy_IIR.set("username_iir","xiaov");
        String username_iir = proxy_IIR.get("username_iir");
        System.out.println("username_iir = " + username_iir);
    }
}
