package com.ligang.exam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * @Author LiGang
 * @Date 2021/2/19 22:28
 * @Version 1.0
 */
public class Demo1 {
    public static void main(String[] args) {
        System.out.println("请输入数字,第一个是月份,第二个是日期");
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        boolean flag = isDate(date);
    }

    public static boolean isDate(String str) {
        boolean flag = true;
        // 判个字符串是否是 yyyy/MM/dd 格式的日期
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd");
        try {
            // 设置lenient为false，否则SimpleDateFormat会比较宽松地验证日期。 比如2007/02/29会被接受，并转换成2007/03/01
            sdf.parse(str);
        }catch (Exception e) {
            flag=false;
            e.printStackTrace();
        }
        return flag;
    }
}
