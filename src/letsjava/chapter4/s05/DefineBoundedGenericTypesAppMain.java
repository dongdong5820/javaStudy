package letsjava.chapter4.s05;

import letsjava.chapter4.s05.define.MyGenericClassBounded;
import letsjava.chapter4.s05.ext.Children;

import java.lang.reflect.Field;

/**
 * @author ranlay.su
 * @date 2021-06-05 18:34
 */
public class DefineBoundedGenericTypesAppMain {
    public static void main(String[] args) throws NoSuchFieldException {
//        MyGenericClassBounded bounded = new MyGenericClassBounded("");
        MyGenericClassBounded bounded = new MyGenericClassBounded(new Children());
        Field field = MyGenericClassBounded.class.getDeclaredField("myType");
        System.out.println(field.getType());
    }
}
