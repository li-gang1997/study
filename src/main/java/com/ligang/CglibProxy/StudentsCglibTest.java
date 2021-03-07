package com.ligang.CglibProxy;

import com.ligang.ProxyTest.StudentInterface;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author LiGang
 * @Date 2021/1/13 13:11
 * @Version 1.0
 */
public class StudentsCglibTest {
    public static StudentInterface createCglibProxy(Class clazz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                System.out.println("增强前");
                Object ret = methodProxy.invokeSuper(obj, args);
                System.out.println("增强后");
//                System.out.println(obj.getClass());
                return ret;
            }
        });
        return (StudentInterface) enhancer.create();
    }
}

