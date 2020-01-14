
public class NumberToBinary {

	public static void toBinary(int n) {
		
		int temp=0;
		temp = n%2;
		if (n != 0) {
			System.out.print(temp);
			toBinary(temp = n/2);
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		int ii = 27;
		toBinary(ii);
		
	}

}
