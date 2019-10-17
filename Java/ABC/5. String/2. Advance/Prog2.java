// How to reverse string without reversing Special Character.
import java.util.*;

class Prog2 
{
	public static void reverseAlpha(String str){
		char[] c = str.toCharArray();
		int n = c.length;
		int l = 0;
		for (int i = 0; i < n; i ++)
		{
			if (!Character.isLetter(c[l]))           //NOTED
			{
				l++;
			}
			else if (!Character.isLetter(c[n-1]))
			{
				n --;
			}
			else{
				char temp = c[l];
				c[l] = c[n-1];
				c[n-1] = temp;
				l++;
				n --;
			}
			
		}
		String s1 = String.valueOf(c);
		System.out.println(s1);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String with special symbol e.g. -> 'cdfr!gb&nbv' ");
		String s = sc.nextLine();
		reverseAlpha(s);
	}
}
