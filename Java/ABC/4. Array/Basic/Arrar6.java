import java.util.*;

class Arrar6
{
	public static void main(String[] args) 
	{
		System.out.println("3 - D Regular Array");

		//Initialise
		Scanner scan = new Scanner(System.in);

		int[][][] a = new int[2][3][4];

		for (int i = 0; i <= a.length-1 ; i ++)
		{
			for (int j = 0; j <= a[i].length-1; j ++)
			{
				for (int k = 0; k <= a[i][j].length-1; k ++)
				{
					System.out.println("ENter "+(i+1)+" School"+(j+1)+" Class"+(k+1)+" Student mark: ");
					a[i][j][k] = scan.nextInt();
				}
			}
		}

		//Display Value
		for (int i = 0; i <= a.length-1 ; i ++)
		{
			for (int j = 0; j <= a[i].length-1; j ++)
			{
				for (int k = 0; k <= a[i][j].length-1; k ++)
				{
					System.out.println("You enter "+(i+1)+" School"+(j+1)+" Class"+(k+1)+" Student mark: "+ a[i][j][k]);
					
				}
			}System.out.println();
		}
	}
}
