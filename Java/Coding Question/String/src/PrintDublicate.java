import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PrintDublicate {

	public static void main(String[] args) {
		String s= "Shubham Mishra";		
		char[] characters  = s.toLowerCase().toCharArray();
		Map<Character, Integer> charMap = new HashMap<>();
		for(Character c :characters) {
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
			}
			else
				charMap.put(c, 1);
		}
		for(Map.Entry<Character, Integer> enter : charMap.entrySet()) {
			if (enter.getValue() > 1) {
				System.out.println(enter.getKey()+" -> "+enter.getValue());
			}
		}
	}

}
