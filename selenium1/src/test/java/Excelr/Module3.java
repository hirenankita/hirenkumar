package Excelr;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Module3 {

	WebDriver driver;
	@BeforeMethod
	public void browsers()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
	}
	
	@Test(dataProvider="automationdata")
	public void loginpage(String username , String password) throws InterruptedException
	{   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/login.html");
		driver.navigate().refresh();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(password);
		driver.findElement(By.xpath("//span[normalize-space()='Sign in']")).click();
		String expectedmessage = "Successfully Logged in...";
		String originalmessage = driver.findElement(By.xpath("/html/body/div[2]/div/div/h3")).getText();
		Assert.assertEquals(originalmessage, expectedmessage);
//		Thread.sleep(3000);
		driver.close();
	}
	
	@DataProvider(name="automationdata")
	   public Object [][] passData()
	   {
		   Object[][] data = new Object[2][2];
		   data[0][0] = "hiren@gmail.com";
		   data[0][1] = "hiren123";
		   
		   data[1][0] = "anikta@gmail.com";
		   data[1][1] = "ankita123";
	
		   return data;
	   }
	 @AfterMethod  
	    public void quit() 
	 {  
	            driver.quit();  	
	 }
		       
}

