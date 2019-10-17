import java.util.Scanner;

public class Array1 
{
	public static void main(String[] args) 
	{
		System.out.println("1-D Regular Array");

		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		for (int i = 0;i <= a.length-1 ;i++ )
		{
			System.out.println("Enter "+(i+1)+" Student Mark");
			a[i] = sc.nextInt();
		}
		for (int i = 0;i <= a.length-1 ;i++ )
		{
			System.out.println("you Enter "+(i+1)+" Student Mark is: "+ a[i]);
		}
	}
}
