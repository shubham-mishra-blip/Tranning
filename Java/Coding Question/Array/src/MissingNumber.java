import java.util.Arrays;

/*
 * 
 * How to find the missing number in given integer array of 1 to 100?
 * 
 * */
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {1,2,3,4,5,7,8,9,10};
		int[] ar1 = {4,5,7,6,9};
		findMissing(ar);
		findMissing(ar1);
	}
	static void findMissing(int[] a) {
		int n = a.length;
		Arrays.sort(a);
		int frst_num =a[0];	
		for (int i = 0; i < n; i++) {
			if (frst_num != a[i]) {
				System.out.println("Missing Number is:- "+frst_num);
				break;
			}
			frst_num++;
		}
		
	}

}
