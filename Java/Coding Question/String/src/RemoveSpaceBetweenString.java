
public class RemoveSpaceBetweenString {

	public static void main(String[] args) {
		String s = "I love Java";
		
		for(int i = 0; i < s.length(); i ++) {
			if (s.charAt(i) != ' ') {     // or we can use 32 in place of ' '
				System.out.print(s.charAt(i));
			}
		}

	}

}
