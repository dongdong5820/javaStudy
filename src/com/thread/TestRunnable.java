package com.thread;

/**
 * @author ranlay.su
 * @date 2021-04-27 10:23
 * @desc 通过实现Runnable接口创建线程
 */
public class TestRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ":TestRunnable线程开始执行:");
        for (int i = 0; i < 5; i++) {
            System.out.println("实现Runnable接口线程执行：" + i);
        }
    }
}
