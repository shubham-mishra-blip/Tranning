import java.util.*;

class Array5 
{
	public static void main(String[] args) 
	{
		System.out.println("2 - D Jagged Array 2nd Way");


		//Initialise
		Scanner scan = new Scanner(System.in);
		int[][] a = new int[3][];
		a[0] = new int[2];
		a[1] = new int[3];
		a[2] = new int[1];

		// Take Value
		for (int i = 0;i <= a.length-1 ;i ++ )
		{
			for (int j =0; j <= a[i].length-1; j ++)
			{
				System.out.println("Enter "+(i+1)+" class "+(j+1)+" Student marks: ");
				a[i][j] = scan.nextInt();
			}
		}

		//Display Input
        for (int i = 0;i <= a.length-1 ;i ++ )
		{
			for (int j =0; j <= a[i].length-1; j ++)
			{
				System.out.println("You enter "+(i+1)+" class "+(j+1)+" Student marks: "+ a[i][j]);
				
			}
		}
	}
}
