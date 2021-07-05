package letsjava.chapter2.s32;

/**
 * @author: Ranlay.su
 * @date: 2021-07-01 19:33
 * @version: 1.0
 */
public class LearnSystem {
    public static void main(String[] args) {
        long startMs = System.currentTimeMillis();

        int counter = 0;
        for (int i = 0; i < 1000; i++) {
            counter++;
        }

        long endMs = System.currentTimeMillis();
        System.out.println("程序执行使用了几个毫秒？" + (endMs - startMs));

        long startNS = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            counter++;
        }

        long endNs = System.nanoTime();
        System.out.println("程序执行使用了几个纳秒？" + (endNs - startNS));
    }
}
