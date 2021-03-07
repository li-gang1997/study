package com.ligang.CglibProxy;

import com.ligang.ProxyTest.Student;
import com.ligang.ProxyTest.StudentInterface;

public class Test {
    public static void main(String[] args) {
        StudentInterface studentInterface = StudentsCglibTest.createCglibProxy(Student.class);
//        System.out.println(studentInterface);
        studentInterface.study();
    }
}
