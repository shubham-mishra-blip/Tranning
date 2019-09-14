import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DublicateStringFinder {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String:  ");
        String te1 = scan.nextLine();
        dubliChecker(te1);
    }

    public static void dubliChecker(String s1){
        char[] word = s1.toCharArray();
        HashMap<Character, Integer> CharCollect = new HashMap<Character, Integer>();
        for (Character ch:word){
            if (CharCollect.containsKey(ch)){
                CharCollect.put(ch, CharCollect.get(ch)+1);
            }else {
                CharCollect.put(ch, 1);
            }
        }
        Set<HashMap.Entry<Character,Integer>> dtset = CharCollect.entrySet();
        System.out.printf("List of all repleated word in %s %n",s1);
        for (HashMap.Entry<Character,Integer> data : dtset){
            if (data.getValue()> 1){
                System.out.printf("%s : %d %n", data.getKey() , data.getValue());
            }
        }

    }
}
