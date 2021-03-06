// How to find all pairs on integer array whose sum is equal to given number?
import java.util.*;


class ProArray4 
{
	static int sumEqual(int[] a, int x){
		int n = a.length;
		
		for (int i = 0; i < n; i += 1)
		{
			for (int j = i+1; j < n; j ++)
			{
				if (a[i]+a[j] == x)
				{
					return +1;
				}
				
			}
		}
		return -1;
	}

	public static void main(String[] args) 
	{
		int [] arr = {4,1,2,3,5};
		int num = 18;
		int op = sumEqual(arr, num);
		if (op > 0)
		{
			System.out.println("Founded");
		}
		else 
			System.out.println("Not Founded");

	}
}



// or
/*
class ProArray4 
{
	static void sumEqual(int[] a, int x){
		int n = a.length;
		int o=0;
		int p=0;
		
		for (int i = 0; i < n; i += 1)
		{
			for (int j = i+1; j < n; j ++)
			{
				if (a[i]+a[j] == x)
				{
					o = i;
					p = j;
				}
				
			}
		}
		if (p > 0)
		{
			System.out.println("Founded! On Position "+ (o+1)+" + "+ (p+1));
		}
		else
			System.out.println("Not Founded!");
	}

	public static void main(String[] args) 
	{
		int [] arr = {4,1,2,3,5};
		int num = 9;
	    sumEqual(arr, num);
		

	}
}*/

