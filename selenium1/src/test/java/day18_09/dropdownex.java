package day18_09;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;


public class dropdownex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		 
		 driver.manage().deleteAllCookies();
		 
		 driver.findElement(By.xpath("//*[@id=\"u_0_8_bq\"]")).sendKeys("hiren");
		
		
		
		
		
		
		
	}

}
