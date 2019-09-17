class Pattern20
{
	public static void main(String[] args) 
	{
		for (int i = 0;i <= 4 ;i++)
		{
			for (int k = 0;k <= i; k ++)
			{
				System.out.print(" ");
			}
			for (int j = 9;j >= (2*i)+1; j--)
			{
				if (j == 9 || j == (2*i)+1 || i == 0)
				{
					System.out.print("*");
				}else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
