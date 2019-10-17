import java.util.*;

class Day_6 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter NUmber");
		int n = sc.nextInt();
		int j = 0;
		/*for (int i = 0;i < n; i ++)
		{
			/*for (j = 0; j < n; j ++)
			{
			System.out.print(" ");
			}
			for (j = 0; j < n; j ++)
			{
				if (i+j >= n-1)                   //----> NOTE
				{
					System.out.print("+");
				}
				else System.out.print(" ");	
			}
			System.out.print("  ");
			for (j = 0; j < n; j ++)
			{
			if (j <= i)                     // --->  NOTE
			{
				System.out.print("+");
			}	
			else System.out.print(" ");
			}
			for (j = 0; j < n; j ++)
			{
			if (j >= i)                     // --->  NOTE
			{
				System.out.print("+");
			}	
			else System.out.print(" ");
			}
			System.out.print("  ");
			for (j = 0; j < n; j ++)
			{
			if (i + j <= n-1)                     // --->  NOTE
			{
				System.out.print("+");
			}	
			else System.out.print(" ");
			}
			System.out.println();


		}*/






		//Triangle 1st ways
		/*for (int i = 0; i < n ; i++ )
		{
			for (int k = n; k >=i ; k --)
			{
				System.out.print(" ");
			}
			for ( j = 0; j < 2*i -1 ; j ++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		// 2nd Ways(Two Triangle)

		for (int i =0; i < n; i ++)
		{
			for (j =0; j < n-i; j ++)
			{
				System.out.print(" ");
			}
			for (j =0; j <i; j++)
			{
				System.out.print("*");
			}
			for (j = 0; j <= i; j ++)
			{
				System.out.print("*");
			}
			//ert
			for (j =0; j < n-i-1; j ++)
			{
				System.out.print(" ");
			}
			for (j =0; j < n-i; j++)
			{
				System.out.print(" ");
			}
			for (j = 0; j < i; j ++)
			{
				System.out.print("*");
			}
			for (j = 0; j <= i; j ++)
			{
				System.out.print("*");
			}
			System.out.println();

		}*/


	}
}


