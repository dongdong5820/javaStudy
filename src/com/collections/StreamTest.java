package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author: Ranlay.su
 * @date: 2021-09-14 14:43
 * @description: Stream(单管道流) 和 parallelStream(多管道流) 比较
 * @version: 1.0.0
 */
public class StreamTest {
    public static void main(String[] args) {
        List<Integer> source = buildIntRange();

        // 传统方式遍历
        long start = System.currentTimeMillis();
        for (int i=0; i < source.size(); i++) {
            try {
                TimeUnit.MILLISECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("传统方式遍历耗时：" + (System.currentTimeMillis() - start) + "ms");
        System.out.println("=======================");

        // 单管道stream
        start = System.currentTimeMillis();
        source.stream().forEach(item -> {
            try {
                TimeUnit.MILLISECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println("单管道stream遍历耗时：" + (System.currentTimeMillis() - start) + "ms");
        System.out.println("=======================");

        // 多管道parallelStream
        start = System.currentTimeMillis();
        source.parallelStream().forEach(item -> {
            try {
                TimeUnit.MILLISECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println("多管道parallelStream遍历耗时：" + (System.currentTimeMillis() - start) + "ms");
    }

    public static List<Integer> buildIntRange() {
        int count = 60000;
        List<Integer> numbers = new ArrayList<>(5);
        for (int i = 0 ; i < count; i++) {
            numbers.add(i);
        }
        return Collections.unmodifiableList(numbers);
    }
}
