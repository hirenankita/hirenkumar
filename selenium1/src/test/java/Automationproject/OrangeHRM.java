package Automationproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrangeHRM {

		WebDriver driver;
		WebDriverWait time = new WebDriverWait(driver,Duration.ofSeconds(10));
		@BeforeClass
		void setup() throws InterruptedException
		{
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		}
		@Test(priority=1)
		void login() throws InterruptedException, AWTException
		{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span")).click();
//		driver.navigate().refresh();
		}
		@Test(priority=2)
		void personaldetails() throws InterruptedException, AWTException
		{
		WebDriverWait time = new WebDriverWait(driver,Duration.ofSeconds(10));	
	    WebElement firstname = time.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div/div/div[2]/div[1]/div[2]/input")));
	    String fn = firstname.getAttribute("value");
	    for(int i=0;i<fn.length();i++)
	    {
	    	firstname.sendKeys(Keys.BACK_SPACE);
	    }
	    firstname.sendKeys("hiren");
	    WebElement middlename = time.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='middleName']")));
	    String mn = middlename.getAttribute("value");
	    for(int i=0;i<mn.length();i++)
	    {
	    	middlename.sendKeys(Keys.BACK_SPACE);
	    }
	    middlename.sendKeys("babubhai");
	    WebElement lastname = time.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='lastName']")));
	    String ln = lastname.getAttribute("value");
	    for(int i=0;i<ln.length();i++)
	    {
	    	lastname.sendKeys(Keys.BACK_SPACE);
	    }
	    lastname.sendKeys("chotaliya");
	    WebElement empid = time.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[2]/input")));
	    String id = empid.getAttribute("value");
	    for(int i=0;i<id.length();i++)
	    {
	    	empid.sendKeys(Keys.BACK_SPACE);
	    }
	    empid.sendKeys("23167");
	    WebElement othid = time.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[2]/input")));
	    String id2 = othid.getAttribute("value");
	    for(int i=0;i<id2.length();i++)
	    {
	    	othid.sendKeys(Keys.BACK_SPACE);
	    }
	    othid.sendKeys("0388");
	    WebElement driverln = time.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input")));
	    String id3 = driverln.getAttribute("value");
	    for(int i=0;i<id3.length();i++)
	    {
	    	driverln.sendKeys(Keys.BACK_SPACE);
	    }
	    driverln.sendKeys("gujarat123");
	    WebElement licex = time.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input")));
	    String id4 = licex.getAttribute("value");
	    for(int i=0;i<id4.length();i++)
	    {
	    	licex.sendKeys(Keys.BACK_SPACE);
	    }
	    licex.sendKeys("2030-20-10");	
	    WebElement dob = time.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div/input")));
	    String id5 = dob.getAttribute("value");
	    for(int i=0;i<id5.length();i++)
	    {
	    	dob.sendKeys(Keys.BACK_SPACE);
	    }
	    dob.sendKeys("2000-10-10");
	    driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
	    driver.findElement(By.xpath("(//button[@type='submit'][normalize-space()='Save'])[1]")).click();
	    Thread.sleep(2000);
		}
	    @Test(priority=3)
		void customfield() throws InterruptedException
		{
	    WebDriverWait time = new WebDriverWait(driver,Duration.ofSeconds(10));	
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[1]/div/div[2]/div/div")).click();
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[5]")).click();
	    WebElement tf = time.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[2]/div/div[2]/input")));
	    String id6 = tf.getAttribute("value");
	    for(int i=0;i<id6.length();i++)
	    {
	    	tf.sendKeys(Keys.BACK_SPACE);
	    }
	    tf.sendKeys("1595");
		driver.findElement(By.xpath("(//button[@type='submit'][normalize-space()='Save'])[2]")).click();
	    Thread.sleep(2000);
		}
	    @Test(priority=4)
		void addattachment() throws AWTException, InterruptedException
		{
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div/button")).click();
	    WebElement file =  driver.findElement(By.xpath("//div[@class='oxd-file-button']"));
	    Actions act = new Actions(driver);
	    act.moveToElement(file).click().perform();
	    Robot rb = new Robot();
	    rb.delay(2000);
	    StringSelection ss = new StringSelection("C:\\New folder\\Capture.PNG");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	    rb.keyPress(KeyEvent.VK_CONTROL);
	    rb.keyPress(KeyEvent.VK_V);
	    rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyRelease(KeyEvent.VK_V);
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='orangehrm-attachment']//button[@type='submit'][normalize-space()='Save']")).click();
	    Thread.sleep(2000);
		}
		
		@Test(priority=5)
		void logput()
		{
	    driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
	    driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		}
		@AfterClass  
	    void quit ()
		{  
	        if (driver != null)
	        {  
	            driver.quit();  
	        }  
	    }  
	}

