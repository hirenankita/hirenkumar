package day01_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class crossbrowsersametime {

	WebDriver driver;
	@Test
	@Parameters("browsers")
	
	public void veryfypage(String browsername) throws InterruptedException
	{
	if(browsername.equalsIgnoreCase("chrome"))
	{
		driver = new ChromeDriver();
	}
	else if(browsername.equalsIgnoreCase("edge"))
	{
		driver = new EdgeDriver();
	}
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/register");
	Thread.sleep(2000);
	driver.quit();
	
	}
	
	
	
	
	
	
	
	
	
	
	
}
