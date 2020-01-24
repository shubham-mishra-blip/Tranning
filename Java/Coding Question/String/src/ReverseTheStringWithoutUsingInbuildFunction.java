
public class ReverseTheStringWithoutUsingInbuildFunction {

	static String reverse(String s) {
		String s1 = "";
		for(int i = s.length()-1; i >= 0; i --) {
			s1 += s.charAt(i);
		}
		return s1;
	}
	public static void main(String[] args) {
		String s = "I am Gabbar";
		String s1 = reverse(s);
		System.out.println(s1);

	}

}
