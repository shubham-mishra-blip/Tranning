import java.util.*;
class Day_20_Homework 
{
	public static void main(String[] args) 
	{
		
	/*
	WAP to count the character to given string
	i/p - Hello
	o/p - H - 1
	      e - 1
		  l - 2
		  o - 1
	*/
		
		String s = "BobbyBoy";
		char[] c = s.toLowerCase().toCharArray();
		char temp;
		Arrays.sort(c);

		/*for (int i = 0; i < c.length; i ++)
		{
			for (int j = i+1; j < c.length; j ++)
			{
				if (c[i] > c[j])
				{
					temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}*/
		for (int i = 0; i < c.length; i ++)
		{
			System.out.print(c[i]+",");
		}
		System.out.println();

		Dublicate1(c);
	}

	static void Dublicate1(char[] l){
		int count = 1;
		char cc; 
			for (int i = 0; i < l.length; i ++)
		{
			for (int j = i+1; j < l.length; j ++)
			{

				if (l[i] == l[j])
				{
					count ++;
				}
			}
			System.out.println(l[i]+" = "+count);
			if (count > 1)
			{
				i += count-1; 
			}
			count = 1;
		}
	}
}
