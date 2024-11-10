package day26_09;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys("11/30/2024");
		driver.findElement(By.xpath("/html")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
