import java.util.*;

class Day_11 
{
	public static void main(String[] args) 
	{
		/*
		1.WAP to count the vowel and constant of the given string
		
		*/
		String s = "Monster is Alive";
		int countv = 0;
		int countc = 0;

		for(int i = 0; i < s.length(); i ++){
			if(s.toLowerCase().charAt(i) == 'a' ||s.toLowerCase().charAt(i) == 'e'||s.toLowerCase().charAt(i) == 'i'||s.toLowerCase().charAt(i) == 'o'||s.toLowerCase().charAt(i) == 'u'){
				countv ++;
			}
			else countc ++;
		}
		System.out.println("Vowel is = "+ countv);
		System.out.println("Constant is = "+ countc);
	}
}
