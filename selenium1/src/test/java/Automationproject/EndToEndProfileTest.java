package Automationproject;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.chrome.ChromeDriver;  
import org.openqa.selenium.support.ui.ExpectedConditions;  
import org.openqa.selenium.support.ui.WebDriverWait;  

import java.time.Duration;  
public class EndToEndProfileTest {
	public static void main(String[] args) {  
        
        // Create a new instance of the Chrome driver  
        ChromeDriver driver = new ChromeDriver();  

        try {  
            // Step 1: Navigate to the login page  
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  

            // Step 2: Log in  
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  

            // Enter username  
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("Admin");  

            // Enter password  
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys("admin123");  

            // Click login button  
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']"))).click();  

            // Step 3: Navigate to the personal details page  
            // This might require waiting for the page to load and the menu to be available.  
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@ href='/web/index.php/pim/viewPimModule']"))).click();  
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'viewPersonalDetails')]"))).click();  

            // Step 4: Clear and fill personal details  
            // Wait for the first name field and interact with it  
            WebElement firstNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));  
            firstNameField.clear(); // Clear existing text  
            firstNameField.sendKeys("John"); // Enter desired first name  
            
            // Clear and fill in last name  
            WebElement lastNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lastName")));  
            lastNameField.clear(); // Clear existing text  
            lastNameField.sendKeys("Doe"); // Enter desired last name  
            
            // (Optional) Add more personal details as necessary.  

            // Step 5: Save changes  
            WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']")));  
            saveButton.click();  

            // Step 6: Validate that the information was updated (optional)  
            // This can include checking for a success message or reloading the page to confirm new details.  
            WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".oxd-toast--success")));  
            System.out.println("Profile updated successfully: " + successMessage.getText());  

        } catch (Exception e) {  
            e.printStackTrace();  
        } finally {  
            // Close the browser after all operations are done  
            driver.quit();  
        }  
	}
}
