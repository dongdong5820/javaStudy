package letsjava.chapter4.s15;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author ranlay.su
 * @date 2021-06-15 19:53
 * @desc 网络通讯名词
 */
public class ShowSocketClasses {
    public static void main(String[] args) throws UnknownHostException {
        ServerSocket ss = null;
        Socket s;
        InetAddress address = InetAddress.getByName("www.geekang.com");
        System.out.println(address);
    }
}
