package day10static;

class A
{
	int a = 100;
	void display()
	{
		System.out.println(a);
	}
}

class B extends A
{
	int b = 100;
	void display1()
	{
		System.out.println(b);
	}
}

class C extends B
{
	int b = 100;
	void display3()
	{
		System.out.println(b);
	}
}

public class singleinheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B objb = new B();
		objb.display();
		objb.display1();
		
		
		C objb1 = new C();
		objb1.display();
		objb1.display1();
		objb1.display3();
		
		
		
		
	}

}
