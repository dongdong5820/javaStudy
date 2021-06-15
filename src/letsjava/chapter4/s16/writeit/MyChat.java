package letsjava.chapter4.s16.writeit;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import static letsjava.chapter4.s16.writeit.MyServer.BYE;
import static letsjava.chapter4.s16.writeit.MyServer.MY_COMMON_CHARSET;

/**
 * @author ranlay.su
 * @date 2021-06-15 20:03
 */
public class MyChat {
    private String from;
    private String greeting;
    private Socket s;

    public MyChat(String from, String greeting, Socket s) {
        this.from = from;
        this.greeting = greeting;
        this.s = s;
    }

    public void chatting() {
        Scanner in = new Scanner(System.in);
        try (
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(s.getInputStream(), MY_COMMON_CHARSET)
                );
                PrintWriter pw = new PrintWriter(
                        new OutputStreamWriter(s.getOutputStream(), MY_COMMON_CHARSET)
                );
        ) {
            if (greeting != null) {
                pw.println(greeting);
                pw.flush();
            }
            while (true) {
                String line = br.readLine();
                if (line.equalsIgnoreCase(BYE)) {
                    pw.println(BYE);
                    break;
                } else {
                    System.out.println(from + ":" + line);
                    String myword = in.nextLine();
                    pw.println(myword);
                    pw.flush();
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
