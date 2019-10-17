import java.util.*;

class Day_8 
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
				 System.out.print(" ");
			 }
			  for (j = 0; j < n; j ++)
			 {
				 System.out.print(" ");
			 }
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
			 }System.out.println();
		 }

			//2ND
		 	 for (int i = 0; i < n; i ++)
		 {
			  for (j = 0; j < n; j ++)
			 {
				 System.out.print(" ");
			 }
			 for (j = 0; j < n-i; j ++)
			 {
				 System.out.print(" ");
			 }
			  for (j = 0; j <= i-1; j ++)
			 {
				 System.out.print("*");
			 }
			  for (j = 0; j < n*2-2; j ++)
			 {
				 System.out.print(" ");
			 }
			 for (j = 0; j <= i-1; j ++)
			 {
				 System.out.print("*");
			 }System.out.println();
		 }
			
			//3rd
		  for (int i = 0; i < 3*n/4; i ++)
		 {
			  for (j = 0; j < n; j ++)
			 {
				 System.out.print(" ");
			 }
			 for (j = 0; j < n; j ++)
			 {
				 System.out.print(" ");
			 }
			 
			  for (j = 0; j < n; j ++)
			 {if (j == n/2)
			 {
				  System.out.print("*");
			 }else System.out.print(" ");
			 }
			  for (j = 0; j < n; j ++)
			 {if (j == n/4)
			 {
				  System.out.print("*");
			 }else System.out.print(" ");
			 }
			 System.out.println();
		 }

		 //4th
		   for (int i = 0; i < n; i ++)
		 {
			  for (j = 0; j < n; j ++)
			 {
				  if (i+j == n-1 || i+j ==3*n/2-1)
				  {
					  System.out.print("*");
				  }
				 else System.out.print(" ");
			 }
			 
			  for (j = 0; j < n; j ++)
			 {
				  System.out.print("*");
			 }
			 for (j = 0; j < n; j ++)
			 {
				  System.out.print("*");
			 }
			 for (j = 0; j < n; j ++)
			 {
				  System.out.print("*");
			 }
			 for (j = 0; j < n; j ++)
			 {
				  System.out.print("*");
			 }
			    for (j = 0; j < n; j ++)
			 {
				  if (i == j || i-j ==n/2)
				  {
					  System.out.print("*");
				  }
				 else System.out.print(" ");
			 }

			 System.out.println();
		 }

		//5th
		 
		for (int i = 0; i < n; i ++)
		 {
			  for (j = 0; j < n; j ++)
			 {
				  if (j >= 0 && j <= n/2)
				  {
					 System.out.print("*");
				  }
				  else System.out.print(" ");
			 }
			 
			  for (j = 0; j < n; j ++)
			 {
				  System.out.print("*");
			 }
			 for (j = 0; j < n; j ++)
			 {
				  System.out.print("*");
			 }
			 for (j = 0; j < n; j ++)
			 {
				  System.out.print("*");
			 }
			 for (j = 0; j < n; j ++)
			 {
				  System.out.print("*");
			 }
			  for (j = 0; j < n; j ++)
			 {
				  if (j >= n/2 && j <= n)
				  {
					 System.out.print("*");
				  }
				  else System.out.print(" ");
			 }

			 System.out.println();
		 }

		 //6th
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
			 for (j = 0; j < n; j ++)
			 {
				  System.out.print("*");
			 }
			  for (j = 0; j < n; j ++)
			 {
				  System.out.print("*");
			 }
			 for (j = 0; j < n; j ++)
			 {
				  System.out.print("*");
			 }
			 for (j = 0; j < n; j ++)
			 {
				  System.out.print("*");
			 }
			  for (j = 0; j < i; j ++)
			 {
				  System.out.print("*");
			 }
			 

			 System.out.println();
		 }
		
		//7th
		 for (int i = 0; i < n; i ++)
		 {
			 
			  for (j = 0; j < n; j ++)
			 {
				  System.out.print(" ");
			 }
			 
			   for (j = 0; j < n; j ++)
			 {
				   if (j >= n/4 && j <= 3*n/4)
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
				  System.out.print(" ");
			 }
			  for (j = 0; j < n; j ++)
			 {
				   if (j >= n/4 && j <= 3*n/4)
				   {
					  System.out.print("*");
				   }
				  else System.out.print(" ");
			 }
			 

			 System.out.println();
		 }
	}
}
