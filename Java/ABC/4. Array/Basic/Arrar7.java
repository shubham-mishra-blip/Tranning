/*
Total School - 2
1st School 2 classes
1 class - 2 Student
2 class - 3 Students

2nd School 3 classes
1st class - 4 Student
2nd class - 2 Student
3rd class - 3 Student
*/

import java.util.*;
class Arrar7 
{
	public static void main(String[] args) 
	{
		System.out.println("3 - D Jagged Array");
		
		//Initialise
		Scanner sc = new Scanner(System.in);
		int[][][] a = new int[2][][];
		a[0] = new int[2][];
		a[1] = new int[3][];
		a[0][0] = new int [2];
		a[0][1] = new int [3];
		a[1][0] = new int [4];
		a[1][1] = new int [2];
		a[1][2] = new int [3];
		
		//Take Input
		for (int i = 0; i <= a.length-1; i ++)
		{
			for (int j=0; j <= a[i].length-1; j ++)
			{
				for (int k = 0; k <= a[i][j].length-1; k ++)
				{
					System.out.println("Enter "+(i+1)+ " Student "+(j+1)+" class "+(k+1)+" Student mark: ");
					a[i][j][k] = sc.nextInt();
				}
			}
		}

		
		//Display Value
		for (int i = 0; i <= a.length-1; i ++)
		{
			for (int j=0; j <= a[i].length-1; j ++)
			{
				for (int k = 0; k <= a[i][j].length-1; k ++)
				{
					System.out.println("You enter "+(i+1)+ " Student "+(j+1)+" class "+(k+1)+" Student mark: "+ a[i][j][k]);
					
				}
			}
		}
	}
}
