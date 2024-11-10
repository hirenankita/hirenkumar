package day16_09;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class try1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://learn.excelr.com/login");
		
		System.out.println(driver.getTitle());
		
        driver.findElement(By.cssSelector("input#login-email")).sendKeys("hirenkumar@gmail.com");
        
        driver.findElement(By.cssSelector("input.input-block")).sendKeys("1234566");
       
        
        Thread.sleep(5000);
		
     	//driver.quit();
		
		
		
		
		
		
	}

}
