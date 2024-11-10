package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("hirenkumar@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("12345");
		
		driver.findElement(By.name("login")).click();
		
		
		//Thread.sleep(2000);
		
		//driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
