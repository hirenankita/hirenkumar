package day17_09;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class navigateex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		 ChromeDriver driver = new ChromeDriver();
        
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		driver.findElement(By.cssSelector("a.ico-login")).click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		
		
		
		
	}

}
