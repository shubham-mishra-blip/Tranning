import java.util.*;

class Day_5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int j = 0;
		for (int i = 0;i < n; i ++)
		{
			for (j = n; j > i; j --)
			{
			System.out.print(" ");
			}
			for (j = 0; j <= i; j ++)
			{
			System.out.print("+");	
			}
			for (j = 0; j <= n; j ++)
			{
			System.out.print("|");	
			}
			for (j = 0; j <= n; j ++)
			{
				if (j <= n/4 || j > 3*n/4)
				{
			System.out.print("=");	
				}
				else  System.out.print(" ");	
			}
			for (j = 0; j <= n; j ++)
			{
				if (i == j || i + j == n-1 || i ==0 || i == n-1 || j == 0 || j == n-1)
				{
			System.out.print("*");	
				}
				else  System.out.print(" ");	
			}
			for (j = 0; j <= n; j ++)
			{
			System.out.print("|");		
			}
			for (j = 0; j < n; j ++)
			{
			if (j <= i)
			{
				System.out.print("+");
			}	
			else System.out.print(" ");
			}
			System.out.println();
		}
	}
}
