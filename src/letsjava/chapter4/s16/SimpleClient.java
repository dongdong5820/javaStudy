package letsjava.chapter4.s16;

import java.net.Socket;

import static letsjava.chapter4.s16.SimpleServer.SERVER_PORT;

/**
 * @author ranlay.su
 * @date 2021-06-15 20:23
 */
public class SimpleClient {
    public static void main(String[] args) {
        commWithServer();
    }

    private static void commWithServer() {
        try (
            Socket socket = new Socket("localhost", SERVER_PORT);
        ) {
            Chat chat = new Chat("服务器端", null, socket);
            chat.chatting();
        } catch (Exception ex ) {
            ex.printStackTrace();
        }

        System.out.println("程序退出");
    }
}
