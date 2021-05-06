package com.annotion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author ranlay.su
 * @date 2021-05-06 20:10
 * @desc 自定义注解测试
 */
public class Test01 {
    /**
     *  注解可以显示赋值。 如果没有默认值，则必须给注解赋值
     */
    @MyAnnotation(age=18, name="xiaoming")
    public void  test(){

    }

    @MyAnnotation2("哈哈哈")
    public void test2() {

    }
}

/**
 * @author 604847
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    // 注解的参数 : 参数类型 + 参数名 + () [default value];
    String name() default "";
    int age();
    int id() default -1; // 如果默认值为-1，代表不存在。
    String[] schools() default {"华中农业大学","北京大学"};
}

/**
 * @author 604847
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2 {
    String value();  // 当只有一个参数时，用value做参数名，注解可省略参数名
}