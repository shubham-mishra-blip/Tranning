//How to find largest and smallest number in unsorted array?


import java.util.*;


class ProArray3
{
	static void findBigSmall(int[] a){
		int n = a.length;
		Arrays.sort(a);
		System.out.println("The Smallest number is "+a[0]);
		System.out.println("The biggest number is "+a[n-1]);

	}
	public static void main(String[] args) 
	{
		int[] arr = {2,5,8,1,4,7};
		findBigSmall(arr);
	}
}




/*class ProArray3
{
	static void findBigSmall(int[] a){
		int n = a.length;
		Arrays.sort(a);
		System.out.println("The Smallest number is "+a[0]);
		System.out.println("The biggest number is "+a[n-1]);

	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		System.out.println("Enter 5 number below");
		for (int i =0; i < a.length; i ++)
		{
			a[i] = sc.nextInt();
		}
		findBigSmall(a);

	}
}*/