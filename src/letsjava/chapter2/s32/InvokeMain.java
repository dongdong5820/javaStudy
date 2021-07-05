package letsjava.chapter2.s32;

/**
 * @author: Ranlay.su
 * @date: 2021-07-01 19:31
 * @version: 1.0
 */
public class InvokeMain {
    public static void main(String[] args) {
        System.out.println("进入了InvokeMain的main方法");
        LearnMain.main(args);
        System.out.println("InvokeMain的main方法执行结束");
    }
}
