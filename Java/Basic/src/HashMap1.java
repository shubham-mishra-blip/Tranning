import java.util.HashMap;

public class HashMap1 {

    public static void main(String[] args) {

        String i = new String("HelloWorld");
        char[] text1 = i.toCharArray();
        for(int j=0;j<text1.length;j++){
            System.out.println(text1[j]);
        }
        HashMap<String, Integer> happy = new HashMap<String, Integer>();
        happy.put("Shubham", 1234);
        happy.put("Apple", 1223);
        System.out.printf("Ans1 %n"+happy.containsKey("Shubham"));
    }
}
