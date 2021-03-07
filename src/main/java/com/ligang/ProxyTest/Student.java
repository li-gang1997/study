package com.ligang.ProxyTest;


/**
 * @Author LiGang
 * @Date 2021/1/12 16:02
 * @Version 1.0
 */
public class Student implements StudentInterface{
    public void eat(String s) {
        System.out.println("学生吃" + s);
    }

    public void study() {
        System.out.println("在家学");
    }
}

