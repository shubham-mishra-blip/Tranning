import java.util.Scanner;

class Array3 
{
	public static void main(String[] args) 
	{
		System.out.println("2-D Regular Array :) \n \n \n");

		//Initialize Scanner
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[2][3]; 
		
		for (int i = 0;i <= a.length-1;i ++)
		{
			for(int j = 0;j <= a[i].length-1; j ++){
				System.out.println("Enter class "+i+" , "+j+" Student mark: ");
				a[i][j] = sc.nextInt();
			}
		}

		for (int i = 0;i <= a.length-1;i ++)
		{
			for(int j = 0;j < a[i].length-1; j ++){
				System.out.println("Class "+i+" , "+j+" Student mark: "+a[i][j]);
				
			}
		}

	}
}
