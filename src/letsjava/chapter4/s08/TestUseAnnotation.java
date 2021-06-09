package letsjava.chapter4.s08;

/**
 * @author ranlay.su
 * @date 2021-06-09 19:41
 * @desc 测试使用注解
 */
public class TestUseAnnotation {
//    @PrimaryProperty(defaultValue = "testbggg", targetClass = TestUseAnnotation.class,
//    abc = 9, defaultValues = {"aaa","bbb"})
    private Object abc;

    @Deprecated
    @PrimaryProperty(defaultValue = "testbggg", targetClass = TestUseAnnotation.class,
            abc = 9, defaultValues = {"aaa","bbb"})
    public void test() {

    }
}
