package day01_10;

import org.testng.annotations.Test;

public class Countexa {

	@Test(invocationCount=3)
	void example()
	{
		System.out.println("this is invocation count example");
	}

	@Test(invocationCount=4)
	void example1()
	{
		System.out.println("this is invocation count example 4");
	}
	
	
}
