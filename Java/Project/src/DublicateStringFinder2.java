import java.util.Objects;
import java.util.Scanner;

public class DublicateStringFinder2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        char[] word = s1.toCharArray();
        int total = 0;
        for (int i = 0;i<word.length; i++){
            for (int j = i+1; j<word.length;j++){
                if (Objects.equals(word[i],word[j])){
                    System.out.println(word[j]);
                }

            }
        }


    }
}
