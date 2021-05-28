package letsjava.chapter2.ai;

import java.util.Scanner;

/**
 * @author ranlay.su
 * @date 2021-05-28 16:24
 * @desc
 */
public class AiAppMain {
    public static void main(String[] args) {
        System.out.println("请输入想说的话：");
        AI ai = new AI();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("再见");
                break;
            }

            String answer = ai.answer(input);
            System.out.println(answer);
        }
    }
}
