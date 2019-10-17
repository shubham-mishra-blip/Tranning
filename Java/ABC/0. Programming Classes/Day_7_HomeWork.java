import java.util.Scanner;

class Day_7_HomeWork 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int j = 0;
		System.out.println("\n\n\n\n\n\n\n");
		
		// Mountain
		for (int i = 0;  i < n; i ++)
		{
			//Mountain 1
			for (j = 0; j < n-i; j ++)
			{
				if (i == n-1)
				{
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			for (j = 0; j < i; j ++)
			{
				if (j == 0 || i == n-1)
				{
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			
			for (j = 0; j < i-1; j ++)
			{
				if (j == i-2 || i == n-1)
				{
					System.out.print("*");
				}
				else System.out.print(" ");
				
			}
			for (j = 0; j < n-i; j ++)
			{
				if (i == n-1)
				{
					System.out.print("*");
				}
				else System.out.print(" ");
			}

				//Mountain 2
			for (j = 0; j < n-i; j ++)
			{
				if (i == n-1)
				{
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			for (j = 0; j < i; j ++)
			{
				if (j == 0 || i == n-1)
				{
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			
			for (j = 0; j < i-1; j ++)
			{
				if (j == i-2 || i == n-1)
				{
					System.out.print("*");
				}
				else System.out.print(" ");
				
			}
			for (j = 0; j < n-i; j ++)
			{
				if (i == 3*n/4 && j == 0 || i == 3*n/4 -1 && j == 2 || i == n-1)
				{
					System.out.print("*");
				}
				else System.out.print(" ");
			}


				//Mountain 3
			for (j = 0; j < n-i; j ++)
			{
				if (i == 3*n/4 -1 && j == 1 || i == 3*n/4 && j == 2 || i == n-1)
				{
					System.out.print("*");
				}
				else System.out.print(" ");;
			}
			for (j = 0; j < i; j ++)
			{
				if (j == 0 || i == n-1)
				{
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			
			for (j = 0; j < i-1; j ++)
			{
				if (j == i-2 || i == n-1)
				{
					System.out.print("*");
				}
				else System.out.print(" ");
				
			}

			for (j = 0; j < n-i; j ++)
			{
				if (i == n-1)
				{
					System.out.print("*");
				}
				else System.out.print(" ");
			}


				//Mountain 4
			for (j = 0; j < n-i; j ++)
			{
				if (i == n-1)
				{
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			for (j = 0; j < i; j ++)
			{
				if (j == 0 || i == n-1)
				{
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			
			for (j = 0; j < i-1; j ++)
			{
				if (j == i-2|| i == n-1)
				{
					System.out.print("*");
				}
				else System.out.print(" ");
				
			}
			System.out.println();
		}

			
        

		//House ROOf
		for (int i = 0; i < n; i ++)
		{
       
			for (j = 0; j < n-i; j ++)
			{
				System.out.print(" ");
			}
			for (j = 0; j < i; j ++)
			{
				System.out.print("*");
			}
			for (j = 0; j < i-1; j ++)
			{
				System.out.print("*");
			}
			for (j = 0; j < n*2; j ++)
			{
				if (i == 1 || i == n-1 || j == n*2-1 && i!= 0 ||
					i == n-1 - 3 || i == n-1 - 6 ||
					j == n*2/4 && i < n/2 && i !=0 || j == n*2/2 && i < n/2 && i !=0 || j == 3*n*2/4 && i < n/2 && i !=0 ||
					j == n*2/4 +3 && i >= n/2 && i < 3*n/4 || j == n*2/2+3 && i >= n/2 && i < 3*n/4 ||
					j == n*2/4 && i >= 3*n/4 && i !=0 || j == n*2/2 && i >= 3*n/4 && i !=0 || j == 3*n*2/4 && i >= 3*n/4 && i !=0)
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
			
			for (j = 0; j < n*2; j ++)
			{
				if (j == 0 || i == n-1 || j == n*2-3 || j == n*2/4 && i >= n/4 || j == 3*n*2/4-2 && i >= n/4 || i == n/4 && j >= n*2/4 && j <= 3*n*2/4-2)
				{
					System.out.print("*");
				}
				else
				System.out.print(" ");
			}
			for (j = 0; j < n*2; j ++)
			{
				if (i == n-1 && j <= n*2-3 || j == n*2-3 
					  || j == n*2/4 && i >= n/4 && i <= 3*n/4 || j == 3*n*2/4-4 && i >= n/4 && i <= 3*n/4
					|| i == n/4 && j >= n*2/4 && j <= 3*n*2/4 - 4 ||i == 3*n/4 && j >= n*2/4 && j <= 3*n*2/4 -4 ||
					i == n/4 + 2 && j >= n*2/4 && j <= 3*n*2/4 - 4 || i == n/4 + 4 && j >= n*2/4 && j <= 3*n*2/4 - 4
					|| j == n*2/4 + 2 && i >= n/4 && i <= 3*n/4 || j == 3*n*2/4-4-2 && i >= n/4 && i <= 3*n/4 )
				{
					System.out.print("*");
				}
				else
				System.out.print(" ");
			}

			System.out.println();
		}
		
		//Path
		for (int i = 0; i < n; i ++)
		{
			for (j = 0; j < n-i-1; j ++)
			{
				if (j == n-i-7)
				{
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			for (j = 0; j <= i; j ++)
			{
				 System.out.print(" ");
			}
			for (j = 0; j < n-i-1; j ++)
			{
				if (j == n-i-7)
				{
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
}
