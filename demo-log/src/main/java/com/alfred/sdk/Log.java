package com.alfred.sdk;

/**
 * @author wuguang
 * @description
 * @date 2024/5/29 16:06
 */
public interface Log {
    /**
     * JDK spi : 通过java.util.ServiceLoader#PREFIX = 'META-INF/Service' 加载
     * @param info
     */
    void log(String info);
}
