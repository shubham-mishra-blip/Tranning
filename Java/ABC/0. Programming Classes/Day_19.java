class  Day_19
{

	/*
	1. Wap for this o/p
	i/p - This is my Class
	o/p = class my is this
	
	*/
	public static void main(String[] args) 
	{
		String s  = "This is my class";
		String[] ar = s.split(" ");

		for (int i = ar.length - 1;i >=0 ;i -- )
		{
			
				System.out.print(ar[i]+" ");
			
		}
		System.out.println();

		/*
	2. Wap for this o/p (Homework)
	i/p - This is my Class
	o/p = ssalc ym si siht
	
	*/
	StringBuilder sb = new StringBuilder();
	sb.append(s);
	System.out.print(sb.reverse());
	
   System.out.println();


/*
	3. Wap for this o/p (Homework)
	i/p - This is my Class
	o/p = this4 is2 my2 class5
	
	*/
	

	for (int i = 0; i < ar.length; i ++)
	{
		System.out.print(ar[i]+ar[i].length()+ " ");
	}
			System.out.println();
		


		/*
	3. Wap to reverse input string
	i/p - This is my Class
	o/p = siht si ym ssalc
	*/

	for (int i = 0; i < ar.length ; i ++)
	{
		StringBuffer sb1 = new StringBuffer(ar[i]);
		System.out.print(sb1.reverse()+ " ");
	}
				System.out.println();

		/*
	3. Wap to reverse input string
	i/p - This is my Class
	o/p = ssalc ym si siht
	*/

	for (int i = ar.length -1; i >= 0  ; i --)
	{
		StringBuffer sb1 = new StringBuffer(ar[i]);
		System.out.print(sb1.reverse()+ " ");
	}
				System.out.println();

	}
}
