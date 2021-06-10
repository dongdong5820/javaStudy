package letsjava.chapter4.s09;

import java.util.function.Function;

/**
 * @author ranlay.su
 * @date 2021-06-10 9:53
 * @desc 有返回值的lambda
 */
public class LambdaWithReturnValue {
    public static void main(String[] args) throws Exception {
        String ret = randomData(String::valueOf);
        System.out.println(ret);

        String retException = randomDataWithExceptionHandling(String::valueOf);
        System.out.println(retException);
    }

    /**
     * 我有数据，你有代码吗？
     * @param converter
     * @return
     */
    public static String randomData(Function<Object, String> converter) {
        return converter.apply(Math.random());
    }

    /**
     * lambda如果有 checked exception 异常，那么接口必须允许。 在调用的地方，只要正常处理异常就可以了
     * @param converter
     * @return
     * @throws Exception
     */
    public static String randomDataWithExceptionHandling(ExceptionLambda<Object, String> converter) throws Exception {
        // TODO 就是正常的异常处理
        return converter.hasException(Math.random());
    }
}

interface ExceptionLambda<P,R> {
    /**
     * 抛出异常
     * @param p
     * @return
     * @throws Exception
     */
    R hasException(P p) throws Exception;
}
