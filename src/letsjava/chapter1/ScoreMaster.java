package letsjava.chapter1;

import java.util.Scanner;

/**
 * @author ranlay.su
 * @date 2021-04-25 19:51
 * @desc 数组灵活处理成绩
 */
public class ScoreMaster {
    public static void main(String[] args) {
        // 声明六个变量，分别代表六门科目的成绩
        int yuWenIndex = 0;
        int shuXueIndex = 1;
        int waiYuIndex = 2;
        int wuLiIndex = 3;
        int huaXueIndex = 4;
        int shengWuIndex = 5;

        int totalScoreCount = 6;

        // 每门课的名字
        String[] names = new String[totalScoreCount];
        names[yuWenIndex] = "语文";
        names[shuXueIndex] = "数学";
        names[waiYuIndex] = "外语";
        names[wuLiIndex] = "物理";
        names[huaXueIndex] = "化学";
        names[shengWuIndex] = "生物";

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入共有多少年的成绩：");

        int yearCount = scanner.nextInt();

        double[][] scores = new double[yearCount][totalScoreCount];

        // 初始化每年各科成绩
        for (int i = 0; i < yearCount; i++) {
            for (int j = 0; j < totalScoreCount; j++) {
                scores[i][j] = 80 + Math.random() * 20;
            }
        }
        // 打印出所有成绩
        for (int i = 0; i < totalScoreCount; i++) {
            System.out.print(names[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < yearCount; i++) {
            for (int j = 0; j < totalScoreCount; j++) {
                System.out.print(scores[i][j] + "\t");
            }
            System.out.println();
        }

        boolean cont = true;
        while (cont) {
            System.out.println("请选择要进行的操作：");
            System.out.println("1：求某年最好成绩\n" +
                    "2：求某年的平均成绩\n" +
                    "3：求所有年份最好成绩\n" +
                    "4：求某门课历年最好成绩\n" +
                    "0：退出程序");

            int oprtId = scanner.nextInt();

            int year = 0 ;
            switch (oprtId) {
                case 0: {
                    cont = false;
                    System.out.println("用户主动结束程序。");
                    break;
                }
                case 1:{
                    // 让用户输入指定的年份
                    System.out.println("请输入要计算第几年的最好成绩");
                    year = scanner.nextInt();
                    if (year <=0 || yearCount < year) {
                        System.out.println("非法的年份：" + year);
                        cont = false;
                        break;
                    }
                    year = year - 1;
                    // 指定年份最好成绩的编号，默认是0
                    int bestOfYearScoreId = 0;
                    for (int i = 1; i < totalScoreCount; i++) {
                        if (scores[year][bestOfYearScoreId] <= scores[year][i]) {
                            bestOfYearScoreId = i;
                        }
                    }
                    System.out.println("第" + (year+1) + "年成绩最好的科目为：" + names[bestOfYearScoreId]
                            + "，成绩：" + scores[year][bestOfYearScoreId] + "。");
                    break;
                }
                case 2:{
                    System.out.println("请输入要计算第几年度的平均成绩");
                    year = scanner.nextInt();
                    if (year <=0 || yearCount < year) {
                        System.out.println("非法的年份：" + year);
                        cont = false;
                        break;
                    }
                    year = year - 1;
                    double totalCountForAvg = 0;
                    for (int i = 0; i < totalScoreCount; i++) {
                        totalCountForAvg += scores[year][i];
                    }
                    double avgOfYear = totalCountForAvg / totalScoreCount;
                    System.out.println("第" + (year+1) + "年的平均成绩为" + avgOfYear + "。");
                    break;
                }
                case 3:{
                    int bestYear = 0;
                    int bestScore = 0;
                    for (int i = 0; i < yearCount; i++) {
                        for (int j = 0; j < totalScoreCount; j++) {
                            if (scores[bestYear][bestScore] <= scores[i][j]) {
                                bestYear = i;
                                bestScore = j;
                            }
                        }
                    }
                    System.out.println("所有年度最好成绩为：第" + (bestYear+2) + "年的"
                            + names[bestScore] + "，成绩为：" + scores[bestYear][bestScore] + "。");
                    break;
                }
                case 4:{
                    System.out.println("请输入科目编号");
                    int subjectId = scanner.nextInt();
                    if (subjectId <=0 || totalScoreCount < subjectId) {
                        System.out.println("非法的科目编号：" + subjectId);
                        cont = false;
                        break;
                    }
                    subjectId = subjectId - 1;
                    year = 0;
                    for (int i = 0; i < yearCount; i ++) {
                       if (scores[year][subjectId] <= scores[i][subjectId]) {
                           year = i;
                       }
                    }
                    System.out.println("第" + (year+1) + "年度" + names[subjectId]
                            + "成绩最好，为" + scores[year][subjectId] + "。");
                    break;
                }
                default:
                    cont = false;
                    System.out.println("不支持操作：" + oprtId + "，程序结束。");
            }
        }
    }
}
