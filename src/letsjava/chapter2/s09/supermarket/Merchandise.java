package letsjava.chapter2.s09.supermarket;

/**
 * @author ranlay.su
 * @date 2021-04-26 20:53
 * @desc 商品类
 */
public class Merchandise {
    public String name;
    public String id;
    public int count;
    public double soldPrice;
    public double purchasePrice;

    /**
     * 描述
     */
    public void describe(){
        double netIncome = soldPrice - purchasePrice;
        System.out.println("商品名字叫做" + name +
                ", id是" + id +
                ", 商品售价是" + soldPrice +
                ", 商品进价是" + purchasePrice +
                ", 商品库存量是" + count +
                ", 销售一个毛利润是" + netIncome);
    }
}
