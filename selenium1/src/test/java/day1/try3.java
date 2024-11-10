package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class try3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		
		driver.navigate().refresh();
		
		driver.findElement(By.name("search_query")).sendKeys("new songs");
		
		driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon/span/div")).click();
		
		Thread.sleep(4000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
