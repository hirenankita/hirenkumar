package Excelr;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Module4_2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String excelpath = "C:\\Users\\HIRENC\\eclipse-workspace\\selenium1\\Files\\logindata.xlsx";
		Module4_1 module4_1 = new Module4_1(excelpath,"Sheet1");
		driver.get("http://demo.guru99.com/V4/");
		
		for(int i=1; i<=module4_1.getRowCount();i++)
		{
			String email = module4_1.getcelldata(i, 0);
			String password = module4_1.getcelldata(i, 1);
			WebElement emailfield = driver.findElement(By.name("uid"));
			emailfield.clear();
			emailfield.sendKeys(email);
			Thread.sleep(2000);
			WebElement passwordfield = driver.findElement(By.name("password"));
			passwordfield.clear();
			passwordfield.sendKeys(password);
			Thread.sleep(2000);
			WebElement loginButton = driver.findElement(By.name("btnLogin"));
            loginButton.click();
            Thread.sleep(2000);

            
            if (driver.getCurrentUrl().contains("login"))
            {
                System.out.println("Login failed for: " + email);
            } 
            else 
            {
                System.out.println("Login successful for: " + email);
                    
                driver.findElement(By.xpath("//a[normalize-space()='Log out']")).click();
                Alert myalert = driver.switchTo().alert();
        		System.out.println(myalert.getText());
        		Thread.sleep(2000);
        		myalert.accept();
                driver.get("http://demo.guru99.com/V4/"); 
            }
        }

        
        driver.quit();
        module4_1.close();
		
		
	}
	

}