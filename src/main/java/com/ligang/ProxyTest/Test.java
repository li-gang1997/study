package com.ligang.ProxyTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        StudentInterface proxyStu = (StudentInterface) Proxy.newProxyInstance(student.getClass().getClassLoader(), new Class[]{StudentInterface.class}, new InvocationHandler() {
            //执行student类中所有方法都会经过invoke
            //对method方法进行判断
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getName().equals("study")) {
                    System.out.println("考研去");
                    return null;
                } else {
                    return method.invoke(student, args);
                }

            }
        });
        proxyStu.eat("米饭");
        proxyStu.study();
    }
}
