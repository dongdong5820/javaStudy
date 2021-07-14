package letsjava.chapter2.s34;

import letsjava.chapter2.s34.supermarket.PhoneExtendsMerchandise;

/**
 * @author: Ranlay.su
 * @date: 2021-07-14 10:29
 */
public class UsePhoneMerchandise {
    public static void main(String[] args) {
        PhoneExtendsMerchandise phoneExtendsMerchandise = new PhoneExtendsMerchandise(
                "手机001", "Phone001", 100, 1999, 999,
                4.5, 3.5, 4, 128, "索尼", "安卓"
        );

        phoneExtendsMerchandise.describe();
        System.out.println("--------------------");
        phoneExtendsMerchandise.describePhone();
    }
}
