/*
 * 
 * Asked is Microsoft Interview
 * i/p - 1,9,8,4,0,0,2,7,0,6,0
 * o/p  - 1,9,8,4,2,7,6,0,0,0,0
 * 
 * */


public class MicrosoftAsk1 {

	//Using Insertion Sorting
	public static void main(String[] args) {
		int[] ar= {1,9,8,4,0,0,2,7,0,6,0};
		int j = 0;
		int key = 0;
		int temp = 0;
		
		for (int i = 1; i < ar.length; i++) {
			j = i-1;
			key = ar[i];
			while(j >= 0 && key > ar[j] && ar[j] == 0) {
				temp = ar[j];
				ar[j] = ar[j+1];
				ar[j+1] = temp;
				j--;
			}
		}
		for (int i = 0; i < ar.length; i++) {
			if (i != ar.length-1) {
				System.out.print(ar[i] + " , ");
			}
			else 
				System.out.print(ar[i]);

		}
		System.out.println();
	}

}
