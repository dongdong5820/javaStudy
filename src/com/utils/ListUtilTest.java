package com.utils;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: Ranlay.su
 * @date: 2021-09-14 15:46
 * @description:
 * @version: 1.0.0
 */
public class ListUtilTest {
    public static void main(String[] args) {
        List<String> ml = getListWithString();
        List<List<String>> listChunk = ListUtil.listChunk(ml, 2);
        System.out.println(listChunk);

        ListUtil.removeDuplicate(ml);
        System.out.println(ml);
    }

    /**
     * 获取列表
     * @return
     */
    public static List<String> getListWithString() {
        List<String> list = new LinkedList<>();
        list.add("aa");
        list.add("bb");
        list.add("dd");
        list.add("cc");
        list.add("dd");
        list.add("ee");
        return list;
    }
}
