//All possible method whic are present in StringBUffer or StringBuilder

class StringMutable1 
{
	public static void main(String[] args) 
	{

		//.append();
		//.insert();
		//.replace();
		//.delete();
		//.reverse();
		//.capacity();
		//.length();
		//.charAt();
		//.substring();





		StringBuffer s1 = new StringBuffer();
		
		//Add Text
		s1.append("Hello ");                        
		s1.append("World");

		//Insert text at Front
		s1.insert(0, "Java ");
		System.out.println(s1);

		//replace hey at the place of Hello
		s1.replace(5,10,"Hey");
		System.out.println(s1);

		//Delete WOrld
		s1.delete(9, 14);
		System.out.println(s1);

		//DOing SOmething Interesting with reverse methd :)
		String s = s1.toString();
		String[] ss = s.split(" ");
		StringBuffer s2= new StringBuffer(ss[0]);
		StringBuffer s3 = new StringBuffer(ss[1]);
		s3.reverse();
		s2.append(" "+s3);
		System.out.println(s2);

		//Capacity
		System.out.println(s1.capacity());
		System.out.println(s2.capacity());

		//charAT method
		System.out.println(s2.charAt(3));

		//length
		System.out.println(s2.length());

		//substring
		System.out.println(s2.substring(0));
	}
}



