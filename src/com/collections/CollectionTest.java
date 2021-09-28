package com.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Ranlay.su
 * @date: 2021-09-14 20:33
 * @description: 集合测试
 * @version: 1.0.0
 */
public class CollectionTest {
    public static void main(String[] args) {
        Integer i = 1;
        String s = "aa";
        System.out.println(Integer.highestOneBit(12));

        Map<Integer, String> hm = new HashMap<>();
        hm.put(12, "丽丽");
        hm.put(9, "菲菲");
        hm.put(12, "明明");
        hm.put(8, "娜娜");
        hm.put(2, "萱萱");
        System.out.println(hm.size());
        System.out.println(hm);

    }
}
