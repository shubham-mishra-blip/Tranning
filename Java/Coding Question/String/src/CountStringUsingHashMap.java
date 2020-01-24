import java.util.*;

public class CountStringUsingHashMap {

	public static void main(String[] args) {
		String s = "This is nothing but nothing is always something";
		String[] s1 = s.split(" ");
		HashMap<String, Integer> map = new HashMap<>();
		for(int i = 0; i < s1.length; i ++) {
			if (map.containsKey(s1[i])) {
				int j = map.get(s1[i]);
				map.put(s1[i], j+1);
			}
			else
				map.put(s1[i], 1);
		}
		System.out.println(map);
	}

}
