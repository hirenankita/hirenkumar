package day16_09;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cssselector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ChromeDriver driver = new ChromeDriver();
		 
		 WebDriverWait mytime = new WebDriverWait(driver,Duration.ofSeconds(10));
		 
		
		 driver.manage().window().maximize();
		 
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
	     driver.get("https://demowebshop.tricentis.com/");
	     
	     driver.findElement(By.cssSelector("a.ico-login")).click();
	     
	     driver.findElement(By.cssSelector("input#Email")).sendKeys("hiren");
	     
	     mytime.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[id=\"Password\"]"))).sendKeys("123456");
	     
	     driver.findElement(By.cssSelector("input[id=\"Password\"]")).sendKeys("123456");
	     
	     driver.quit();
		
		
		
		
		
		
		
		
		
		
		
	}

}
