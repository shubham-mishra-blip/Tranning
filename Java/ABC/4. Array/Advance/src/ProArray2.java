//Searching if array contains a number in Java


class ProArray2 
{

	static int Searc(int[] a, int x){
		int n = a.length;
		for (int i =0; i < n; i ++)
		{
			if (a[i]== x)
			{
				return i;
			}
		}
					return -1;

	}
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,5,6};
		int num = 2;
		int op = Searc(arr, num);
		if (op == -1)
		{
			System.out.println("Number not found");
		}
		else
			System.out.println("Hurray! Number founded = "+ (op+1));


		
	}
}


//2nd Way
/*class ProArray2 
{

	static int Searc(int[] a, int x){
		for (int i =0; i < a.length; i +=1)
		{
			if (a[i]== x)
			{
				return i;
			}
		}
					return -1;

	}
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,5,6};
		int num = 2;
		int op = Searc(arr, num);
		if (op == -1)
		{
			System.out.println("Number not found");
		}
		else
			System.out.println("Hurray! Number founded = "+ (op+1));


		
	}
}*/

//3rd Ways (using Binary Search)
/*import java.util.Arrays; 

class ProArray2 
{

	static void Searc(int[] a, int x){

		int res = Arrays.binarySearch(a, x);

		boolean test = res > 0? true:false;

		System.out.println("is "+x+" is present in list? "+test);

	}
		
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,5,6};
		int num = 2;
		Searc(arr, num);
		
		
	}
}*/