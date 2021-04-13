package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author ranlay.su
 * @date 2021-04-13 9:41
 * @desc
 */
public class ExcepTest
{
    public static void main(String[] args)
    {
        // 捕获异常 try...catch
        try {
            int[] a = new int[2];
            System.out.println("Access element three: " + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception throw: " + e);
        }
        System.out.println("Out of the block");

        // 多重捕获 try...catch..catch
        try {
            String fileName = "xxx.txt";
            FileInputStream file = new FileInputStream(fileName);
            byte x = (byte) file.read();
            System.out.println(x);
        } catch (FileNotFoundException f) {
            f.printStackTrace();
        } catch (IOException i) {
            i.printStackTrace();
        }

        // finally关键字
        int[] b = new int[2];
        try {
            System.out.println("Access element three: " + b[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception throw: " + e);
        } finally {
            b[0] = 6;
            System.out.println("First element value: " +b[0]);
            System.out.println("The finally statement is executed");
        }
    }
}
