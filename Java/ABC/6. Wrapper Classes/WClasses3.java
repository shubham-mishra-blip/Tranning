class WClasses3 
{
	public static void main(String[] args) 
	{
		//AutoBoxing - Primitive to Object conversion
		// Unboxing - Object to Primitive COnversion

		//AutoBoxing is useful for "Byte" and "Short".
		

		//Creating Primitive variable for Byte and Short
		byte b1 = 10;
		short s1 = 14404;


		//Byte b = new Byte(10);          // error bcoz Autoboxing is nessuary in Byte object
		//Autoboxing
		Byte b = new Byte(b1);            // No error :)
		//Short s = new Short(4556);      //error bcoz Autoboxing is nessuary in Short object
		//Autoboxing
		Short s = new Short (s1);         // No error :)


		System.out.println(b);
		System.out.println(s);
	}
}
