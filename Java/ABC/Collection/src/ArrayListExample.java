import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(45);
		al.add(78);
		al.add(35.4);
		al.add("Haha");
		al.add(true);
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(90);
		al1.addAll(al);
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println(al1);
	}

}
