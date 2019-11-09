import java.lang.reflect.Array;
import java.util.Arrays;

public class DublicateStringFinder3 {
    public static void main(String[] args) {
        String s = "Hello";
        char c;
        int count= 1;
        char[] ar = s.toLowerCase().toCharArray();

        Arrays.sort(ar);

        for (int i = 0; i < ar.length; i ++){
            for (int j = i +1; j < ar.length; j ++){
                if (ar[i] == ar[j]){
                    count ++;
                }
            }
            System.out.println(ar[i]+" = "+count);
            if (count > 1){
                i += count-1;
            }
            count = 1;
        }
    }
}
