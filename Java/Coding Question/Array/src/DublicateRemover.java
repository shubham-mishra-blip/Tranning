import java.util.Arrays;

public class DublicateRemover {

	public static void main(String[] args) {
		int[] ar = {1,1,4,3,5,3,2,5,6,3};
		int[] ar1 = new int[ar.length];
		Arrays.sort(ar);
		
		for (int i = 0; i < ar.length-1; i++) {
			for (int j = i+1; j < ar1.length; j++) {
				if (ar[i] == ar[j]) {
					break;
				}
				else
					ar1[i] = ar[i];
			}
		}
		for (int i = 0; i < ar1.length; i++) {
			if(ar1[i] != 0)
			System.out.print(ar1[i]+", ");
		}
		System.out.println();
	}

}
