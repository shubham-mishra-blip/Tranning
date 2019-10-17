//How to find duplicate number on Integer array in Java?

//1. Simple Ways

/*

import java.util.*;
class ProArray1 
{
	static void dubliFind(int[] a, int size){
		System.out.print("Repeating Nmber is: ");

		for (int i =0; i < size; i ++)
		{
			for (int j = i+1; j < size; j ++)
			{
				if (a[i] == a[j])
				{
					System.out.print(a[i] + " ");
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		ProArray1 proarray = new ProArray1();
		System.out.println("Hello World! We are here to find the dublicate number on integer array in integer\n\n\n\n\n");
		
		int[] arr = {1,2,1,3,4,2};
		int arr_size = arr.length;
		proarray.dubliFind(arr, arr_size);
	}
}
*/


//       OR
// 2. Using Count

import java.util.*;
class ProArray1 
{
	static void dubliFinder(int[] a, int size){
		int[] count = new int[size];
		for (int i = 0; i < size; i ++)
		{
				if (count[a[i]] == 1)
				{
					System.out.print(a[i] + " ");
				}
				else 
					count[a[i]]++;
			
		}
	}
	public static void main (String args[]){
		ProArray1 proarray = new ProArray1();
		System.out.println("Hello World! We are here to find the dublicate number on integer array in integer\n\n\n\n\n");
		
		int[] arr = {1,2,1,3,4,2};
		int arr_size = arr.length;
		proarray.dubliFinder(arr, arr_size);
	}
}