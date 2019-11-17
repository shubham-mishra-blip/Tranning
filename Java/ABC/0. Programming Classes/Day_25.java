import java.util.*;

class Day_25 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
	/*
		1. Wap to print this pattern

		1111
		2222
		3333
		4444


	*/
	System.out.println("Enter a number");
	int n = scan.nextInt();
		for (int i = 1; i <= n; i ++)
		{
			for (int j = 0; j < n; j ++)
			{
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println("-------------------------------");

			/*
		2. Wap to print this pattern

		1234
		1234
		1234
		1234

	*/
	for (int i = 1; i <= n; i ++)
		{
			for (int j = 1; j <= n; j ++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("-------------------------------");


	/*
		3. Wap to print this pattern

		1 2 3 4
		5 6 7 8
		9 10 11 12
		13 14 15 16

	*/
	
	int p = 1;
	for (int i = 1; i <= n; i ++)
		{
			for (int j = 1; j <= n; j ++)
			{
				System.out.print(p+++" ");
				
			}
			System.out.println();
		}

		System.out.println("-------------------------------");

		/*
		4. Wap to print this pattern

		13 14 15 16
		9 10 11 12
		5 6 7 8
		1 2 3 4

	*/

	for (int i = 1; i <= n; i ++)
		{
			for (int j = 1; j <= n; j ++)
			{
				System.out.print(--p+" ");
				
			}
			System.out.println();
		}

		System.out.println("-------------------------------");


/*
		5. Wap to print this pattern

		25*24*23*22*21
        20*19*18*17*16
        15*14*13*12*11
        10*9*8*7*6
        5*4*3*2*1

	*/
	 p = n*n;
			for (int i = 1; i <= n; i ++)
		{
			for (int j = 1; j < n; j ++)
			{
				System.out.print(p--+"*");
				
			}
			System.out.print(p--+"");
			System.out.println();
		}

		System.out.println("-------------------------------");

/*
		H/w 6. Wap to print this pattern and align one and other

		13* 14* 15* 16*
		9* 10* 11* 12*
		5* 6*   7*   8*
		1* 2*   3*   4*

	*/

		System.out.println("-------------------------------");

/*
      7. Tell the output of this program

		for(byte i = 1; i != 0; i ++){
			Sop(i);
		}

	*/
	for (byte i = 1; i != 0; i ++)
	{
		System.out.print(i);          //Answer is 1 to -1
	}
		System.out.println("-------------------------------\n\n");

/*
		3. Wap to print this pattern

		4 3 2 1
		8 7 6 5
		12 11 10 9
		16 15 14 13

	*/
	/*int[][] aa = new int[n][n];
		int m = 1;
		for (int i = 1; i <= n; i ++)
		{
			for (int j = n; j > 0; j --)
			{
				sop(c-j);			
			}
		c +=n;
		}
		
		System.out.println("\n\n");*/


		       //or

	int c = n;

	for (int i = 1; i <= n; i++)
	{
		for (int j = 0; j < n; j ++)
		{
			System.out.print(c+" ");
			c --;
		}
		c =n+5*i;
		System.out.println();
	}
		System.out.println("-------------------------------");
	}
}
