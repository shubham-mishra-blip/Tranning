//Correct

import java.util.*;

class Day_6_HomeWork 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int j =0;
		int l = 2*n;

		for (int i = 0; i < n; i ++)
		{
			for (j = 0; j < n-i; j ++)
			{
				System.out.print("*");
			}
			for (j = 0; j < i; j ++)
			{
				System.out.print(" ");
			}
			for (j = 0; j < i; j ++)
			{
				System.out.print(" ");
			}
			for (j = 0; j < n-i; j ++)
			{
				System.out.print("*");
			}





			for (j = 0; j < n; j ++)
			{
				if (i + j <= n/2 || j - i >= n/2 || i- j >= n/2 || i + j >= 3*n/2 -1)
				{
					System.out.print("$");
				} else System.out.print(" ");
			}





			for (j = 0; j < n-i; j ++)
			{
				System.out.print("*");
			}
			for (j = 0; j < i; j ++)
			{
				System.out.print(" ");
			}
			for (j = 0; j < i; j ++)
			{
				System.out.print(" ");
			}
			for (j = 0; j < n-i; j ++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
