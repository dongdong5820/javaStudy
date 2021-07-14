package letsjava.chapter2.s34.supermarket;

/**
 * @author: Ranlay.su
 * @date: 2021-07-13 20:25
 */
public class PhoneExtendsMerchandise extends MerchandiseV2 {
    // >> TODO java中只允许一个类有一个直接的父类，即所谓的单继承
    // >> TODO 别的类也可以继承子类，比如可以有一个HuaweiPhone继承PhoneExtendsMerchandise
    // >> TODO 但是子类并不能访问父类的private成员(包括方法和属性)

    // 给Phone增加新的属性和方法
    private double screenPrize;
    private double cpuHZ;
    private int memoryG;
    private int storageG;
    private String brand;
    private String os;

    public PhoneExtendsMerchandise(String name, String id, int count, double soldPrice, double purchasePrice, double screenPrize, double cpuHZ, int memoryG, int storageG, String brand, String os) {
        this.screenPrize = screenPrize;
        this.cpuHZ = cpuHZ;
        this.memoryG = memoryG;
        this.storageG = storageG;
        this.brand = brand;
        this.os = os;

        this.setName(name);
        this.setId(id);
        this.setCount(count);
        this.setSoldPrice(soldPrice);
        this.setPurchasePrice(purchasePrice);
    }

    public void describePhone() {
        System.out.println("此手机商品属性如下");
        describe();
        System.out.println("手机厂商为" + brand + "；系统为" + os + "；硬件配置如下：\n" +
                "屏幕：" + screenPrize + "寸\n" +
                "cpu主频：" + cpuHZ + "GHz\n" +
                "内存：" + memoryG + "Gb\n" +
                "存储空间：" + storageG + "Gb\n");
    }

    public boolean meetCondition() {
        return true;
    }

    public double getScreenPrize() {
        return screenPrize;
    }

    public void setScreenPrize(double screenPrize) {
        this.screenPrize = screenPrize;
    }

    public double getCpuHZ() {
        return cpuHZ;
    }

    public void setCpuHZ(double cpuHZ) {
        this.cpuHZ = cpuHZ;
    }

    public int getMemoryG() {
        return memoryG;
    }

    public void setMemoryG(int memoryG) {
        this.memoryG = memoryG;
    }

    public int getStorageG() {
        return storageG;
    }

    public void setStorageG(int storageG) {
        this.storageG = storageG;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}
