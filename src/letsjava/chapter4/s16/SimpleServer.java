package letsjava.chapter4.s16;

import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * @author ranlay.su
 * @date 2021-06-15 20:23
 */
public class SimpleServer {
    public static final int SERVER_PORT = 45632;
    public static final Charset SERVER_CHARSET = StandardCharsets.UTF_8;
    public static final String BYE = "bye";

    public static void main(String[] args) {
        commWithClient();
    }

    private static void commWithClient() {
        System.out.println("server端启动，在端口" + SERVER_PORT + "监听......");
        try (
            ServerSocket ss = new ServerSocket(SERVER_PORT);
            Socket s = ss.accept();
        ) {
            Chat chat = new Chat("客户端", "你已经成功连接到我。我们可以开始对话了。", s);
            chat.chatting();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println("程序退出");
    }
}
