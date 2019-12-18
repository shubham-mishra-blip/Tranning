
public class FindSmallAndBigUnSorted {

	public static void main(String[] args) {
		int[] ar = {4,10,8,2,8,7,6,1,4,11,5};
		int small=ar[0];
		int large = ar[0];
		
		for(int i = 0; i < ar.length; i ++) {
			if (small > ar[i]) {
				small = ar[i];
			}
			if (large < ar[i]) {
				large = ar[i];
			}
			
		}
		System.out.println(small);
		System.out.println(large);
	}

}
