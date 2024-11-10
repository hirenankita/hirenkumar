package day17_09;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class hh {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().deleteAllCookies();
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[1]")).click();
		
		Alert myalert = driver.switchTo().alert();
		
		System.out.println(myalert.getText());
		
		Thread.sleep(5000);
		
		myalert.accept();
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
