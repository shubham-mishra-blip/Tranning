
public class HeapTest {
	
	static void heapTest(int[] arr) {
		int n = arr.length;
		
		for(int i = n/2 - 1; i >= 0; i --)
			doHeapify(arr, i, n);
		
		for(int i = n -1; i >=0; i --) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			doHeapify(arr, 0, i);
		}
	}
		static void doHeapify(int[] arr, int i, int n) {
			int Longest = i;
			int left = 2*i + 1;
			int right = 2 *i +2;
			
			if(left < n && arr[left] > arr[Longest])
				Longest = left;
			
			if (right < n && arr[right] > arr[Longest]) 
				Longest = right;
			
			if (Longest != i) {
				int temp = arr[i];
				arr[i] = arr[Longest];
				arr[Longest] = temp;
				
				doHeapify(arr, Longest, n);
			}
		}
	public static void main(String[] args) {

		int[] ar = {5,2,1,3,4};
		
		heapTest(ar);
		
		for(int i : ar)
			System.out.println(i);

	}

}
