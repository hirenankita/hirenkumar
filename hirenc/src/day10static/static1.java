package day10static;

public class static1 {
	
	static int a=10;
	int b=20;
	
	static void m1()
	{
		System.out.println(a);
	}
	
	void m2()
	{
		System.out.println(b);
	}
	
	void m3()
	{
		System.out.println(a);
		m1();
		System.out.println(b*b*b);
		m2();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	m1();
	System.out.println(static1.a);//use static variable
	static1 ST = new static1();
	ST.m3();
			
	}

}
