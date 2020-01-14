import java.util.Scanner;

public class NumberToBinaryEasy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println(i);
		
		String s = Integer.toBinaryString(i);
		
		System.out.println(s);

	}

}
