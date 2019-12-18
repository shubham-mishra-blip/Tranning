import java.util.Arrays;

public class DublicateFinderMultiple {

	public static void main(String[] args) {
		int[] ar = {1,2,3,3,1,4,1,4,1,1,1};
		Arrays.sort(ar);
		
		for (int i = 0; i < ar.length-1; i++) {
			if (ar[i] == ar[i+1] && i == 0) {
				System.out.println(ar[i]);
			}
			else if (ar[i] == ar[i+1] && ar[i] != ar[i-1]) {
				System.out.println(ar[i]);
			}
		}
	}

}
