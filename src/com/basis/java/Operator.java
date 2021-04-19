package com.basis.java;

/**
 * @author ranlay.su
 * @date 2021-04-19 20:22
 * @desc 运算符
 */
public class Operator {
    public static void main(String[] args) {
        /**
         * 运算符的优先级(从上到下，依次递减)
         * ()
         * !
         * *,/,%
         * +,-
         * >,>=,<,<=
         * ==
         * !==
         * &,&&,|,||
         * =
         * 总结：
         * 1) 等号优先级最低
         * 2) 布尔运算符低于比较运算符
         * 3) 比较运算符低于算数运算符
         */

        int a = 05;  // 八进制
        int b = 011; // 八进制
        int c = 0xF; // 十六进制
        int d = 0x11; // 十六进制

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        /**
         * 按位运算符
         * 按位并(AND): &
         * 按位或(OR): |
         * 按位异或(XOR): ^
         * 按位取反: ~
         */
        // 二进制的 1111 1000
        int a1 = 0xF8;
        // 二进制的 1111 0100
        int b1 = 0xF4;
        // 二进制的 1111 1111
        int c1 = 0xFF;
        System.out.println(a1 & b1);
        System.out.println(a1 | b1);
        System.out.println(a1 ^ b1);
        System.out.println(~c1);

        /**
         * 位移运算符
         */
        int a2 = 16;
        a2 >>= 2;
        System.out.println(a2);

        /**
         * 自动类型转换
         * 数值精度顺序:  double>float>long>int>short>byte
         */
        int intVal = 99;
        long longVar = intVal;
        System.out.println(longVar);
        float floatVar = 11.32f;
        double doubleVar = floatVar;
        System.out.println(doubleVar);
        int a3 = 99;
        double b3 = 5;
        System.out.println(a3 / b3);

        /**
         * 强制类型转换
         */
        int intVal1 = 99;
        long longVar1 = 19999;
        intVal1 = (int) longVar1;
        System.out.println(intVal1);

        /**
         * 转移字符
         */
        String content = "a\tb\"\tcc\tee";
        String align = "1111222233334444";
        System.out.println(content);
        System.out.println(align);

        /**
         * 字符串拼接
         */
        int aa = 10;
        int bb = 20;
        System.out.println("a + b=" + aa + bb);
        System.out.println("a + b=" + (aa + bb));
        System.out.println("a * b=" + aa * bb);
    }
}
