class Pattern19 
{
	public static void main(String[] args) 
	{
		for (int i = 0;i <= 4 ;i++)
		{
			for (int k = 4;k >= i; k-- )
			{
				System.out.print(" ");
			}
			for (int j = 1;j <= (2*i)+1; j++)
			{
				if (j == 1 || j == (2*i)+1 || i == 4)
				{
					System.out.print("*");
				}else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
