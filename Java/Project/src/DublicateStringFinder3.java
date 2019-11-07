import java.lang.reflect.Array;
import java.util.Arrays;

public class DublicateStringFinder3 {
    public static void main(String[] args) {
        String s = "Hello";
        char c;
        int count= 1;
        char[] ar = s.toLowerCase().toCharArray();

        for (int i = 0; i < ar.length; i++)
        {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] > ar[j])
                {
                    c = ar[i];
                    ar[i] = ar[j];
                    ar[j] = c;
                }
            }
        }


        for (int i = 0; i < ar.length; i ++){
            for (int j = i+1; j < ar.length; j ++){
                if(ar[i] == ar[j]) {
                    count++;
                }

            }
            System.out.println(ar[i]+"="+count);
        }
    }
}
