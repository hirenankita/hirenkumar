package day01_10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderexample1 {

	WebDriver driver;
	@Test(dataProvider="datalogin")
	public void loginpage(String firstname,String lastname,String email,String password,String confirmpassword) throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(confirmpassword);
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		Thread.sleep(2000);
		driver.quit();
	}			
	    	
	   @DataProvider(name="datalogin")
	   public Object[][]passdata()
	   {
		   Object[][]data = new Object[2][5];
		   data[0][0] = "hiren";
		   data[0][1] = "chotaliya";
		   data[0][2] = "hiren@gmail.com";
		   data[0][3] = "123456";
		   data[0][4] = "123456";
		   
		   data[1][0] = "hiren1";
		   data[1][1] = "chotaliya1";
		   data[1][2] = "hiren1@gmail.com";
		   data[1][3] = "123456";
		   data[1][4] = "123456";
		return data;
	   }
	   
	
	
	
	
	
}
