package day23__09;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolldownex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?tag=googmantxtmob170-21&ascsubtag=_k_Cj0KCQjwxsm3BhDrARIsAMtVz6N8iubN77UDeMh4TERckJ0HKocJT2GEGCmQGeIq-UKGtTZ3nUrbqEAaAkiqEALw_wcB_k_");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		driver.manage().deleteAllCookies();
		 
		 
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,450)","");
//		System.out.println(js.executeScript("return window.pageYOffset",""));
		
		WebElement product = driver.findElement(By.xpath("//a[normalize-space()='Help']"));
		js.executeScript("arguments[0].scrollIntoView();",product);
		Thread.sleep(5000);
		driver.quit();
		
	}

}
