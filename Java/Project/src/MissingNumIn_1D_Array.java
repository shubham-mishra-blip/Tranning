import java.util.*;

class MissingNumIn_1D_Array 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("How many value you want to enter");
		int n = scan.nextInt();
		int[] ar = new int[n];
		int j = 0;
		while(n >0){
			ar[j] = scan.nextInt();
			j++;
			n--;
		}
		
		Arrays.sort(ar);
		int sum = ar[1] - ar[0];
		int first = ar[0];
		for(int i = 0; i < ar.length; i++){
			if(ar[i] == first){
				first +=sum;
			}
			else{
				System.out.println(first);
				break;
			}
		}
	}
}
