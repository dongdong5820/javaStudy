package letsjava.chapter4.s04;

import letsjava.chapter4.s04.define.MyGenericClass;
import letsjava.chapter4.s04.ext.GrandParent;
import letsjava.chapter4.s04.ext.Parent;

import java.lang.reflect.Field;

/**
 * @author ranlay.su
 * @date 2021-06-02 19:39
 * @desc
 */
public class DefineGenericTypesAppMain {
    public static void main(String[] args) throws NoSuchFieldException {
        Field field2 = MyGenericClass.class.getDeclaredField("first");
        System.out.println("first的类型是" + field2.getType());

        MyGenericClass<String, Object> test = new MyGenericClass<>("inst1", new Object());
        MyGenericClass<String, Object> test2 = new MyGenericClass<>("inst2", "aaabbb");

        String first = test.getFirst();
        System.out.println(first);
//        String second = test.getSecond(); // 会报错, 第二个是一个Object

        // TODO >> 方法的类型参数也是一样，换到了使用的地方做类型强制转换
        String another = test.getAnother("safe");
//        String another = test.getAnother(new Object());
//        String another = (String) test.getAnother(new Object());
        System.out.println(another);

        // TODO >> 如果泛型消息缺失了，编译器也无法帮助检查出类型不匹配，只能给出 unchecked 编译警告
        MyGenericClass mc = new MyGenericClass("", "");
        MyGenericClass<GrandParent, Parent> cast = mc;

        // TODO >> 会出错，因为cast指向的实例其实里面存的是两个String
//        GrandParent a = cast.getFirst();
        // TODO >> 只调用这个方法，不会出错
        cast.getFirst();
    }
}
