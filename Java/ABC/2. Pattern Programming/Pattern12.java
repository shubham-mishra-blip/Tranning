class Pattern12 
{
	public static void main(String[] args) 
	{
		for(int i = 0; i <= 4; i ++){
			for(int k = 0; k <= i; k++){
				System.out.print(" ");
			}
			for(int j = 9; j >=(2*i)+1; j --){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
