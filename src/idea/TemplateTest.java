package idea;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 1、IDEA中代码模板位置：
 * 系统级别: file -> setting -> Editor -> General -> Postfix Completion
 * 自定义: file -> setting -> Editor -> Live Templates
 * 2、常用模板
 */
public class TemplateTest {
    // 模板六： prsf => private static final
    private static final int NUM = 10;
    // 变形： psf
    public static final int NUM2 = 20;
    // 变形： psfi / psfs
    public static final int NUM3 = 30;
    
    // 生成的模板演示2： pric
    /**
     * 客户的id
     */
    private int id = 1;
    
    // 生成的模板演示3： prsc
    /**
     * 客户地址
     */
    private String destination = "";

    // 模板一: main
    public static void main(String[] args) {
        // 模板二:  sout
        System.out.println("hello");
        // 变形: soutp / soutm / soutv / xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplateTest.main");
        int num1 = 10;
        int num2 = 20;
        System.out.println("num2 = " + num2);
        System.out.println(num1);

        // 模板三： fori
        String[] arr = new String[]{"tom","Herry","HanMeimei","Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("---------------");
        // 变形: iter
        for (String s : arr) {
            System.out.println(s);
        }
        // 变形: itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        // 模板四： list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        for (Object o : list) {
            
        }
        //  变形：list.fori 普通数组遍历
        for (int i = 0; i < list.size(); i++) {
            
        }
        // 变形： list.forr 普通数组遍历(倒序)
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
    }

    public void method() {
        System.out.println("TemplateTest.method");

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        // 模板五: ifn(if null)
        if (list == null) {

        }
        // 变形： inn(if not null)
        if (list != null) {

        }
        // 变形： xxx.nn / xxx.null
        if (list != null) {

        }
        if (list == null) {

        }
    }

    // 生成的模板演示1 test
    public void testUpdate(){

    }
}
