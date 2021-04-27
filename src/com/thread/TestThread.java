package com.thread;

/**
 * @author ranlay.su
 * @date 2021-04-27 9:55
 * @desc 通过继承Thread类创建线程
 */
public class TestThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +":线程运行...");
        for (int i = 0; i < 5; i++) {
            System.out.println("这是线程执行代码: " + i);
        }
    }
}
