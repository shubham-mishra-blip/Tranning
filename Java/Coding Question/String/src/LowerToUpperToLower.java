
public class LowerToUpperToLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "tHIS iS mY pROGRAM";
		char c;
		
		for(int i = 0; i < s.length();i ++) {
			if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
				//System.out.print(s.toUpperCase().charAt(i));
				c = (char) (s.charAt(i)-32);
				System.out.print(c);
			}
			else if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
 				c = (char)(s.charAt(i)+32);
 				System.out.print(c);
			}
			else
				System.out.print(s.charAt(i));
		}
	}

}
