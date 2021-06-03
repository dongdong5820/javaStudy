package letsjava.chapter4.define;

/**
 * @author ranlay.su
 * @date 2021-06-02 10:02
 * @desc 定义泛型： 就是把需要的类型定义在类后面的尖括号里，然后在类里面就可以把定义好的泛型像符号一样使用
 */
public class MyGenericClass<First, Second> {
    // >> TODO 这两个引用都是 Object 类型
    private First first;
    private Second second;

    public MyGenericClass(First first, Second second) {
        this.first = first;
        this.second = second;
    }

    public First getFirst() {
        return first;
    }

    public void setFirst(First first) {
        this.first = first;
    }

    public Second getSecond() {
        return second;
    }

    public void setSecond(Second second) {
        this.second = second;
    }

    /**
     * @desc 方法里面定义泛型
     * @param val
     * @param <Another>
     * @return
     */
    public <Another> Another getAnother(Object val) {
        return (Another) val;
    }
}
