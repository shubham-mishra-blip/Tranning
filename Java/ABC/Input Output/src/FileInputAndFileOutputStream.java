import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputAndFileOutputStream {

    public static void main(String[] args) throws IOException {

        //1st Step taking path of file
        String path1 = "C://Users//ASUS//IdeaProjects//Tranning//Java//ABC//Input Output//src//input1.txt";
        String path2 = "C://Users//ASUS//IdeaProjects//Tranning//Java//ABC//Input Output//src//output1.txt";

//        File f1 = new File(path1);
//        File f2 = new File(path2);


        //2nd Step Creating object of FileInputStream & FileOutputStream
        //fos or fis transfer only 1 byte of data. Its means they hits many time on hardisk during fetching or writing data on harddisk
        //THIS IS NOT A EFFICIENT WAY TO FETCH OR SEND DATA FROM ONE FILE TO ANOTHER.
        FileInputStream fis = new FileInputStream(path1);
        FileOutputStream fos = new FileOutputStream(path2);

        int temp;

        //Here check input in not empty or after how much word they will empty using -1.
        //-1 indicate ending of character

        while((temp = fis.read()) != -1){
            fos.write(temp);
        }
    }
}
