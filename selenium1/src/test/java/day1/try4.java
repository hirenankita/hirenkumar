package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class try4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://learn.excelr.com/login");
		
		driver.navigate().refresh();
		
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.id("login-email")).sendKeys("hirenkumarchotaliya@gmail.com");
		
		driver.findElement(By.id("login-password")).sendKeys("ankita@1907");
		
		driver.findElement(By.xpath("//*[@id=\"login\"]/button")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
		
		
	}

}
