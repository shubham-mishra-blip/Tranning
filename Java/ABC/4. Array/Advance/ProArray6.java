/*

Diagonal Difference


*/


/*import java.util.*;

class ProArray6 
{
	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);
		int temp1 = 0;
		int temp2 = 0;

		int[][] ar = {{1,2,3},{4,5,6},{7,8,9}};

		for (int i = 0; i < ar.length; i ++)
		{
			for (int j = 0; j < ar.length; j ++)
			{
				System.out.print(ar[i][j]);
			}
			System.out.println();
		}
		for (int i = 0; i < ar.length; i ++)
		{
			for (int j = 0; j < ar.length; j ++)
			{
				if (i == j)
				{
					temp1 += ar[i][j];
				}
			 if (j == ar.length-1 - i)
				{
					temp2 += ar[i][j];
					System.out.println(temp2);
				}
			}
			System.out.println();
		}
		System.out.println(temp1);
		System.out.println(temp2);

		System.out.println((temp1 - temp2));


	}
}*/


                                        //OOOOORRRRR
import java.util.*;

class ProArray6 
{
	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);
		int temp1 = 0;
		int temp2 = 0;
		int[][] ar = {{1,2,3},{4,5,6},{9,8,9}};
		int n = ar.length;

		for (int i = 0; i < ar.length; i ++)
		{
			for (int j = 0; j < ar.length; j ++)
			{
				System.out.print(ar[i][j]);
			}
			System.out.println();
		}
		
		for (int i = 0; i < ar.length; i ++)
		{
			temp1 += ar[i][i];
			temp2 += ar[i][n - 1 - i];
		}
			System.out.println();
		
		System.out.println(temp1);
		System.out.println(temp2);

		System.out.println(Math.abs(temp1 - temp2));


	}
}
