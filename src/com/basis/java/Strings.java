package com.basis.java;

/**
 * @author ranlay.su
 * @date 2021-04-12 14:07
 * @desc 字符串类
 */
public class Strings {
    public static void main(String[] args) {
        // 用构造函数创建字符串
        String str = new String("Runoob");
        System.out.println(str);
        // String创建字符串
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = s1; // 相同引用
        String s4 = new String("Hello");
        String s5 = new String("World");
        System.out.println(s1 == s1); // true，相同引用
        System.out.println(s1 == s2); // true，s1和s2都在公共池中，引用相同
        System.out.println(s1 == s3); // true，s3和s1引用相同
        System.out.println(s1 == s4); // false，不同引用地址
        System.out.println(s4 == s5); // false，堆中不同引用地址
        // 区别： String创建的字符串存储再公共池中，而new创建的字符串再堆上
        System.out.println(s1.equals(s2)); // true，内容相同
        System.out.println(s1.equals(s4)); // true，内容相同
        System.out.println(s1.equals(s5)); // false，内容不相同

        // 字符串的长度
        String site = "forums.oneplus.com";
        System.out.println("网址长度：" + site.length());

        // 连接字符串 concat
        String ss1 = "菜鸟教程网址：";
        String ss2 = "www.runoob.com";
        System.out.println(ss1.concat(ss2));

        // 格式化字符串 printf, format
        float f = 1.2f;
        Integer i1 = 9;
        String str1 = "ranlay";
        System.out.printf("浮点型变量的值为 " +
                "%f, 整形变量的值为 " +
                "%d, 字符串变量的值为 " +
                "is %s", f, i1, str1);
        System.out.println();
        String fs;
        fs = String.format("浮点型变量的值为 " +
                "%f, 整形变量的值为 " +
                "%d, 字符串变量的值为 " +
                "is %s", f, i1, str1);
        System.out.println(fs);
    }
}
