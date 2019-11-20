import javax.xml.crypto.Data;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Two_Way_Communication_Server {

    public static void main(String[] args) throws Exception {

        //1st Start the server to intract with client
        ServerSocket listerner = new ServerSocket(3000);
        System.out.println("Server Started");

        //3rd Create a socket between server to client to accept there request
        Socket ssos = listerner.accept();

        //5th Now get InputStream
        InputStream is = ssos.getInputStream();

        //7th get DataInputStream
        DataInputStream dis = new DataInputStream(is);

        //9th read query comming from client
        String msg = dis.readUTF();

        System.out.println(msg);

        OutputStream os = ssos.getOutputStream();

        DataOutputStream dos = new DataOutputStream(os);

        Scanner scan = new Scanner(System.in);
        msg = scan.nextLine();

        dos.writeUTF(msg);
    }
}
