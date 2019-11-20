class Add
{

	int add(int a , int b) {return a+b;}

	float add(int a , float b) {return a+b;}

	float add(float a, int b) {return a+b;}

	double add(double a, float b) {return a+b;}

	float add(float a, float b) {return a+b;}

	double add(double a, float b, int c) {return a+b+c;}

	float add(float a, float b, int c) {return a+b+c;}

	double add(int a, double b, double c) {return a+b;}

}

class MethodOverloading1 
{
	public static void main(String[] args) 
	{
		System.out.println("Method Overloading \n");
		Add ad = new Add();

		System.out.println(ad.add(25, 142.0f));
		System.out.println(ad.add(2.0, 142.0f));
		System.out.println(ad.add(65.0f, 1));
		System.out.println(ad.add(48, 142.0f));
		System.out.println(ad.add(6.0f, 22));
		System.out.println(ad.add(93.0, 24.7f, 39));

	}
}
