package day27_09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testngexa {

	WebDriver driver;
	@BeforeMethod
	void webopen()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
	}
	
	@Test(priority=0)
	void login()
	{
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.id("FirstName")).sendKeys("hiren");
		driver.findElement(By.id("LastName")).sendKeys("chotaliya");
		driver.findElement(By.id("Email")).sendKeys("hiren@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("123456");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
		driver.findElement(By.id("register-button")).click();
	}
	@Test(priority=1)
	void logout()
	{
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.id("FirstName")).sendKeys("hiren");
		driver.findElement(By.id("LastName")).sendKeys("chotaliya");
		driver.findElement(By.id("Email")).sendKeys("hiren@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("123456");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
	}
	@AfterMethod()
	void quit()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
}
