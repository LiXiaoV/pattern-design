package com.xiaov.section02_abstract_factory_pattern.scene00.matter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * @author xiaov
 * @since 2021-05-19 10:30
 */
public class IIR {

    private Logger logger = LoggerFactory.getLogger(IIR.class);

    private Map<String,String> dataMap = new ConcurrentHashMap<String, String>();

    public String get(String key){
        logger.info("IIR获取数据 key：{}", key);
        return dataMap.get(key);
    }

    public void set(String key,String value){
        logger.info("IIR写入数据 key：{} val：{}", key, value);
        dataMap.put(key,value);
    }

    public void setExpire(String key, String value, long timeout, TimeUnit timeUnit){
        logger.info("IIR写入数据 key：{} val：{} timeout：{} timeUnit：{}", key, value, timeout, timeUnit.toString());
        dataMap.put(key,value);
    }

    public void del(String key){
        logger.info("IIR删除数据 key：{}", key);
        dataMap.remove(key);
    }
}
