import java.util.*;


class Day_22 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		/*
		1. Find the output of given input number
		i/p = 5
			  7 2 1 5 3
			  3
		o/p = 4
		*/


		//ALl program using Linear Search

		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i ++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Which value you wants to find");
		int b = sc.nextInt();
		for (int i  = 0; i < a.length; i ++)
		{
			if (a[i] == b)
			{
				System.out.println(i);
			}

		}

						//--------OR--------
		
	int result = search(a,b);
			System.out.println(result);
					
			}
					
					
			/*static int search(int[] ar, int k){
					int aa = 0;
					for (int i = 0; i < ar.length; i ++)
					{
			if (ar[i] == k) return i;
					} 
				 return -1;
			
			} */ 

	/*
		1. Find the output of given input number(Using binary search)
		i/p = 5
			  7 2 1 5 3
			  3
		o/p = 4
		*/
		
		static int search(int[] ar, int k){
			int low = 0;
			int high = ar.length-1;
			int mid = (low+high)/2;
			if (ar[mid] < k)
			{
				low = mid+1;
			}
			else if (ar[mid] > k)
			{
				high = mid -1;
			}
			else return mid;

			return -1;
	}

}
