import org.openqa.selenium.By;  
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;  

import java.util.List;  
public class SelectAllCountriesExample {
	 public static void main(String[] args) {  
	       ChromeDriver driver =new ChromeDriver();
	        try {  
	            // Navigate to the registration page  
	            driver.get("https://demo.guru99.com/test/newtours/register.php");  

	            // Locate the country dropdown  
	            WebElement countryDropdown = driver.findElement(By.name("country"));  

	            // Create a Select object to interact with the dropdown  
	            Select selectCountry = new Select(countryDropdown);  

	            // Get all options from the dropdown  
	            List<WebElement> allOptions = selectCountry.getOptions();  

	            // Loop through each option and print the text (or select it if needed)  
	            for (WebElement option : allOptions) {  
	                // Print the country name  
	                System.out.println("Country: " + option.getText());  
	                
	                // Optionally select each country one by one (uncomment if required)  
	                // selectCountry.selectByVisibleText(option.getText());  
	                // Add any actions you want to perform after selecting each country  
	            }  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        } finally {  
	            // Close the browser after actions  
	            driver.quit();  
	        }  
	    }  
	}  

