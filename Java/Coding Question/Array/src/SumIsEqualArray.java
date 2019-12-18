
public class SumIsEqualArray {

	public static void main(String[] args) {
		int[] ar = {0,1,2,3,4,5,6,7,8,5};
		int sum = 4;
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 1; j < ar.length; j++) {
				if (ar[i] + ar[j] == sum) {
					System.out.println(ar[i]+" + "+ar[j]);
				}
			}
		}
	}

}
