import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		System.out.println(hm.isEmpty());   //true
		
		hm.put("name", "Shubham Mishra");
		hm.put("Course", "Python");
		
		hm.putIfAbsent("Course", "Java");
		
		System.out.println(hm);
		System.out.println(hm.containsKey("Course"));
		
		System.out.println("I am "+hm.get("name")+" and I am doing "+hm.get("Course")+" Course");
		
		System.out.println(hm.size());
		
	}

}
