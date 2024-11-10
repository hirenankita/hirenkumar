package day27_09;

import org.testng.annotations.Test;

public class sample {

	@Test(priority=1)
	void testcase1()
	{
		System.out.println("this is testcase 1");
	}
	@Test (priority=3)
	void testcase2()
	{
		System.out.println("this is testcase 3");
	}
	@Test(priority=2)
	void testcase3()
	{
		System.out.println("this is testcase 2");
	}
}
