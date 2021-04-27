package com.thread;

/**
 * @author ranlay.su
 * @date 2021-04-27 9:55
 * @desc 多线程
 * 1、创建线程示例 new Thread()
 * 2、调用线程示例的start()，程序会自动调用线程类的run()方法
 */
public class Index {
    public static void main(String[] args) {
        // 通过继承Thread创建线程
//        Thread t0 = new TestThread();
//        t0.start();
//        System.out.println("=============1");
//        System.out.println("=============2");
//        System.out.println("=============3");

        // 通过实现Runnable接口创建线程
//        Thread t1 = new Thread(new TestRunnable());
        Thread t1 = new Thread(new TestRunnable(), "myThread");
        t1.start();
        System.out.println("=============1");
        System.out.println("=============2");
        System.out.println("=============3");


    }
}
