package day11inheritance;

class A
{
	int a = 100;
	void dispaly()
	{
		System.out.println(a);
	}
}
class B extends A
{
	int b = 200;
	void dispaly()
	{
		System.out.println(a);
	}
}


class C  extends A
{
	int c = 400;
	void dispaly()
	{
		System.out.println(a);
	}
}

public class hierachy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C obj = new C();
		obj.dispaly();
		
		B obj1 = new B();
		obj1.dispaly();
		
		
		
	}

}
