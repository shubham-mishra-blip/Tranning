
public class SelectionSortArraySorting {

	public static void main(String[] args) {
		int[] ar = {7,8,3,5,4,1,9,2,6};
		int minValue = 0;
		int minIndex = 0;
		int temp = 0;
		
		for (int i = 0; i < ar.length; i++) {
			minValue = ar[i];
			minIndex = i;
			for (int j = i; j < ar.length; j++) {
				if (ar[j] < minValue) {
					minValue = ar[j];
					minIndex = j;
				}
			}
			if (minValue < ar[i]) {
				temp = ar[i];
				ar[i] = ar[minIndex];
				ar[minIndex] = temp;
			}
		}
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+", ");
		}
	}

}
