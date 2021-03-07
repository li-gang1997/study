package com.ligang;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class demo01 {
    public static void main(String[] args) {
//        LocalDate today = LocalDate.now();
//        Date date = new Date();
//        System.out.println(date);
//        System.out.println(today);
//
//        System.out.println("-------------------");
//        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        String dateStr = today.format(fmt);
//        System.out.println(dateStr);


//        String str = "2019-03-03";
//        //指定转换格式
//        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        //进行转换
//        LocalDate date = LocalDate.parse(str, fmt);
//        System.out.println(date);


//        LocalDate now = LocalDate.now();//年月日
//        System.out.println(now);
//        LocalDate date1 = LocalDate.of(2020, 12, 7);
//        System.out.println(date1);

//        LocalDateTime now1 = LocalDateTime.now();
//        System.out.println(now1);//年月日,会打印出时分秒

//        LocalDate date2 = LocalDate.of(2020, 2, 4);
//        Period between = Period.between(date1, date2);
//        long l = date1.toEpochDay();
//        System.out.println(l);//打印出18603
//        System.out.println("杨思怡比李钢大"+(date1.toEpochDay()-date2.toEpochDay())+"天");
        //获取jvm线程管理MXbean
//        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
//        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
//
//        for (ThreadInfo threadInfo : threadInfos) {
//            System.out.println("[" + threadInfo.getThreadId() + "]" + threadInfo.getThreadName());
//        }

        //统计一个字符串中字符出现的次数
        String test ="         李钢李明杨思怡李文新            123    567";
        char[] chars = test.toCharArray();
        int count=0;
        for (char c : chars) {
            if (String.valueOf(c).equals("李")){
                count++;
            }
        }
        System.out.println(count);
//        String replace = test.replace("杨", "李");
//        System.out.println(replace);
        String trim = test.trim();
        System.out.println(trim);
        System.out.println(test);
    }
}
