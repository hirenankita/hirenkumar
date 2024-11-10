package day26_09;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/en-gb?route");
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.manage().deleteAllCookies();
		System.out.println(driver.getTitle());
		Thread.sleep(20000);
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("hiren1");
		driver.findElement(By.name("lastname")).sendKeys("chotaliya1");
		driver.findElement(By.name("email")).sendKeys("hirenchotaliya1@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456789");
		Thread.sleep(5000);
//		driver.findElement(By.cssSelector("input[name=\"newsletter\"]")).click();
		driver.findElement(By.xpath("//*[@name='agree']")).isEnabled();	
		driver.findElement(By.xpath("/html/body/main/div[2]/div/div/form/div/button")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
