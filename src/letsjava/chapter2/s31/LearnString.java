package letsjava.chapter2.s31;

/**
 * @author ranlay.su
 * @date 2021-05-28 10:15
 * @desc String 学习
 */
public class LearnString {
    public static void main(String[] args) {
        String content = "01234567ABCDefgh";

        // String的length()是个方法不是属性哦， 获取字符串长度
        System.out.println(content.length());

        // 生成了一个新的String对象，转换成大写，小写
        System.out.println(content.toUpperCase());
        System.out.println(content.toLowerCase());

        // content指向对象的内容并没有变化
        System.out.println(content);

        // 返回当个字符串
        System.out.println(content.charAt(1));
//        System.out.println(content.charAt(99));

        // 字符串截取
        System.out.println(content.substring(5));
        System.out.println(content.substring(1,5));

        System.out.println("-----------------");

        content = "Orange_Apple_Banana";
        // 字符串转换成char 列表
        char[] chars = content.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        // 字符串切割，类似php的 explode()
        String[] s = content.split("_");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

        // 查找位置
        int indexOf = content.indexOf("_");
        System.out.println(indexOf);
        System.out.println(content.substring(indexOf + 1, content.length()));
        int lastIndexOf = content.lastIndexOf("_");
        System.out.println(lastIndexOf);
        System.out.println(content.substring(0, lastIndexOf));

        // 判断是否包含子串
        System.out.println(content.contains("apple"));
        System.out.println(content.contains("Apple"));
        System.out.println(content.contains("Orange"));
        System.out.println(content.contains("Banana"));

        String content2 = "Orange_Apple_Banana";
        String content3 = "   orange_Apple_banana   ";
        // TODO 两个String对象比较是否相等，一定要用equals方法
        System.out.println(content.equals(content2));
        System.out.println(content.equals(content3));

        // 截取左右空格
        System.out.println(content3);
        System.out.println(content3.trim());
        System.out.println(content.equalsIgnoreCase(content3.trim()));
    }
}
