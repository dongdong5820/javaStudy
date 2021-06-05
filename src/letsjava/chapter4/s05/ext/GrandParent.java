package letsjava.chapter4.s05.ext;

/**
 * @author ranlay.su
 * @date 2021-06-05 15:33
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
