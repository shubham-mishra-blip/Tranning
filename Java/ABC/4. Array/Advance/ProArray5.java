//Write a program to remove duplicates from array in Java?

import java.util.*;

class ProArray5 
{
	static void dubliChecker(int[] a){
		Arrays.sort(a);
		int n = a.length;
		int j =0;
		for (int i = 0; i < a.length-1; i ++)
		{
			if (a[i] != a[i + 1])
		{
			a[j++] = a[i];

		}
		}
		a[j++] = a[n - 1];

		for (int k =0; k < j; k ++)
		{
			System.out.print(a[k]+ " ");
		}
		
	}

	public static void main(String[] args) 
	{
		int[] arr = {1,2,4,3,2,5};
		dubliChecker(arr);
	}
}
