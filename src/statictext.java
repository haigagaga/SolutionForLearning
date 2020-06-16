import java.io.IOException;
import java.net.Socket;

public class statictext {


    public static void main(String[] args) {
        System.out.println(i  + ""+System.currentTimeMillis());


    }

    static int i = 0;
    static {
        i++;
        System.out.println(i  + "     static    "+System.currentTimeMillis());
    }
}
