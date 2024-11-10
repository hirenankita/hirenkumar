package day24_09;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\New folder\\mom.xlsx");
		/*if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("mom.xlsx"))
				{
			    System.out.println("file uploded");
				}
		  else    
		        {
		    	System.out.println("not uploded");
	            }*/
		driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText();
//		driver.quit();
		
		
		
		
		
		
		
		
	}

}
