// Find the Missing Number


//Prepbyte Infosis Question

class ProArray 
{

	public static int missinum(int a[], int n){
		int ans = (n+1)*(n+2) / 2;
		for (int i = 0; i < n; i++)
		{
			ans -= a[i];
		}
		return ans;
	}
	public static void main(String[] args) 
	{
		int[] arr = new int[]{1,2,3,5,6};
		int op = missinum(arr,5);
		System.out.println(op);
		
	}
}
