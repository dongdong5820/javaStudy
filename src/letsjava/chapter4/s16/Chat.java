package letsjava.chapter4.s16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import static letsjava.chapter4.s16.SimpleServer.BYE;
import static letsjava.chapter4.s16.SimpleServer.SERVER_CHARSET;

/**
 * @author ranlay.su
 * @date 2021-06-15 20:22
 */
public class Chat {
    private String from;
    private String greetings;
    private Socket socket;

    public Chat(String from, String greetings, Socket socket) {
        this.from = from;
        this.greetings = greetings;
        this.socket = socket;
    }

    public void chatting() {
        Scanner in = new Scanner(System.in);

        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), SERVER_CHARSET));
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), SERVER_CHARSET));
        ) {
            System.out.println("socket连接成功！建立输入输出");
            if (greetings != null) {
                pw.println("你好，" + from + "。" + greetings);
                pw.flush();
            }
            while (true) {
                String line = br.readLine();
                if (line.trim().equalsIgnoreCase(BYE)) {
                    System.out.println("对方要求断开连接");
                    pw.println(BYE);
                    pw.flush();
                } else {
                    System.out.println("来自\"" + from + "\"的消息：" + line);
                }
                line = in.nextLine();
                pw.println(line);
                pw.flush();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println("聊天结束");
    }
}
