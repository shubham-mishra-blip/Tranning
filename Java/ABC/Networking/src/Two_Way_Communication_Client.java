import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Two_Way_Communication_Client {

    public static void main(String[] args) throws Exception{

        //2nd Create a Socket to intract with server
        Socket csos = new Socket("localhost",3000);

        //4th Now get OutputStream
        OutputStream os = csos.getOutputStream();

        //6th get DataOutPutStream
        DataOutputStream dos = new DataOutputStream(os);

        //8th Now Talk input from user and send to server
        System.out.println("Server Started Send ANything");
        Scanner scan = new Scanner(System.in);
        String msg = scan.nextLine();

        dos.writeUTF(msg);


        InputStream is = csos.getInputStream();

        DataInputStream dis = new DataInputStream(is);

        msg = dis.readUTF();

        System.out.println(msg);
    }
}
