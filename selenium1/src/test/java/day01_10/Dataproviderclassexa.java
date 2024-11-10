package day01_10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderclassexa {

	WebDriver driver;
	
	@Test(dataProvider="automationdata")
	public void loginpage(String username , String password) throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		String expectedmessage = "Please enter a valid email address.";
		String originalmessage = driver.findElement(By.xpath("//span[@for='Email']")).getText();
		Assert.assertEquals(originalmessage, expectedmessage);
		Thread.sleep(3000);
		driver.quit();
	}
	
	   @DataProvider(name="automationdata")
	   public Object [][] passData()
	   {
		   Object[][] data = new Object[3][2];
		   data[0][0] = "hiren";
		   data[0][1] = "hiren123";
		   
		   data[1][0] = "anikta";
		   data[1][1] = "ankita123";
		   
		   data[2][0] = "monika";
		   data[2][1] = "monika123";
	
		   return data;
	   }
	
	
	
	
	
	
}
