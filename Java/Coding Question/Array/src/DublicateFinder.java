import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * 
 * How to find the duplicate number on a given integer array? 
 * 
 * */
public class DublicateFinder {

	static void DuplicateNum(int[] ar) {
		int n = ar.length;
		ArrayList al = new ArrayList();
		Arrays.sort(ar);   //1,1,1,2,3,3,3,4,4
		for (int i = 0;  i < ar.length-1; i++) {
			if (i == 0 && ar[i] == ar[i+1]) {
				al.add(ar[i]);
			}
			else if(i > 0 && ar[i] != ar[i-1]) {
				if(ar[i] == ar[i+1]) {
					al.add(ar[i]);
				}
			}
		}
		Iterator i = al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,1,3,1,4,3,4,5,5,6,6};
		DuplicateNum(arr);
	}

}
