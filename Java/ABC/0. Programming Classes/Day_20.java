import java.util.*;

class Day_20 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		/*
		1.> 
		
		*/

		String s = "ABC";
		System.out.println(s);                 //ABC
		System.out.println(s.toString());      //NOTED        //ABC



		int[] ar = new int[3];
		for (int  i = 0;i < ar.length ; i ++)
		{
			ar[i] = sc.nextInt();
		}



		System.out.println(ar);          //Noted = if toString is not presnt in particular class,it will extends parent object          //eg - [I@214c265e (HexCode)
										//Hexcode it is a unique identification hexa decimal number given by JVM use to identify unique object



		for (int  i = 0;i < ar.length ; i ++)
		{
			System.out.println(ar[i]+" ");
		}



		/*
		2.> How to print int value in this line System.out.println(ar); 
		
		*/
		System.out.println("Enter Int value");
		int n = sc.nextInt();
		System.out.println("Enter Float value");
		float f = sc.nextFloat();
		System.out.println("Enter String value");
		String s1 = sc.nextLine();
		System.out.println(n);
		System.out.println(f);
		System.out.println(s1);

		/*
		3.> wap to left rotate given array by only one time
		i/p - 1,2,3,4
		o/p - 2,3,4,1
		
		*/
		int[] arr = {1,2,3,4};
		for (int i = 0; i < arr.length; i ++)
		{
			if (i != 0)
			{
				System.out.print(arr[i]+",");
			}
				
		}
		System.out.print(arr[0]+"\n");


		                         // OOORRR
		/*int temp = arr[0];
		for (int i = 1; i < arr.length; i ++)
		{
			arr[i - 1] = a[i];
		}
		arr[arr.length()-1] = temp;*/


			/*
		3.> wap to left rotate given array by multiple time
		i/p - 1,2,3,4
		o/p - 2,3,4,1
		
		*/
		int times = 0;
		while(times < 9){
		for (int i = 0; i < arr.length; i ++)
		{
			if (i != 0)
			{
				System.out.print(arr[i]+",");
			}
				
		}
		System.out.println(arr[0]+"\n");
		times ++;
		}
	}
}
