package 杂;

import java.io.*;
import java.net.Socket;

public class socket {
    public static void main(String[] args) {

        try {
            Socket socket = new Socket("www.baidu.com",80);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer.write("GET / HTTP/1.1\nHost: www.baidu.com\n\n");
            writer.flush();
            String message;
            while ((message = reader.readLine())!=null){
                System.out.println(message);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
