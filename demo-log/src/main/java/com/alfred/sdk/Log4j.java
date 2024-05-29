package com.alfred.sdk;

/**
 * @author wuguang
 * @description
 * @date 2024/5/29 16:09
 */
public class Log4j implements Log{
    @Override
    public void log(String info) {
        System.out.println("log4j: " + info );
    }
}
