import java.util.*;

class Day_8_HomeWork 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int j = 0;

		//1st
		for (int i = 0; i < n; i ++)
		{
			for (j = 0; j < n; j ++)
			{
				if (i + j > n-1)
				{
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			for (j = 0; j < n; j ++)
			{
			 System.out.print(" ");
			}
			
			for (j = 0; j < n; j ++)
			{
				if (i > j)
				{
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			 System.out.println();
		}

		//2nd
		for (int i = 0; i < n; i ++)
		{
			for (j = 0; j < n; j ++)
			{
			 System.out.print(" ");
			}
			for (j = 0; j < n; j ++)
			{
			 if (i == 0 || i  == n-1 || j == 0 || j == n-1 || i == j || i + j == n-1)
			 {
				System.out.print("*");
			 }
			 else System.out.print(" ");
			}
			for (j = 0; j < n; j ++)
			{
				System.out.print(" ");
			}
			 System.out.println();
		}

			//3rd
		for (int i = 0; i < n; i ++)
		{
			for (j = 0; j < n; j ++)
			{
				if (i < j)
				{
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			for (j = 0; j < n; j ++)
			{
			 System.out.print(" ");
			}
			
			for (j = 0; j < n; j ++)
			{
				if (i + j < n-1)
				{
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			 System.out.println();
		}

		System.out.println("\n");


		//FISH
		//1st
		for (int i = 0; i < n; i ++)
		{
			for (j = 0; j < n-i; j ++)
			{
				System.out.print(" ");
			}
			for (j = 0; j < i-1; j ++)
			{
				if (j == 0)
				{
				System.out.print("*");
				}
				else System.out.print(" ");
			}
			for (j = 0; j < i; j ++)
			{
				
				System.out.print("8");
				
			}
			for (j = 0; j < n-i; j ++)
			{
				System.out.print(" ");
			}
			for (j = 0; j < n-i; j ++)
			{
				if (i < n/2)
				{
					System.out.print(" ");
				}
				else System.out.print("8");
			}
			
			System.out.println();
		}

		//2nd
		for (int i = 0; i < n; i ++)
		{
			for (j = 0; j < i; j ++)
			{
				System.out.print(" ");
			}
			for (j = 0; j < n-i; j ++)
			{
				System.out.print("8");
			}
			for (j = 0; j < n-i-1; j ++)
			{
			 System.out.print("8");
				
			}
			for (j = 0; j < i; j ++)
			{
				System.out.print(" ");
			}
			for (j = 0; j <= i; j ++)
			{
				if (i <= n/2)
				{
					System.out.print("8");
				}else System.out.print(" ");
			}
			
			System.out.println();
		}
	}
}
