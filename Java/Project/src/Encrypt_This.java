/*
  Kata.encryptThis("Hello") => "72olle"
  Kata.encryptThis("good") => "103doo"
  Kata.encryptThis("hello world") => "104olle 119drlo"
 **/

public class Encrypt_This {
    static void secret(String text){
        char[] c = text.toCharArray();
        int i = (int)c[0];
        System.out.print(i);
        for (int j = c.length-1; j > 0; j -- ){
            System.out.print(c[j]);
        }
        System.out.println();

    }
    public static void main(String[] args) {

        String s = "Hello";
        secret(s);
    }
}
