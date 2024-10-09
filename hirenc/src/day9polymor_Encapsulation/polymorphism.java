package day9polymor_Encapsulation;

public class polymorphism {

	int a=10,b=20;
	void sum()
	{
		System.out.println(a+b);//no parameter
	}
	void sum(int x,int y)//parameters are different
	{
		System.out.println(x+y);
	}
    void sum(int x ,double y)//different data type
    {
    	System.out.println(x+y);
    }
	void sum(double x,int y)//order of parameter
	{
		System.out.println(x+y);
	}
	
	
	}


