import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class OWDemoClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket csoc = new Socket("localhost", 6000);
			
			OutputStream os = csoc.getOutputStream();
			
			DataOutputStream dos = new DataOutputStream(os);
			
			System.out.println("Enter message");
			Scanner scan = new Scanner(System.in);
			
			String msg = scan.nextLine();
			dos.writeUTF(msg);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
