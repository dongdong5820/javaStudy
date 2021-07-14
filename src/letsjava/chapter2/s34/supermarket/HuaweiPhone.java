package letsjava.chapter2.s34.supermarket;

/**
 * @author: Ranlay.su
 * @date: 2021-07-13 20:44
 */
public class HuaweiPhone extends PhoneExtendsMerchandise {
    public HuaweiPhone(String name, String id, int count, double soldPrice, double purchasePrice, double screenPrize, double cpuHZ, int memoryG, int storageG, String brand, String os) {
        super(name, id, count, soldPrice, purchasePrice, screenPrize, cpuHZ, memoryG, storageG, brand, os);
    }
}
