import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class One_Way_Communication_Server {

    public static void main(String[] args) throws Exception{

        //1
        ServerSocket listerner = new ServerSocket(3000);
        System.out.println("Server Started");

        //3
        Socket ssoc = listerner.accept();

        //5
        InputStream is = ssoc.getInputStream();

        //7
        DataInputStream dis = new DataInputStream(is);

        //9
        String msg = dis.readUTF();
        System.out.println(msg);
    }
}
