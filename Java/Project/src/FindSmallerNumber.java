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

public class FindSmallerNumber {
    static int smallestNum(int num){
        String s = String.valueOf(num);
        int n = s.length();
        //Store each number in array
        char[] s1 = s.toCharArray();
        System.out.println(n);
        for (int i = num; i > 0; i --) {
            String s3 = String.valueOf(i);
            char[] c2 = s3.toCharArray();
            for (int m = 0; m < c2.length; m++) {
                for (int p = m+1; p < c2.length; p ++)
                if (c2[m] != s1[p]) {
                    String s2 = String.valueOf(i);
                    char[] c1 = s2.toCharArray();
                    for (int j = 0; j < c1.length; j++) {
                        for (int l = j + 1; l < c1.length; l++) {
                            if (c1[j] != c1[l]) {
                                System.out.println(i);
                                return i;
                            }
                        }
                    }
                }
            }
        }
    return -1;
    }
    public static void main(String[] args) {
        int num1 = 5921;

       int ll = smallestNum(num1);
        System.out.println(ll);
    }
}
