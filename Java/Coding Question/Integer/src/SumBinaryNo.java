
public class SumBinaryNo {
	private static int sum = 0;

	public static int toBinarySum(int n) {
		
		int temp = 0;
		if (n != 0) {
			temp = n%2;
			 n = n/2;
			 sum += temp;
			toBinarySum(n);
		}
		return sum;
	}

	public static void main(String[] args) {
		int  i = 27;
		int j = toBinarySum(i);
		System.out.println(j);
	}

}
