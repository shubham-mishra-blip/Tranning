import java.util.StringTokenizer;

public class StringTokenizerPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hi, My name is Shubham. I am from Earth";
		StringTokenizer s1 = new StringTokenizer(str);
		System.out.println(s1.countTokens());
		
		//want to remove special symbol from string
		StringTokenizer s2 = new StringTokenizer(str,",.!");
		while (s2.hasMoreTokens()) {
			System.out.print(s2.nextToken());			
		}
	}

}
