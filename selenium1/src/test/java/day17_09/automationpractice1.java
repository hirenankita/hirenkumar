package day17_09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationpractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		List <WebElement> tick = driver.findElements(By.cssSelector("td>[type=\"checkbox\"]"));
		
		for(int i = 0; i<tick.size();i++)
			
		{
			
			tick.get(i).click();			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
