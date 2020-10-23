package com.pyb.pojo;

/**
 * @program: spring-study
 * @description:
 * @author: peng yu bin
 * @create: 2020-04-17 17:08
 */
public class Hello {
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
