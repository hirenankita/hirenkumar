package day11inheritance;


class animal
{
	String color = "black";
}

class dog extends animal
{
	String color = "White";	
	void displaycolor()
	{
		System.out.println(super.color);//you put super keyword
	}
	
}


public class Superex {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		dog d = new dog();
		d.displaycolor();
		
		
		
		
		
		
	}

}
