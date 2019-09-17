import java.util.Scanner;

public class DublicateStringFinder1 {

        public static void main(String arg[])throws Exception
        {
            Scanner scan = new Scanner(System.in);
            String res = "";
            String word = scan.nextLine();
            while (word.length() > 0){
                int total=0;
                for (int i = 0; i<word.length();i++){
                    if (word.charAt(0) == word.charAt(i) ){
                        total   = total + 1;
                    }
                }
                res = res + word.charAt(0)+ " : "+ total+"\n";
                String [] fin = word.split(word.charAt(0)+ "");
                word = new String("");
                for (int j = 0; j<fin.length;j++){
                    word = word+fin[j];
                }
            }
            System.out.println(res);

        }
    }

