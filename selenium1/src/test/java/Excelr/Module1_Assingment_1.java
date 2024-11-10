package Excelr;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Module1_Assingment_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		try 
		{
		driver.manage().window().maximize();
		driver.get("https://www.demo.guru99.com/test/radio.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().refresh();
	    String title = driver.getTitle();
	    System.out.println(title);
	    if(title.contains("Radio Button & Check Box Demo"))
	    {
	    	System.out.println("page title is veryfied");
	    }
	    else
	    {
	    	System.out.println("page title is not veryfied");
	    }
	    
	    driver.findElement(By.xpath("//input[@id='vfb-7-1']")).click();
		driver.findElement(By.xpath("//input[@id='vfb-6-1']")).click();
		driver.findElement(By.xpath("//input[@id='vfb-6-2']")).click();
		}
		catch (Exception e)
		{  
            System.out.print("error in programming");
		}    
		finally
		{
		driver.quit();
		}
		
		
		
		
		
		
	}

}
