//Single Inheritance Example

class animal
{
	int a;
	animal(){
		a = 10;
	}
}

class Dog extends animal
{
	int a;
	int b;
	Dog(){
		a = 11;
		b = 20;
	}
	void Disp(){
		System.out.println(super.a);
		System.out.println(a);
		System.out.println(b);
	}
}

class Inheritance1 
{
	public static void main(String[] args) 
	{
		Dog d = new Dog();
		d.Disp();
	}
}
