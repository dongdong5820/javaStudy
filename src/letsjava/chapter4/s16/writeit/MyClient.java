package letsjava.chapter4.s16.writeit;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import static letsjava.chapter4.s16.writeit.MyServer.MY_SERVER_PORT;

/**
 * @author ranlay.su
 * @date 2021-06-15 20:17
 */
public class MyClient {
    public static void main(String[] args) {
        commWithServer();
    }

    private static void commWithServer() {
        try (
            Socket s = new Socket("localhost", MY_SERVER_PORT);
        ) {
            MyChat myChat = new MyChat("服务器端", null, s);
            myChat.chatting();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
