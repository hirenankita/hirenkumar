package day30_09;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotationexa {
	
	@BeforeSuite
	void BeforeSuite()
	{
		System.out.println("This is BeforeSuite");
	}
	
	@BeforeTest
	void Beforetest()
	{
		System.out.println("this is Beforetest");
	}   
	
	@BeforeClass
	void Beforeclass()
	{
		System.out.println("this is Beforeclass");
	}   
    
	@BeforeMethod
	void BeforeMethod()
	{
		System.out.println("this is BeforeMethod");
	}
	
	@Test(priority=1)
	void test1()
	{
		System.out.println("this is first test");
	}
	
	@Test(priority=2)
	void test2()
	{
		System.out.println("this is second test");
	}
	
	@AfterMethod
	void AeforeMethod()
	{
		System.out.println("this is AfterMethod");
	}
	@AfterClass
	void Afterclass()
	{
		System.out.println("this is Afterclass");
	}   
	@AfterTest
	void Aftertest()
	{
		System.out.println("this is Aftertest");
	}   
	@AfterSuite
	void AfterSuite()
	{
		System.out.println("This is AfterSuite");
	}
	
	
	
	
	
}
