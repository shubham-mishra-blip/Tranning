class Day_23 
{
	public static void main(String[] args) 
	{
		/**
		
		1. Wap to rotate given 2-d matrix 90 right side
		
		*/
		int[][] ar = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] ar1 = new int[3][3];
		int[][] ar2 = new int[3][3];


		for (int i = 0; i < ar.length; i ++)
		{
			int k =2;                                 //NOTED
			for (int j = 0; j < ar.length; j ++){			
			ar1[i][j] = ar[k][i];
			k --;
			}
		}

		for (int i = 0; i < ar.length; i ++)
		{
			for (int j = 0; j < ar.length; j ++){			
			System.out.print(ar1[i][j]+" ");
			}
			System.out.println();
		}


		/**
		
		2. WAP to rotate given 2-d in 90degree left
		
		*/
		System.out.println();
		int k = 2;
		for (int i = 0; i < ar.length; i ++)
		{
			for (int j = 0; j < ar.length; j ++){			
			ar2[j][i] = ar[j][k];
			
			}
			k--;
		}

		for (int i = 0; i < ar.length; i ++)
		{
			for (int j = 0; j < ar.length; j ++){			
			System.out.print(ar2[i][j]+" ");
			}
			System.out.println();
		}

		/**
		
		3. WAP to transpose 2-d matrix
		
		*/
		int[][] ar3 = new int[3][3];
		System.out.println();
		for (int i = 0; i < ar.length; i ++)
		{
					
			for (int j = 0; j < ar.length; j ++){			
			ar3[i][j] = ar[j][i];
			
			}
			
		}

		for (int i = 0; i < ar.length; i ++)
		{
			for (int j = 0; j < ar.length; j ++){			
			System.out.print(ar3[i][j]+" ");
			}
			System.out.println();
		}


		/**
		
		4. WAP to merge the 2 given array
		
		*/

	}
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                    