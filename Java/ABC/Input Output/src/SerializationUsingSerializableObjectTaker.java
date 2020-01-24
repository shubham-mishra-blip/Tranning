import java.io.FileInputStream;
import java.io.ObjectInputStream;

class Demo1{
	String fname;
	String lname;
	
	public Demo1(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	void disp() {
		System.out.println(fname);
		System.out.println(lname);
	}
}
public class SerializationUsingSerializableObjectTaker {

	public static void main(String[] args) {
		try {
		FileInputStream fis = new FileInputStream("C:\\\\Users\\\\MONSTER\\\\GitProject\\\\Tranning\\\\Java\\\\ABC\\\\Input Output\\\\src\\\\objfile.txt");	
		ObjectInputStream ois = new ObjectInputStream(fis);
		Demo1 demo2 = (Demo1)(ois.readObject());
		demo2.disp();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
