package com.basis.java;

/**
 * @author ranlay.su
 * @date 2021-04-15 23:40
 * @desc 数据类型
 */
public class PrimaryTypes {
    public static void main(String[] args) {
        // byte，占用1个byte
        byte byteVar = 100;
        System.out.println(byteVar);

        // short，占用2个byte
        short shortVar = 30000;
        System.out.println(shortVar);

        // int，占用4个byte
        int intVar = 100000000;
        System.out.println(intVar);

        // long，占用8个byte
        long longVar = 800000000L;
        System.out.println(longVar);

        // float，占用4个byte
        float floatVar = 100.00000666F;
        System.out.println(floatVar);

        // double，占用8个byte
        double doubleVar = 100.00000666;
        System.out.println(doubleVar);

        // boolean，占用1个byte
        boolean booleanVar = true;
        System.out.println(booleanVar);

        // char，占用2个byte
        char charVar = 'a';
        System.out.println(charVar);
    }
}
