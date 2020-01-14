
public class InsertionSortArraySorting {

	public static void main(String[] args) {
		 int[] ar = {5,8,2,1,4,9,3};
		 int temp;
		 int key;
		 int j;
		 for (int i = 1; i < ar.length; i++) {
			j = i-1;
			key = ar[i];
			while(j >= 0 && key < ar[j]) {
				temp = ar[j];
				ar[j] = ar[j+1];
				ar[j+1] = temp;
				j--;
			}
		}

		 for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" , ");
		}
	}

}
