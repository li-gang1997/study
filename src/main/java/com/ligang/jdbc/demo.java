package com.ligang.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @Author LiGang
 * @Date 2021/1/12 13:27
 * @Version 1.0
 */
public class demo {
    public static void main(String[] args) throws Exception {
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //获取链接
        Connection connection = DriverManager.getConnection("jdbc:mysql://ip地址:3306/db1", "用户名", "密码");
        //获取执行者对象
        Statement statement = connection.createStatement();
        //执行sql语句返回结果
        String sql ="SELECT * FROM user";
        ResultSet resultSet = statement.executeQuery(sql);
        //处理结果
        while (resultSet.next()){
            System.out.println(resultSet.getInt("id")+ resultSet.getInt("name"));
        }
        //释放资源
        resultSet.close();
        statement.close();
        connection.close();
    }
}
