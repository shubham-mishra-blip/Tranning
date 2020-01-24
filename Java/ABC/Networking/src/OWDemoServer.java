import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class OWDemoServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			ServerSocket listerner = new ServerSocket(6000);
			
			Socket ssoc = listerner.accept();
			
			InputStream is = ssoc.getInputStream();
			
			DataInputStream dis = new DataInputStream(is);
			
			System.out.println(dis.readUTF());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
