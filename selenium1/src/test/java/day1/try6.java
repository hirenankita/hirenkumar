package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class try6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		
		driver.findElement(By.xpath("//*[@id=\"buttons\"]/ytd-button-renderer/yt-button-shape/a/yt-touch-feedback-shape/div/div[2]")).click();
		
	    driver.findElement(By.id("identifierId")).sendKeys("hirenkumarchotaliya@gmail.com");
	    
	    driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
	    
	    System.out.println(driver.manage().getCookies());
	    
	    driver.manage().deleteAllCookies();
	    
	    System.out.println(driver.manage().getCookies());
	    
	    
     	driver.quit();
	    
		
		
		
		
		
		
		
		
		
	}

}
