import java.util.*;

class Day_24 
{
	public static void main(String[] args) 
	{

		/*
		Wap to merge the two given array in zig-zag way
		i/p - {1,2,3}
		      {4,5,6,7,8,9}

	    o/p - {1,4,2,5,3,6,7,8,9}
		
		*/
		int[] a = {1,2,3};
		int[] b = {4,5,6,7,8,9};

		int[] n = new int[a.length+b.length];
		int k = 0;
		for (int i = 0; i < n.length; i ++)
		{
			if (k < a.length*2)
			{
		   n[k] = a[i];
			k++;
			n[k] = b[i];
			k++;
			}
			else if (k < b.length+3)
			{
				n[k] = b[i];
				k++;
			}
			
		}
		for (int i = 0; i < n.length; i ++)
		{
			System.out.print(n[i]+" , ");
		}
		System.out.println("\n\n");

		             //OR

		k = 0;
		for (int i = 0; i < n.length; i ++) // or b.length    or a.length both are given same input
		{
			if (i < a.length)
			{
		   n[k] = a[i];
			k++;
			}
		   if (i < b.length)
			{
				n[k] = b[i];
				k++;
			}
		}
	for (int i = 0; i < n.length; i ++)
		{
			System.out.print(n[i]+" , ");
		}





		int[] a1 = {0,0,0,1,7,2,3,1};
		int[] res = a1;
		int temp;
		for (int i = 0; i < a1.length; i ++)
		{
			for (int j = i+1;j < a1.length ; j ++)
			{
			if (a1[i] > a1[j])
			{
				temp = res[i];
				res[i] = res[j];
				res[j] = temp;
			}
			}
		
		}
		int countg = 0;
		int countb = 0;
		int magicnum;
		for (int i = 0; i < a1.length; i ++)
		{
			if (res[i] == a1[i])
			{
				countg += res[i];
			}
			else 
				countb += res[i];
		}
		magicnum = countg - countb;

		System.out.println(magicnum);
	}
}
