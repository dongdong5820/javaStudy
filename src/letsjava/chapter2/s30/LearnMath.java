package letsjava.chapter2.s30;

import java.util.Random;

/**
 * @author ranlay.su
 * @date 2021-05-27 21:02
 * @desc Math类学习 : https://docs.oracle.com/javase/8/docs/api/
 */
public class LearnMath {
    public static void main(String[] args) {
        // >>> 我们调用的都是 Math 里的静态方法，Math的构造函数就是private的，意味着不能创建Math类的实例
        System.out.println(Math.random());
        System.out.println("----------");

        // >>> 原来归根结底，Math的random是用的Random类来实现的。它在java.util包里
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            System.out.println(random.nextInt());
        }
        System.out.println("----------");

        System.out.println(Math.abs(-9));

        System.out.println(Math.round(-9.2));
        System.out.println(Math.round(-9.5));
        System.out.println(Math.round(-9.8));
        System.out.println(Math.round(9.2));
        System.out.println(Math.round(9.5));
        System.out.println(Math.round(9.8));
    }
}
