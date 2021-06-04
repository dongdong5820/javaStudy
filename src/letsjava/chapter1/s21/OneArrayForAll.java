package letsjava.chapter1.s21;

import java.util.Scanner;

/**
 * @author ranlay.su
 * @date 2021-04-21 20:50
 * @desc 多维数组保存成绩
 */
public class OneArrayForAll {
    public static void main(String[] args) {
        // 声明六个变量，分别代表六门科目的成绩
        int yuWenIndex = 0;
        int shuXueIndex = 1;
        int waiYuIndex = 2;
        int wuLiIndex = 3;
        int huaXueIndex = 4;
        int shengWuIndex = 5;

        // 每门课的名字
        String[] names = new String[6];
        names[yuWenIndex] = "语文";
        names[shuXueIndex] = "数学";
        names[waiYuIndex] = "外语";
        names[wuLiIndex] = "物理";
        names[huaXueIndex] = "化学";
        names[shengWuIndex] = "生物";

        Scanner in = new Scanner(System.in);
        System.out.println("请输入共有多少年的成绩：");
        int yearCount = in.nextInt();

        // 二维数组
        double[][] scores = new double[yearCount][names.length];
        for (int i = 0; i < yearCount; i++) {
            for (int j = 0; j < names.length; j++) {
                scores[i][j] = 80 + Math.random() * 20;
            }
        }

        System.out.println("请问要查看第几年的成绩？");
        int yearToUse = in.nextInt() - 1;

        System.out.println("请问要查看第几科的成绩？");
        int scoreToUser = in.nextInt() - 1;

        System.out.println("第" + (yearToUse + 1) +
                "年的第" + (scoreToUser + 1) + "门的成绩是"
                + scores[yearToUse][scoreToUser]);
    }
}
