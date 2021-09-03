import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        String ip="127.0.0.1";
        int port=1234;
        System.out.println("готовимся к печати");
        try (Socket s = new Socket(ip, port)) {
            OutputStream out = s.getOutputStream();
            PrintWriter writer = new PrintWriter(out,true);
            String zplString = "^XA" +
                    "^BY2" +
                    "^FO0,200" +
                    "^FB632,2,0,c,0"+
                    "^ASN,60,60" +
                    "^fdHello, Dubki^FS" +
                    "^XZ";
            writer.println(zplString);
            writer.flush();
            System.out.println("Отправил на печать");
        }
    }
}
