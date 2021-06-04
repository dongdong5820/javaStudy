package letsjava.chapter2.s09;

import letsjava.chapter2.s09.supermarket.Merchandise;

/**
 * @author ranlay.su
 * @date 2021-05-20 20:43
 */
public class MerchandiseV2DescAppMain {
    public static void main(String[] args) {
        Merchandise merchandise = new Merchandise();
        merchandise.name = "书桌";
        merchandise.soldPrice = 999.9;
        merchandise.purchasePrice = 500;
        merchandise.count = 40;
        merchandise.id = "DEK458975";
        merchandise.describe();
    }
}
