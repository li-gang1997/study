package com.ligang.SingleObjectTest;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @Author LiGang
 * @Date 2021/1/12 14:53
 * @Version 1.0
 */
public class SingleObject {

    ////创建 SingleObject 的一个对象
    private static SingleObject singleObject=new SingleObject();

    //让构造函数为 private，这样该类就不会被实例化
    private SingleObject() {
    }

    //获取唯一可用对象
    public static SingleObject getSingleObject() {
        return singleObject;
    }

    public void show(){
        System.out.println("Hello SingleObject");
    }
}

class demo{
    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getSingleObject();
        singleObject.show();
    }
}
