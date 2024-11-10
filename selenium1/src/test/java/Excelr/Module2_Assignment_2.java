package Excelr;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Module2_Assignment_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		try 
		{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.navigate().refresh();
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("hirenkumar");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.accept();
		Thread.sleep(2000);
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.accept();
		Thread.sleep(2000);
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
