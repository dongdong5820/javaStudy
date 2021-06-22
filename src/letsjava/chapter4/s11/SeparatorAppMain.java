package letsjava.chapter4.s11;

import java.io.File;

/**
 * @author ranlay.su
 * @date 2021-06-22 9:45
 * @desc 分隔符
 */
public class SeparatorAppMain {
    public static void main(String[] args) {
        System.out.println("文件路径分隔符：" + File.separator);
        System.out.println("环境变量分隔符：" + File.pathSeparator);
    }
}
