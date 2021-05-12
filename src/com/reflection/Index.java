package com.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author ranlay.su
 * @date 2021-04-23 9:44
 * @desc 反射 reflection
 */
public class Index {
    public static void main(String[] args) throws Exception{
        /**
        * 访问类的信息
        * getName, getSimpleName, getPackage...
        * */
        printClassInfo("".getClass());
        printClassInfo(Runnable.class);
        printClassInfo(java.time.Month.class);
        printClassInfo(String[].class);
        printClassInfo(int.class);

        /**
         * 同一个类实例化的对象，都只有同一个Class对象
         */
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Class c1 = p1.getClass();
        Class c2 = p2.getClass();
        Class c3 = p3.getClass();
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());

        /**
         * 访问字段
         * Field getField(name)：根据字段名获取某个public的field（包括父类）
         * Field getDeclaredField(name)：根据字段名获取当前类的某个field（不包括父类）
         * Field[] getFields()：获取所有public的field（包括父类）
         * Field[] getDeclaredFields()：获取当前类的所有field（不包括父类）
         */
        Class stdClass = Student.class;
        System.out.println(stdClass.getField("score"));
        // 不能获取父类private修饰的字段
//        System.out.println(stdClass.getField("name"));
        System.out.println(stdClass.getDeclaredField("grade"));

        /**
         * Field类
         * getName()：返回字段名称，例如，"name"；
         * getType()：返回字段类型，也是一个Class实例，例如，String.class；
         * getModifiers()：返回字段的修饰符，它是一个int，不同的bit表示不同的含义。
         */
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

        /**
        * 字段值的获取和设置
        * Field.get(Object)
        * Field.set(Object, Object)
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

        /**
         * 调用方法
         * Method getMethod(name, Class...)：获取某个public的Method（包括父类）
         * Method getDeclaredMethod(name, Class...)：获取当前类的某个Method（不包括父类）
         * Method[] getMethods()：获取所有public的Method（包括父类）
         * Method[] getDeclaredMethods()：获取当前类的所有Method（不包括父类）
         */
        // 获取public方法getScore,参数为String
        System.out.println(stdClass.getMethod("getScore", String.class));
        // 获取继承的public方法getName，无参数
        System.out.println(stdClass.getMethod("getName"));
        // 获取private方法getGrade,参数为int
        System.out.println(stdClass.getMethod("getGrade", int.class));

        /**
         * Method对象
         * getName()：返回方法名称，例如："getScore"；
         * getReturnType()：返回方法返回值类型，也是一个Class实例，例如：String.class；
         * getParameterTypes()：返回方法的参数类型，是一个Class数组，例如：{String.class, int.class}；
         * getModifiers()：返回方法的修饰符，它是一个int，不同的bit表示不同的含义。
         * invoke(object,object...) 调用方法
         */
        String s = "Hello world";
        Method sm = String.class.getMethod("substring", int.class);
        // 在s对象上调用该方法并获取结果
        String r = (String) sm.invoke(s, 6);
        System.out.println(r);
        // 调用静态方法 : invoke第一个参数永远为null
        Method im = Integer.class.getMethod("parseInt", String.class);
        Integer i = (Integer) im.invoke(null, "123456");
        System.out.println(i);
        // 调用非public方法，需用Method.setAccessible(true)
        Student st = new Student();
        Method pm = st.getClass().getDeclaredMethod("setGrade", int.class);
        pm.setAccessible(true);
        pm.invoke(st, 3);
        System.out.println(st.getGrade());
        // 多态
        Method h = p.getClass().getMethod("hello");
        // 调用Student的hello()方法
        h.invoke((new Student()));
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

    public String getName() {
        return this.name;
    }

    public void hello() {
        System.out.println("Person: hello");
    }
}

class Student extends Person {
    public int score;
    private int grade;
    private final byte[] value = new byte[]{1,2};

    public int getScore(String type) {
        return 99;
    }

    public int getGrade() {
        return this.grade;
    }

    public int getGrade(int year) {
        return 1;
    }

    private void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * 重写父类方法
     */
    @Override
    public void hello() {
        System.out.println("Student: hello");
    }
}
