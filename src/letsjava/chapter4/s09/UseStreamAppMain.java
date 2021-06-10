package letsjava.chapter4.s09;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static letsjava.chapter4.s09.IterateListLambdaAppMain.addElementsToList;

/**
 * @author ranlay.su
 * @date 2021-06-10 10:04
 * @desc 使用stream
 */
public class UseStreamAppMain {
    public static void main(String[] args) {
        List<String> myList = addElementsToList(new ArrayList<>());
        System.out.println("-------lambda的奥义--------");
        // TODO lambda 的奥义是使用lambda一个接着一个处理，不要听，一路处理下去，直到业务结束
        // TODO 理性来说，lambda结构对计算优化是友好的；感性的说，这种方式会产生一种没，让人莫名感到舒适
        myList.stream().filter(s -> s.length() > 4).map(String::toUpperCase).forEach(System.out::println);

        // TODO 当然也可以使用collector让数据重新生成一个List
        System.out.println("-------使用collector--------");
        List<String> longgerList = myList.stream().filter(s -> s.length() > 4).map(String::toUpperCase).collect(Collectors.toList());
        longgerList.forEach(System.out::println);
    }
}
