package com.xiaov.section02_abstract_factory_pattern.scene02.factory;

import java.lang.reflect.Proxy;

/**
 * @author xiaov
 * @since 2021-05-19 11:40
 */
public class JDKProxy {

    public static <T> T getProxy(Class<T> interfaceClass,ICacheAdapter cacheAdapter) throws Exception{
        JDKInvocationHandler handler = new JDKInvocationHandler(cacheAdapter);
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class<?>[] classes = interfaceClass.getInterfaces();
        return (T) Proxy.newProxyInstance(classLoader,new Class[]{classes[0]},handler);
    }
}
