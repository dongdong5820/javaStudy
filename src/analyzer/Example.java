package analyzer;

import java.util.ArrayList;

/**
 * @author: Ranlay.su
 * @date: 2022-05-27 19:31
 * @description: 内存泄漏测试
 * @version: 1.0.0
 */
public class Example {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        while (true) {
            list.add(new User());
//            break;
        }
//        System.out.println(11);
    }
}

class User {
    private String name="demo";

    public User() {
    }
}
