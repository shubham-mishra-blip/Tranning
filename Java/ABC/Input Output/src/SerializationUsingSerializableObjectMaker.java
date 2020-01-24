import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo1 implements Serializable{
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
public class SerializationUsingSerializableObjectMaker {

	public static void main(String[] args) {
		
		Demo1 demo1 = new Demo1("Supriya", "Mishra");
		try {
		FileOutputStream fos = new FileOutputStream("C:\\Users\\MONSTER\\GitProject\\Tranning\\Java\\ABC\\Input Output\\src\\objfile.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(demo1);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		}
		

}
