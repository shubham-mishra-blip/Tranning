import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class HW_ConversionApp_Client {

    public static void main(String[] args) throws Exception{
        int i = 5;

        Socket csos = new Socket("localhost",3000);
        System.out.println("Now send request to server");

        while (i > 0) {
            OutputStream os = csos.getOutputStream();

            DataOutputStream dos = new DataOutputStream(os);

            Scanner scan = new Scanner(System.in);
            String msg = scan.nextLine();
            dos.writeUTF(msg);

            InputStream is = csos.getInputStream();

            DataInputStream dis = new DataInputStream(is);

            msg = dis.readUTF();
            System.out.println(msg);
            i --;
        }
    }
}
