package letsjava.chapter4.s08;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author ranlay.su
 * @date 2021-06-09 19:42
 * @desc 自定义注解 annotation : 需要@interface，实际上这个接口会继承Annotation接口
 * @Target 注解标注 可以被用在哪个/哪些元素上
 * @Retention 注解标注 注解会被留存在哪个阶段
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface PrimaryProperty {
    // >> TODO annotation支持的类型有基本数据类型, Class, String, 枚举, 其他注解, 以上类型的数组
    // TODO 可以指定缺省值
    String defaultValue() default "N/A";

    Class targetClass();

    int abc();

    String[] defaultValues();

    // TODO 注解类型的缺省值
    Override is() default @Override;
}
