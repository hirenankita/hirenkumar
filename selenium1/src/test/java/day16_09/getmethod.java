package day16_09;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      //  ChromeDriver driver = new ChromeDriver();
        FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
	//	System.out.println(driver.getPageSource());
		
		driver.navigate().refresh();
		
		 String title = driver.getTitle();
		 
		 System.out.println(title);
		 
		
		driver.close();		
		
		
		
		
		
		
	}

}
