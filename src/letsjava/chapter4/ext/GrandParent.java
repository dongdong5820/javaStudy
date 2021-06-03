package letsjava.chapter4.ext;

/**
 * @author ranlay.su
 * @date 2021-06-02 10:09
 * @desc
 */
public class GrandParent {
    private int num;

    public GrandParent(int num) {
        this.num = num;
    }

    public GrandParent() {
        this(-1);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
