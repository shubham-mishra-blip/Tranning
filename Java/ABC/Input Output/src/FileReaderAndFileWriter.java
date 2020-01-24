import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderAndFileWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path1 = "C:\\Users\\MONSTER\\GitProject\\Tranning\\Java\\ABC\\Input Output\\src\\input1.txt";
		String path2 = "C:\\Users\\MONSTER\\GitProject\\Tranning\\Java\\ABC\\Input Output\\src\\output3.txt";
		
		try {
			FileReader fr = new FileReader(path1);
			FileWriter fw = new FileWriter(path2);
			
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			
			int temp;
			while((temp = br.read()) != -1) {
				bw.write(temp);
			}
			bw.flush();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
