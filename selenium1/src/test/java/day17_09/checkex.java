package day17_09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		List <WebElement> checkbox = driver.findElements(By.cssSelector("input.form-check-input[type=\"checkbox\"]"));
		
		for (int i = 5; i<checkbox.size();i++)
		{
			checkbox.get(i).click();
		}
		
		driver.quit();
		
		
		
		
		
		
		
		
		
	}

}
