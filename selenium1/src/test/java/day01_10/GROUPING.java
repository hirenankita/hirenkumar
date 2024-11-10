package day01_10;

import org.testng.annotations.Test;

public class GROUPING {

	@Test(groups="odd")
	void test1()
	{
		System.out.println("this is first test");
	}
	
	@Test(groups="even")
	void test2()
	{
		System.out.println("this is second test");
	}
	@Test(groups="odd")
	void test3()
	{
		System.out.println("this is third test");
	}
	@Test(groups="even")
	void test4()
	{
		System.out.println("this is fourth test");
	}
	
	
	
	
}
