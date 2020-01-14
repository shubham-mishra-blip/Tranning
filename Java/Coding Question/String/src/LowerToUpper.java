
public class LowerToUpper {

	public static void main(String[] args) {
		String s = "wHAT IS tHIS bro!!";
		char c;
		
		for(int i = 0; i < s.length(); i ++) {
			if (s.charAt(i) >= 96 && s.charAt(i) <= 122) {
				//System.out.print(s.toUpperCase().charAt(i));
				c = (char) (s.charAt(i)-32);
				System.out.print(c);
			}
			else
				System.out.print(s.charAt(i));
		}
	}

}
