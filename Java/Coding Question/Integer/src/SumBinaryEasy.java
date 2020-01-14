
public class SumBinaryEasy {

	public static void main(String[] args) {
		int n = 27;
		String s1 = Integer.toBinaryString(n);
		int sum = 0;
		for (int i = 0; i < s1.length(); i++) {
			sum += Integer.parseInt(String.valueOf(s1.charAt(i)));
		}
		System.out.println(sum);

	}

}
