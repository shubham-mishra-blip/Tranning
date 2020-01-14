import java.util.Arrays;

/*
 * 
 * Q. Given a triangle. find the minimum path sum from top to bottom.Each step you may move to adjacentnumber on the row below.
 * For example;-
 *    [2]
 *   [3][4]
 *  [6][5][7]
 * [4][1][8][3]
 * 
 * o/p - 11;
 * (2+3+5+1 = 11)
 *  * */
public class GoogleAsk1 {

	static int minNumber(int[] ar) {
		int n = ar.length;
		int i = n;
		Arrays.sort(ar);
		return ar[0];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ar = {{2},{3,4},{6,5,7},{4,1,8,3}};
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum += minNumber(ar[i]);
		}
		System.out.println(sum);
		
	}

}
