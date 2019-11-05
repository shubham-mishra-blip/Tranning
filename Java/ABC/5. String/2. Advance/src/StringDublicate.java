/*
*
* Find Dublicate String from given String.
* */

import java.util.Scanner;

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

    }
}
