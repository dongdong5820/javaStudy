package letsjava.chapter4.s08;

/**
 * @author ranlay.su
 * @date 2021-06-09 19:56
 */
public class CommonAnnotations implements TestIntf {
    // TODO 最常见的两个注解就是Override(继承)和Deprecated(丢弃)

    @Override
    public void test() {
        test_old();
    }

    @Deprecated
    public void test_old() {

    }
}
