import java.io.*;

public class HW_Take_Input_File {
    public static void main(String[] args) throws IOException {

        String path1 = "C://Users//ASUS//IdeaProjects//Tranning//Java//ABC//Input Output//src//HW_Take_Input_File_Input.txt";
        String path2 = "C://Users//ASUS//IdeaProjects//Tranning//Java//ABC//Input Output//src//HW_Take_Input_File_output.txt";

        FileReader fis = new FileReader(path1);
        FileWriter fw = new FileWriter(path2);
        int num=0;

        int temp;

        while ((temp = fis.read()) != -1){
            num = temp;
        }

        System.out.println((char) num);
    }
}
