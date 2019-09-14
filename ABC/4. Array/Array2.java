import java.util.Scanner;

class Array2 
{
	public static void main(String[] args) 
	{
		System.out.println("1-D Jagged Array :) \n \n \n");

		//Initialize Scanner
		Scanner sc = new Scanner(System.in);

		//Initialize Array
		System.out.println("How many Student name want to store? ");
		int a = sc.nextInt();
		String[] stu = new String[a];

		//Take Input
		for (int i = 0;i < stu.length ;i ++ )
		{
			
			System.out.println("Enter "+i+" Student Name");
			stu[i] = sc.next();
		}

		//DIsplay Input
		for (int i = 0;i <= stu.length-1 ;i++ )
		{
			System.out.println("You Enter "+(i+1)+" Student Name is: "+ stu[i]);
		}
	}
}
