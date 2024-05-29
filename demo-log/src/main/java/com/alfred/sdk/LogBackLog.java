package com.alfred.sdk;

/**
 * @author wuguang
 * @description
 * @date 2024/5/29 16:07
 */
public class LogBackLog implements Log {
    @Override
    public void log(String info) {
        System.out.println("logback: " + info);
    }
}
