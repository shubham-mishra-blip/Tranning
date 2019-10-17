//WAP to count no of vowel present in given String.

import java.util.*;

class Day_10_HomeWork 
{
	public static void main(String[] args) throws Exception
	{
		Scanner scan =new Scanner(System.in);

		String s = scan.nextLine();

		char[] ch = {'a', 'e', 'i', 'o', 'u'};

		int count = 0;

		for (int i = 0; i < s.length(); i ++)
		{
			for (int j = 0; j < ch.length; j ++)
			{
				if (ch[j] == s.toLowerCase().charAt(i)) 
				{
						count ++;
				}
				
			}
			
		}
		System.out.println(count);
	}
}
