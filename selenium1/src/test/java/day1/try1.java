package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class try1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		driver.manage().deleteAllCookies();
		System.out.println(driver.manage().getCookies());
		
		driver.findElement(By.name("username")).sendKeys("hiren");
		
		driver.findElement(By.name("password")).sendKeys("123456");
		
		//driver.findElement(By.className("x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1xmf6yo x1e56ztr x540dpk x1m39q7l x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1")).click();
		
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
		
		

		Thread.sleep(5000);
		String title= driver.getTitle();
		 
		System.out.println(title);
		 
		 if (title.contains("Instagram"))
		 {
			System.out.println("test case is passed") ;
		 }
		 else
		 {
			 System.out.println("test case is failed") ;
		 }
			 
		 driver.quit();
		
		
		
		
	}

}
