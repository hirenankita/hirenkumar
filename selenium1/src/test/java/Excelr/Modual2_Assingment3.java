package Excelr;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Modual2_Assingment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		try
		{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[normalize-space()='Draggable']")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,320)","");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"\\screenshot\\Berforedropdown.png");
		sourcefile.renameTo(targetfile);
		Actions act = new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		WebElement box = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		act.dragAndDropBy(box, 300, 50).perform();
		TakesScreenshot ts1 = (TakesScreenshot)driver;
		File sourcefile1 = ts1.getScreenshotAs(OutputType.FILE);
		File targetfile1 = new File(System.getProperty("user.dir")+"\\screenshot\\Afterdropdown.png");
		sourcefile1.renameTo(targetfile1);
		Thread.sleep(2000);
		}
		catch (Exception e)
		{  
            System.out.print("error in programming");
		}    
		finally
		{	
		driver.quit();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
