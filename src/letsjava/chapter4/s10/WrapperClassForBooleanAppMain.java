package letsjava.chapter4.s10;

/**
 * @author ranlay.su
 * @date 2021-06-12 12:43
 * @desc boolean的装箱和拆箱
 */
public class WrapperClassForBooleanAppMain {
    public static void main(String[] args) {
        // TODO boolean对应的类为Boolean,布尔值因为只有两个值，所以Boolean类直接提供了这两个值的静态变量
        System.out.println("--------静态变量---------");
        System.out.println(Boolean.TRUE);
        System.out.println(Boolean.FALSE);

        System.out.println("--------valueOf---------");
        // TODO 只有不分大小写的true才是true，剩下的字符串都是false
        System.out.println(Boolean.valueOf("true"));
        System.out.println(Boolean.valueOf("TRue"));
        System.out.println(Boolean.valueOf("false"));
        System.out.println(Boolean.valueOf("addf"));
        System.out.println(Boolean.valueOf(" true "));
    }
}
