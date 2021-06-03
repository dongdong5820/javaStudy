package letsjava.chapter4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * @author ranlay.su
 * @date 2021-06-02 9:52
 * @desc set集合
 */
public class UseSetAppMain {
    public static void main(String[] args) {
        printCollection(addElementToCollection(new HashSet()));
        printCollection(addElementToCollection(new ArrayList()));
    }

    public static Collection addElementToCollection(Collection collection) {
        for (int i = 0; i < 10; i++) {
            collection.add("str" + (i % 5));
        }

        return collection;
    }

    public static void printCollection(Collection collection) {
        System.out.println();
        System.out.println("输出" + collection.getClass() + "中的元素，共" + collection.size() + "个");
        try {
            for (Object element : collection) {
                System.out.println(element);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
