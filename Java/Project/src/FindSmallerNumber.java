/*
* Wap in java whch takes a integer as input and output the nextsmaller number to the input number
* that does't containany digit present in input and without repeating any digit.
*
*   eg - i/p - 5921
*        o/p - 4876
*
*          or
*       i/p - 673
*       o/p - 598
* */

import java.util.Scanner;

public class FindSmallerNumber {
    static boolean matching(String a, String b){
        for (int i = 0; i < a.length(); i ++){
            for (int j = 0; j < a.length(); j ++) {
                if (a.charAt(i) == b.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean selfCheck(String s2){
        for (int i = 0; i < s2.length(); i ++){
            for (int j = i+1; j < s2.length(); j ++) {
                if (s2.charAt(i) == s2.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
    static void smallestNum(int num){
        String s = String.valueOf(num);
        System.out.println(s);
        for (int i = num-1; i >= 0; i --){
            String s1 = String.valueOf(i);
            boolean c;
            boolean b =  matching(s,s1);

            if(b == true) {
                c = selfCheck(s1);
                if(c == true){
                    System.out.println(s1);
                    System.exit(0);
                }
            }


        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number");
        int num1 = scan.nextInt();

     smallestNum(num1);

    }
}
