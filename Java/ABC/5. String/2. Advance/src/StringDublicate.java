/*
*
* Find Dublicate String from given String.
* */
import java.util.Scanner;

class DublicateChecker{
    void checking(String s1){
        int n = s1.length();     //5
        char[] ar = s1.toCharArray();  //[H,E,L,L,O]
        int count = 1;
        for (int i = 0; i < ar.length; i ++){
            for (int j = i+1; j < ar.length; j ++){
                if (ar[i] == ar[j]){
                    count ++;
                }
            }
            System.out.println(ar[i]+" = "+ count);
            count = 1;
        }
    }
}

public class StringDublicate {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

        System.out.println("Enter String");
        String s = scan.next();


        //1st Way (easy approch)
        for (int i = 0; i < s.length()-1; i ++) {
            for (int j = i+1; j < s.length(); j ++){
                if (s.charAt(j) == s.charAt(i)){
                    System.out.println(s.charAt(j));
                }
            }
        }

        //2nd Way
        DublicateChecker dublicateChecker = new DublicateChecker();
        dublicateChecker.checking(s);
    }
}
