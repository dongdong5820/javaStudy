package letsjava.chapter4.s09;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ranlay.su
 * @date 2021-06-09 20:42
 */
public class IterateListLambdaWhereAppMain {
    public static void main(String[] args) {
        List<String> myList = addElementsToList(new ArrayList<>());
        myList.forEach(IterateListLambdaWhereAppMain::processString);
    }

    public static List<String> addElementsToList(List<String> list) {
        for (int i = 0; i < 10; i++) {
            list.add("str" + (i % 5));
        }

        return list;
    }

    private static void processString(String str) {
        throw new RuntimeException();
    }
}
