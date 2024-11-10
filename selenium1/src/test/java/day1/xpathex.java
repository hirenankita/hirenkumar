package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		//driver.findElement(By.linkText("Log in")).click();
		
		//driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[2]")).sendKeys("hir@gmail");
		
		//driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[2]/input")).sendKeys("hir@gmail");
		
	     driver.findElement(By.xpath("//*[@class='ico-login']")).click();
	     driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("hir");
	   //  driver.manage().window().setSize(new Dimension (450,780));
	    boolean logostatus= driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[1]/a/img")).isDisplayed();
	    System.out.println(logostatus) ;
	  
	     
		
	}

}
