package com.basis.java;

/**
 * 数组
 */
public class ShuZu {
    public static void main(String[] args) {
        // 数组申明
        int[] a1;
        // 数组申明并初始化
        int[] a2 = new int[4];  // 申明并初始化有4个元素的整形数组[0,0,0,0]
        int[] a3 = new int[]{1,3,9,5,6,4};   // 申明并初始化元素值

        // 数组取值
        System.out.println(a2[0]);
        System.out.println(a3[4]);

        // 数组的最大值，最小值，总和，平均值
        int[] a4 = new int[]{2,5,9,7,3,4,8};
        int max = a4[0], min = a4[0];
        int sum = 0;
        for (int i=0; i<a4.length; i++) {
            // 最大值
            if (max < a4[i]) {
                max = a4[i];
            }
            // 最小值
            if (min > a4[i]) {
                min = a4[i];
            }
            // 总和
            sum += a4[i];
        }
        System.out.println("最大值：" + max);
        System.out.println("最小值：" + min);
        System.out.println("总和：" + sum);
        System.out.println("平均值：" + (sum / a4.length));

        // 数组的复制(注意不是赋值)
        int[] a5 = new int[a4.length];
        for (int i=0; i<a4.length; i++) {
            a5[i] = a4[i];
        }
        System.out.println("复制后得到数组的值：");
        for (int i=0; i<a5.length; i++) {
            System.out.println(a5[i]);
        }

        // 数组的反转
        int[] a6 = new int[a4.length];
        int k = 0;
        for (int i=a4.length-1; i>=0; i--) {
            a6[k] = a4[i];
            k++;
        }
        System.out.println("反转后得到的数组：");
        for (int i=0; i<a6.length; i++) {
            System.out.println(a6[i]);
        }

        // 数组的排序
    }
}
