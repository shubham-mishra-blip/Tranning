class Day_18 
{
	public static void main(String[] args) 
	{
		/*
		
		1. Wap to print the string one by one or line by line
		eg -> This is my class.
		o/p-> This 
		      is
			  my 
			  class
		
		*/
		String s = "This is my class";
		String[] ar = s.split(" ");
		for (int i = 0; i < ar.length; i ++)
		{
			System.out.println(ar[i]);
		}

		/*
		
		2. Wap to line by line
		eg -> This is my class.
		o/p-> This 
		      is
			  my 
			  class
		
		*/
	}
}
