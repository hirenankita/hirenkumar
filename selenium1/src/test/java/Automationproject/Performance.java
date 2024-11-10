package Automationproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Performance {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		WebDriverWait time = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span")).click();
		driver.navigate().refresh();
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
	   /* WebElement nickname = time.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" //*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[2]/div/div/div[2]/input")));
	    String nn = nickname.getAttribute("value");
	    for(int i=0;i<nn.length();i++)
	    {
	    	nickname.sendKeys(Keys.BACK_SPACE);
	    }
	    nickname.sendKeys("hirita");
	   */
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
/*	    WebElement sinnum = time.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[3]/div/div/div[2]/input")));
	    String id5 = sinnum.getAttribute("value");
	    for(int i=0;i<id5.length();i++)
	    {
	    	sinnum.sendKeys(Keys.BACK_SPACE);
	    }
	    sinnum.sendKeys("99795");
	    
//	    driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")).click();
//	    driver.findElement(By.xpath("(//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div[2]/div[3]/span")).click();
//	    Thread.sleep(5000);
	                                
//	    List <WebElement> country = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div/div[2]/i"));
//	    country.click();	   
//	    Select name = new Select(country);
//	    name.selectByVisibleText("Married");
//	    *[@id="app"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div/input
//	    WebElement dob = time.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div/input")));
//	    String id6 = dob.getAttribute("value");
//	    System.out.println(id6);
//	    for(int i=0;i<id6.length();i++)
//	    {
//	    	dob.sendKeys(Keys.BACK_SPACE);
//	    }
//	    dob.sendKeys("1991-12-11"); 
// 	driver.findElement(By.xpath("//*[@id=\\\"app\\\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div/div[2]/i")).click();
//	    driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div[2]/div[6]/span")).click();
//*/       
	    WebElement dob = time.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div/input")));
	    String id5 = dob.getAttribute("value");
	    for(int i=0;i<id5.length();i++)
	    {
	    	dob.sendKeys(Keys.BACK_SPACE);
	    }
	    dob.sendKeys("2000-10-10");
	    driver.findElement(By.xpath("//label[normalize-space()='Female']")).click();
//	    driver.findElement(By.xpath("(//button[@type='submit'][normalize-space()='Save'])[1]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[1]/div/div[2]/div/div")).click();
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[5]")).click();
//	    WebElement country = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[1]/div/div[2]/div/div"));
//      country.click();	   
//	    Select name = new Select(country);
//	    name.selectByIndex(2);
	    WebElement tf = time.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[2]/div/div[2]/input")));
	    String id6 = tf.getAttribute("value");
	    for(int i=0;i<id6.length();i++)
	    {
	    	tf.sendKeys(Keys.BACK_SPACE);
	    }
	    tf.sendKeys("1595");
		
		
		
		
	
		
	}

}
