import java.util.*;

class Array4 
{
	public static void main(String[] args) 
	{
		System.out.println("2-D Jagged Array 1st Way");

		//Initialised 
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Classes have you");
		int a = sc.nextInt();
		System.out.println("How many Student have you");
		int b = sc.nextInt();

		int[][] arr = new int[a][b];
		
		//Take Value
		for (int i = 0;i <= arr.length-1;i ++)
		{
			for(int j = 0;j <= arr[i].length-1; j ++){
				System.out.println("Enter "+(i+1)+" Class "+ (j+1)+" Student Marks = ");
				arr[i][j] = sc.nextInt();
			}
		}

		//Display Value
		for (int i = 0;i <= arr.length-1; i ++)
		{
			for (int j = 0; j <= arr[i].length-1; j ++)
			{
				System.out.println("Enter "+(i+1)+" Class "+ (j+1)+" Student Marks = "+ arr[i][j]);
				 
			}
		}
	}
}
