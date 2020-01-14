
public class BubbleSortArraySorting {  //O(n^2)

	public static void main(String args[]) {
		
		int ar[] = {5,2,4,1,6,3,4};   //if element is 7 then we will do 6 iteration
		int temp =0; 
		for (int i = 0; i < ar.length-1; i++) {           //Pass or iteration or outerloop
			for (int j = 0; j < ar.length-1-i; j++) {     //Inner Loop
				if (ar[j] > ar[j+1]) {
					temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
		}
			
			for (int j = 0; j < ar.length; j++) {
				System.out.print(ar[j]+", ");
			}
	}
}
