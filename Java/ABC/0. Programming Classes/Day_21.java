import java.util.*;

class Day_21 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		/*
		First Program
		
		*/

		//int n = scan.nextInt();
		//System.out.println(n);     //They don't take space after number

		//float f = scan.nextFloat();
		//System.out.println(f);    // They also don't take space after float number

		//String s = scan.nextLine();
		//System.out.println(s);  // they take space before as well as after the word.

		int n = scan.nextInt();
		System.out.println(n);      // 5

		float f = scan.nextFloat();
		System.out.println(f);   //5.57

		String s = scan.nextLine();
		System.out.println(s);    // Not wait for take input i.e print Empty String   (*Problem Here)

		//TO overcome this problem we use -
		//next();  or scan.nextSting() before taking input for String
		//e.g. scan.nextLine();
		//String s = scan.nextLine();

		             //OR
		//or taking input like this eg- 4__5.6__Abcfor tech
		int a = scan.nextInt();
		float b = scan.nextFloat();
		String s1 = scan.nextLine();
		System.out.println(a);
		System.out.println(b);
		System.out.println(s1);

        System.out.println("--------------------------");



		/*
		1. WAP to show this Input
		i/p - 2
			  ABC for tech
			  xyz

		O/p - xyz
		      ABC for tech
		*/

	System.out.println("Enter integer");
	int i1 = scan.nextInt();
	String[] s4 = new String[n];
	scan.nextLine();
	System.out.println("Enter String");
	for (int m = 0; m < s4.length; m ++)
	{
		s4[m] = scan.nextLine();
	}
	for (int k = s4.length-1; k >= 0; k --)
	{
		System.out.println(s4[k]);
		}



		/*Wap to get the character count in a given input string
		i/p - Hello
		o/p - H - 1
		      e - 1
			  l - 2
			  o - 1
		
		*/
	}
}
