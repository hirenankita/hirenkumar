package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class try5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.navigate().refresh();
		
		driver.manage().deleteAllCookies();
		
		System.out.println(driver.manage().getCookies());
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		if(title.contains("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
    	{
			System.out.println("ok");
		}
		else
		{
			System.out.println("not ok");
		}	
		
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
		
		driver.findElement(By.id("ap_email")).sendKeys("9979597008");
		
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("ap_password")).sendKeys("sherelockhk@007");
		
		driver.findElement(By.id("signInSubmit")).click();
		
		Thread.sleep(10000);
		
		driver.manage().window().setSize(new Dimension(800,800));
		
		boolean logo= driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
		
		System.out.println(logo);
		
		
		
		
		
		driver.quit();
		
		
		
		
		
		
	}

}
