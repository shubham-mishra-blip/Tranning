import javax.print.DocFlavor;
import java.util.Arrays;

public class Detectpangram {


    //*****1st Way*****
    static void pangram(char[] ch, String s2) {

        //Here we take a boolean variable and set value true by default
        boolean cc = true;

        //Here we make a string type array and then first we split the s2 which are comming from main methodand then store it
        String[] ss = s2.split(" ");

        //After that we can create a empty string
        String sc = "";

        //and then store all string from ss in sc
        for (String n : ss) {
            sc += n;
        }

        //then convert string into array.
        char[] cr = sc.toCharArray();

        //after that sort it.
        Arrays.sort(cr);

        //Here we can remove dublicate string whhich is taken after sorting
        int n = 0;
        for (int i = 0; i < cr.length - 1; i++) {
            if (cr[i] >= 'a' && cr[i] <= 'z' && cr[i] != cr[i + 1])
                cr[n++] = cr[i];
        }
        cr[n++] = cr[cr.length - 1];

        //Now, lastly print it.
        for(int i = 0; i <ch.length;i++) {
                    if (ch[i] == cr[i]) {
                        cc = true;
                    }
                    else {
                        cc = false;
                        break;
                    }

        }
        System.out.println(cc);
    }


    //2nd Way
    static void pangram1(String s1){
        for (char c = 'a'; c <='z'; c ++){
            if (!s1.toLowerCase().contains(""+c))
                System.out.println(false);
            else
                System.out.println("true");

        }
    }
    public static void main(String[] args) {
        String s1 = "The quick brown fox jumps over the lazy dog.#$$##$$$";
        String s2 = s1.toLowerCase();
        System.out.println(s2);
        char[] c= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        pangram(c,s2);                 // Method 1
        pangram1(s1);


    }
}
