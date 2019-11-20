class Add
{
	void add(int a, float b){
		System.out.println(a+b);
	}
	void add(float a, double b){
		double d;
		d = a+b;
		System.out.println(d);
	}
}


class  NumericTypeCasting_MethodOverLoading
{
	public static void main(String[] args) 
	{
		Add ad = new Add();
		ad.add(24,56);             // We haven't create any method to accept two int value but here compile pass int value through float called Numeric type casting. 
	}
}
