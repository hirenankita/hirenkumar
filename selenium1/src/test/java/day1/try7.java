package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class try7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.navigate().refresh();
		driver.manage().deleteAllCookies();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("name")).sendKeys("hiren chotaliya");
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
