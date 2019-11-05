class Day_19_Homework 
{

	/*
	FInd out the given output


	i/p - This is my Class
	o/p - ss*alc ym s*i s*iht


	*/
	public static void main(String[] args) 
	{
		String s = "This is my class";
		String t = "";
		
		//FInd Vowel
		for (int i = 0; i < s.length(); i ++)
		{
			if (s.toLowerCase().charAt(i) == 'a' || s.toLowerCase().charAt(i) == 'e'||s.toLowerCase().charAt(i) == 'i'||s.toLowerCase().charAt(i) == 'o'||s.toLowerCase().charAt(i) == 'u')
			{
				t += s.charAt(i)+"*";
			}
			else t += s.charAt(i);
		}
		String[] ar = t.split(" ");

		for (int i = ar.length-1; i >= 0; i --)
		{
			StringBuffer sb = new StringBuffer(ar[i]);
			System.out.print(sb.reverse()+" ");
		}
		System.out.println();
	}
}
