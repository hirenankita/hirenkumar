package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class testscript2 {
	
	public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.id("small-searchterms")).sendKeys("hiren");
	
	Thread.sleep(2000);
	
	driver.quit();
	
	
}
}