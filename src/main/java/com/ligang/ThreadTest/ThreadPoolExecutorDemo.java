package com.ligang.ThreadTest;

import java.util.Date;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorDemo {

    private static final int CORE_POOL_SIZE = 5;
    private static final int MAX_POOL_SIZE = 10;
    private static final int QUEUE_CAPACITY = 100;
    private static final Long KEEP_ALIVE_TIME = 1L;

    public static void main(String[] args) {
        //使⽤阿⾥巴巴推荐的创建线程池的⽅式
        //通过ThreadPoolExecutor构造函数⾃定义参数创建
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                CORE_POOL_SIZE,
                MAX_POOL_SIZE,
                KEEP_ALIVE_TIME,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(QUEUE_CAPACITY),
                new ThreadPoolExecutor.CallerRunsPolicy());
        for (int i = 0; i < 10; i++) {
            //创建WorkerThread对象（WorkerThread类实现了Runnable 接⼝）
            Runnable worker = new MyRunnable("" + i);
            //执⾏Runnable
            executor.execute(worker);
        }
        //终⽌线程池
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
    }
}

/**
 *这是⼀个简单的Runnable类，需要⼤约5秒钟来执⾏其任务。
 *我们在代码中模拟了 10 个任务，我们配置的核⼼线程数为 5 、等待队列容量为 100 ，所以每次
 * 只可能存在 5 个任务同时执⾏，剩下的 5 个任务会被放到等待队列中去。当前的 5 个任务之⾏完
 * 成后，才会之⾏剩下的 5 个任务。
 */
class MyRunnable implements Runnable {

    private String command;

    public MyRunnable(String s) {
        this.command = s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Start.Time = " + new Date());
        processCommand();
        System.out.println(Thread.currentThread().getName() + " End.Time = " + new Date());
    }

    private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return this.command;
    }

}
