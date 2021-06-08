package letsjava.chapter4.s06;

import letsjava.chapter4.s06.mylist.MyArrayList;

import java.util.Collection;

/**
 * @author ranlay.su
 * @date 2021-06-08 12:07
 * @desc 接口练习
 */
public class UseListAppMain {
    public static void main(String[] args) {
        printCollection(addElementsToCollection(new MyArrayList()));
    }

    public static Collection addElementsToCollection(Collection collection) {
        for (int i = 0; i < 10; i++) {
            collection.add("str" + (i % 5));
        }

        return collection;
    }

    public static void printCollection(Collection collection) {
        System.out.println("");
        System.out.println("输出" + collection.getClass() + "中的元素，共" + collection.size() + "个");
        for (Object element : collection) {
            System.out.println(element);
        }
    }
}
