package day18_09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebooklogi {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		System.out.println(driver.getTitle());
		
		driver.manage().deleteAllCookies();
		
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/div[1]/input")).sendKeys("hiren");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input")).sendKeys("chotaliya");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input")).sendKeys("9979597008");
		
		driver.findElement(By.xpath("//*[@id=\"password_step_input\"]")).sendKeys("1234566");
		
		WebElement dropdown = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[1]"));
		
		Select drop1 = new Select(dropdown);
		
		drop1.selectByValue("30");
		
		Thread.sleep(5000);
		
		WebElement dropdown1 = driver.findElement(By.id("month"));
		
		Select drop2 = new Select(dropdown1);
		
		drop2.selectByIndex(10);
		
		Thread.sleep(3000);
		
//		drop2.selectByValue("Nov");
		
		WebElement dropdown2 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[3]"));
		
		Select drop3 = new Select(dropdown2);
		
		drop3.selectByValue("1991");
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[value=\"2\"]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("u_0_n_BB")).click();
		
		
//		driver.quit();
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
