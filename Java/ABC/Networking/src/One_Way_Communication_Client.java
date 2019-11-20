import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class One_Way_Communication_Client {

    public static void main(String[] args) throws Exception {

        //2
        Socket csos = new Socket("localhost", 3000);

        //4
        OutputStream os = csos.getOutputStream();

        //6
        DataOutputStream dos = new DataOutputStream(os);

        //8
        System.out.println("Send Anything");
        Scanner scan = new Scanner(System.in);

        String ss = scan.nextLine();

        dos.writeUTF(ss);

    }
}
