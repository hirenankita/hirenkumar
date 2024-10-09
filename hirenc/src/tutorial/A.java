package tutorial;

public class A {

	static int  a = 10;
	void op ()
	{
		int b = 20;
		System.out.println(A.a);
		System.out.println(b);
		a++;
		b++;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A ex = new A();
		ex.op();
		ex.op();

	}

}
