class String1 
{
	public static void main(String[] args) 
	{
		String s1 = "RAMA";
		String s2 = "RAMA";

		if (s1.equals(s2))
		{
			System.out.println("String are Equal");            //Both string are created in const pool
		}
		else
			System.out.println("String are not Equal");

	}
}
