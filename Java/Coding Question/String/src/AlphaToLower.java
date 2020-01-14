
public class AlphaToLower {

	public static void main(String[] args) {
		
		String s = "THIS is nothing to explain";
		char c;
		
		for(int i = 0; i < s.length(); i ++) {
			if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
 				c = (char)(s.charAt(i)+32);
 				System.out.print(c);
			}
			else
				System.out.print(s.charAt(i));
		}

	}

}
