import java.util.*;


//                                                 STRING
/*
String is a class which is a collection of character written wihin " "
*/

class Day_9 
{
	public static void main(String[] args) 
	{
		
		String s = "123";
		System.out.println(s);
		s = "avc@$%^&dc";
		System.out.println(s);
		//s = '124';                      //error it is not variable  
		//System.out.println(s);
		s = "123";
		System.out.println(s);
		s = " ";
		System.out.println(s);
		s = "";
		System.out.println(s);
		s = null;
		System.out.println(s);
		s = "MONSTER";

		//STRING IMPORTANT METHOD

		// .length()
		System.out.println(s.length());

		//.chatAt()
		System.out.println(s.charAt(2));

		//.toCharArray();
		System.out.println(s.toCharArray());

		//.toUpperCase
		System.out.println(s.toUpperCase());

		//.toLowerCase()
		System.out.println(s.toLowerCase());

		

	}
}
