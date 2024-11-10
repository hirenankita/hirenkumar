import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.chrome.ChromeDriver;  
import org.openqa.selenium.support.ui.ExpectedConditions;  
import org.openqa.selenium.support.ui.WebDriverWait;  
  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.chrome.ChromeDriver;  
import org.openqa.selenium.support.ui.ExpectedConditions;  
import org.openqa.selenium.support.ui.WebDriverWait;  

import java.time.Duration;  



public class MakemytripFlightBooking {
	
	    public static void main(String[] args) {  
	        
	        ChromeDriver driver = new ChromeDriver();  
	        try {  
	            // Open MakeMyTrip website  
	            driver.get("https://www.makemytrip.com/");  

	            // Maximize the browser window  
	            driver.manage().window().maximize();  
	            
	            driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();

	            // Wait for the page to load completely  
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));  

	            // Accept cookies if prompted  
	            WebElement acceptCookies = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Accept All']")));  
	            acceptCookies.click();  

	            // Click on the "Flights" tab  
	            WebElement flightsTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Flights']")));  
	            flightsTab.click();  
	            Thread.sleep(2000);

	            // Enter the "From" location  
	            WebElement fromCity = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='From']")));  
	            fromCity.click();  
	            fromCity.sendKeys("Ahmedabad");  

	            // Wait and select Ahmedabad from suggestions  
	            WebElement selectFromCity = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='Ahmedabad']")));  
	            selectFromCity.click();  

	            // Enter the "To" location  
	            WebElement toCity = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='To']")));  
	            toCity.click();  
	            toCity.sendKeys("Hyderabad");  

	            // Wait and select Hyderabad from suggestions  
	            WebElement selectToCity = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='Hyderabad']")));  
	            selectToCity.click();  

	            // Click on the departure date field  
	            WebElement departureDateField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Departure']")));  
	            departureDateField.click();  

	            // Select departure date (15th November)  
	            WebElement departureDate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@aria-label='November 15, 2023']")));  
	            departureDate.click();  

	            // Click on return date field  
	            WebElement returnDateField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Return']")));  
	            returnDateField.click();  

	            // Select return date (25th November)  
	            WebElement returnDate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@aria-label='November 25, 2023']")));  
	            returnDate.click();  

	            // Click on search button  
	            WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Search')]")));  
	            searchButton.click();  

	            // Optionally, you can add more steps to handle the search results  
	            // ...  

	        } catch (Exception e) {  
	            e.printStackTrace();  
	        } finally {  
	            // Close the browser  
	            driver.quit();  
	        }  
	    }  
	
		
		
		
		
		
		
		
		
	}
 

