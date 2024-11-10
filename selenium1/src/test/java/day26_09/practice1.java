package day26_09;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.navigate().refresh();
		driver.manage().deleteAllCookies();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.name("FirstName")).sendKeys("hiren1");
		driver.findElement(By.name("LastName")).sendKeys("chotaliya");
		driver.findElement(By.name("Email")).sendKeys("hirenkumar123@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("123456");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("123456");
		driver.findElement(By.name("register-button")).click();
		String ti = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]")).getText();
		System.out.println(ti);
		if(ti.contains("Your registration completed"))
		{
			System.out.print("Succesful");
		}	
		else
		{
			System.out.print("not Successful");
		}	
		driver.quit();	
			
			
		
			
		
		
		
		
	}

}
