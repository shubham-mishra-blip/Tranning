import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class HW_ConversionApp_Server {

    public static void main(String[] args) throws Exception{

        ServerSocket listerner = new ServerSocket(3000);

        Socket ssos = listerner.accept();

        int i =5;

        while ( i > 0) {
            InputStream is = ssos.getInputStream();

            DataInputStream dis = new DataInputStream(is);

            String msg = dis.readUTF();

            System.out.println(msg);

            OutputStream os = ssos.getOutputStream();

            DataOutputStream dos = new DataOutputStream(os);

            Scanner scan = new Scanner(System.in);
            msg = scan.nextLine();
            dos.writeUTF(msg);
            i--;
        }
    }
}
