package day23__09;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?tag=googmantxtmob170-21&ascsubtag=_k_Cj0KCQjwxsm3BhDrARIsAMtVz6N8iubN77UDeMh4TERckJ0HKocJT2GEGCmQGeIq-UKGtTZ3nUrbqEAaAkiqEALw_wcB_k_");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		driver.manage().deleteAllCookies();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"\\screenshot\\amazonpage1.png");
		sourcefile.renameTo(targetfile);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		TakesScreenshot ts1 = (TakesScreenshot)driver;
		File sourcefile1 = ts1.getScreenshotAs(OutputType.FILE);
		File targetfile1 = new File(System.getProperty("user.dir")+"\\screenshot\\amazonepage2.png");
		sourcefile1.renameTo(targetfile1);
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[4]/div[2]/div[2]/div/a[1]")).click();
		TakesScreenshot ts2 = (TakesScreenshot)driver;
		File sourcefile2 = ts2.getScreenshotAs(OutputType.FILE);
		File targetfile2 = new File(System.getProperty("user.dir")+"\\screenshot\\amazonpage3.png");
		sourcefile2.renameTo(targetfile2);
		driver.quit();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
