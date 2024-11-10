package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktextex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.manage().getCookies());
		//driver.quit();
		
		
		
		//driver.navigate().refresh();
		//System.out.println(driver.manage().window().getSize());
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("Email")).sendKeys("hiren@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("123456");
		driver.findElement(By.name("password")).sendKeys("123456");
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
	}

}
