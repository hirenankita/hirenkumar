package Excelr;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Module1_Assingment_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		try 
		{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		driver.findElement(By.name("country")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select/option[129]")).click();
		driver.findElement(By.xpath("/html/body/div[2]")).click();
	
		Thread.sleep(5000);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally 
		{		
		driver.quit();
		}
		
		
		
		
		
		
		
		
		
	}

}
