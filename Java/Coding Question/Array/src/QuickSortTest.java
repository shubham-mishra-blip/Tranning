import java.util.Arrays;

public class QuickSortTest {

	static void quickSort(int[] list, int low, int high) {
		if (low < high) {
			int p = doQuickSorting(list, low, high);
			quickSort(list, low, p-1);
			quickSort(list, p+1, high);
		}
	}
	static int doQuickSorting(int[] list, int left, int right) {
		int pivot = list[left];
		int i = left;
		
		for(int j = left + 1; j <= right; j ++) {
			if (list[j] < pivot) {
				i ++;
				swap(list, i, j);
			}
		}
		swap(list, left, i);
		
		return i;
	}
	
	static void swap(int[] list, int i, int j) {
		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}
	
	public static void main(String[] args) {
		//int[] ar = {5,0,8,4,3,7,6,-1,10,0,-9,5,7,6,-6,8};
		int[] ar = {5,1,3,6,4,2};
		System.out.println(Arrays.toString(ar));
		
		quickSort(ar, 0, ar.length-1);
		System.out.println(Arrays.toString(ar));

	}

}
