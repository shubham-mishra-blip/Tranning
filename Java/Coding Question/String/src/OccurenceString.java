import java.util.Arrays;

public class OccurenceString {

	static String dubliRemover(String s) {
		char[] c = s.toCharArray();
		StringBuffer sb = new StringBuffer();
		Arrays.sort(c);
		for (int i = 0; i < s.length()-1; i++) {
			if (c[i] != c[i+1]) {
				sb.append(c[i]);
			}
		}
		sb.append(c[c.length-1]);
		return sb.toString();
	}
	
	static int occurence(String s, String ss) {
		int count = 0;
		for(int i = 0; i < ss.length(); i++) {
			for(int j = 0 ; j < s.length(); j ++) {
				if (ss.charAt(i) == s.charAt(j)) {
					++ count;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "mississilloo";
		String s2 = "issiill";
		
		String s3 = dubliRemover(s1);
		String s4 = dubliRemover(s2);
		
		int i = occurence(s3, s4);
		
		System.out.println(i);
		
	}

}
