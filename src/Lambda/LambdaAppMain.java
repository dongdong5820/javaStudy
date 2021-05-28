package Lambda;

import java.util.*;

/**
 * @author ranlay.su
 * @date 2021-05-28 17:07
 * @desc
 */
public class LambdaAppMain {
    public static void main(String[] args) {
        new Thread(
                () -> {
                    System.out.println("Hello");
                    System.out.println(" World");
                }
        ).start();

        System.out.println("------------");

        List<String> list = Arrays.asList("I","love","you","too");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
        Collections.sort(list, (s1, s2) -> {
            if (s1 == null) {
                return -1;
            }
            if (s2 == null) {
                return 1;
            }

            return s1.length() - s2.length();
        });
        System.out.println(list);

        System.out.println("------------");
        // 假设有一个字符串列表，需要打印出其中所有长度大于3的字符串.
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("I","love","you","too"));
        list1.forEach(str -> {
            if (str.length() > 3) {
                System.out.println(str);
            }
        });

        System.out.println("------------");
        // 假设有一个字符串列表，需要删除其中所有长度大于3的字符串。
        list1.removeIf(str -> str.length() > 3);
        System.out.println(list1);

        System.out.println("------------");
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("I","love","you","too"));
        // 假设有一个字符串列表，将其中所有长度大于3的元素转换成大写，其余元素不变。
        list2.replaceAll(str -> {
            if (str.length() > 3) {
                return str.toUpperCase();
            }
            return str;
        });
        System.out.println(list2);

        System.out.println("------------");
        // 假设有一个数字到对应英文单词的Map，请输出Map中的所有映射关系．
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.forEach((k ,v) -> System.out.println(k + "=" + v));

        System.out.println("------------");
        // 假设有一个数字到对应英文单词的Map，输出4对应的英文单词，如果不存在则输出NoValue
        System.out.println(map.getOrDefault(4, "NoValue"));
        System.out.println(map.getOrDefault(3, "NoValue"));

        map.putIfAbsent(4, "four");
        map.forEach((k, v) -> System.out.println(k + ":" + v));

        System.out.println("------------");
        // 假设有一个数字到对应英文单词的Map，请将原来映射关系中的单词都转换成大写．
        map.replaceAll((k, v) -> v.toUpperCase());
        map.forEach((k, v) -> System.out.println(k + "=>" + v));
    }
}
