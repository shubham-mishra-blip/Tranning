import java.util.*;

class Day_10 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

	// 1.> WAP to print all character of the given input String
		String s = "Rama";
		for (int i = 0; i < s.length(); i ++)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println("\n\n\n\n\n\n");



		//2.> WAP to reverse the given input String
		s = scan.nextLine();
		for (int i =  s.length()-1; i >= 0; i --)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println("\n\n\n");

		
		//3.> WAP to reverse a given iput and store it another string
		s = scan.nextLine();
		String s1="";
		for (int i = s.length()-1; i >= 0; i --)
		{
			s1= s1 + s.charAt(i);
		}
		System.out.println(s1);

		//Precision Table
		System.out.println(1+1+1);
		System.out.println("1"+1+1);
		System.out.println(1+"1"+1);
		System.out.println(1+1+"1");
		System.out.println("21"+"1"+"1");


		//4.>WAP to count the given paticular character in the given string.
		int count = 0;
		for (int i = 0; i < s.length(); i ++) 
		{
			if ('s' == s.charAt(i))
			{
				count ++;
			}
		}
		System.out.println(count+"\n\n\n\n\n");

		//5.> WAP to count the 2 particular char in given string
		s = scan.nextLine();
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < s.length(); i ++)
		{
			if ('m' == s.toLowerCase().charAt(i))
			{
				count1 ++;
			}
			if ('s' == s.charAt(i))
			{
				count2 ++;
			}
		}
		System.out.println(count1);
		System.out.println(count2);
	}
}
