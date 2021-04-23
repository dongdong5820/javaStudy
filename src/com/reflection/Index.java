package com.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author ranlay.su
 * @date 2021-04-23 9:44
 * @desc 反射 reflection
 */
public class Index {
    public static void main(String[] args) throws Exception{
        /*
        * 访问类的信息
        * getName, getSimpleName, getPackage...
        * */
        printClassInfo("".getClass());
        printClassInfo(Runnable.class);
        printClassInfo(java.time.Month.class);
        printClassInfo(String[].class);
        printClassInfo(int.class);

        /*
         * 访问字段
         * getField, getDeclaredField, getFields, getDeclaredFields...
         */
        Class stdClass = Student.class;
        System.out.println(stdClass.getField("score"));
        // 不能获取父类private修饰的字段
//        System.out.println(stdClass.getField("name"));
        System.out.println(stdClass.getDeclaredField("grade"));

        /*
        * Field类
        * getName, getType, getModifiers-修饰符
        * */
        Field f = stdClass.getDeclaredField("value");
        // "value"
        System.out.println(f.getName());
        // class [B 表示byte[]类型
        System.out.println(f.getType());
        int m = f.getModifiers();
        System.out.println(Modifier.isFinal(m));
        System.out.println(Modifier.isPublic(m));
        System.out.println(Modifier.isProtected(m));
        System.out.println(Modifier.isPrivate(m));
        System.out.println(Modifier.isStatic(m));

        /*
        * 字段值的获取和设置
        * get, set
        * */
        Person p = new Person();
        p.setName("xiao Ming");
        Class c = p.getClass();
        Field fn = c.getDeclaredField("name");
        // 设置访问修饰符为public
        fn.setAccessible(true);
        Object valueOfName = fn.get(p);
        System.out.println(valueOfName);
        fn.set(p, "Xiao Hong");
        System.out.println(p.getName());

    }

    /**
     * 访问类的信息
     * @param cls
     */
    static void printClassInfo(Class cls) {
        System.out.println("Class name: " + cls.getName());
        System.out.println("Simple name: " + cls.getSimpleName());
        if (cls.getPackage() != null) {
            System.out.println("Package name: " + cls.getPackage().getName());
        }
        System.out.println("is interface: " + cls.isInterface());
        System.out.println("is enum: " + cls.isEnum());
        System.out.println("is array: " + cls.isArray());
        System.out.println("is primitive: " + cls.isPrimitive());
        System.out.println("-----------------------");
    }
}

class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}

class Student extends Person {
    public int score;
    private int grade;
    private final byte[] value = new byte[]{1,2};
}
