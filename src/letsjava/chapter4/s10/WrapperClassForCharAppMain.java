package letsjava.chapter4.s10;

/**
 * @author ranlay.su
 * @date 2021-06-12 12:48
 * @desc char的装箱和拆箱
 */
public class WrapperClassForCharAppMain {
    public static void main(String[] args) {
        // TODO char对应的类为Character,里面有很多isXXX方法。比如判断字符是否为数字
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('字'));
        System.out.println(Character.isDigit('0'));
        System.out.println(Character.isDigit('9'));
    }
}
