package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class try2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.navigate().refresh();
		
		 String title = driver.getTitle();
		 
		 System.out.println(title);
		 
		 if(title.contains("Demo Web Shop"))
		 {
			 System.out.println("testcase is passes");
		 }
		
		 else
		 {
			 System.out.println("testcase is failed");
		 }
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();//by full xpath
		
		// driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();//by xpath 		  	
		
		driver.findElement(By.className("ico-login")).click();//by classname
		
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("hiren@123");
		
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("12356");
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		
	    boolean logo= driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[1]/a/img")).isDisplayed();//for logo or image
		 
	     System.out.println(logo);
	     
	    driver.manage().window().setSize(new Dimension(800,800));
     
		Thread.sleep(2000);
		
		driver.manage().deleteAllCookies();
		
		System.out.println(driver.manage().getCookies());		
		driver.quit();
		
		
	}

}
