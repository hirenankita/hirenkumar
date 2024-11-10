package day18_09;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class tryfacebook {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		ChromeDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.navigate().refresh();
		driver.manage().deleteAllCookies();
		driver.findElement(By.name("firstname")).sendKeys("hiren");
		Thread.sleep(5000);
		driver.findElement(By.name("lastname")).sendKeys("chotaliya");
		Thread.sleep(5000);
		driver.findElement(By.name("reg_email__")).sendKeys("hirenkumarchotaliya@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.id("password_step_input")).sendKeys("sherelockhk@007");
		Thread.sleep(5000);
		WebElement dropdown = driver.findElement(By.id("day"));
		Thread.sleep(5000);
		dropdown.sendKeys("30");
		WebElement dropdown1 = driver.findElement(By.name("birthday_month"));
		
		Select set = new Select(dropdown1);
		set.selectByIndex(10);
		Thread.sleep(5000);
		WebElement dropdown2 = driver.findElement(By.name("birthday_year"));
		dropdown2.sendKeys("1991");
		driver.findElement(By.cssSelector("input[value=\"2\"]")).click();
		Thread.sleep(5000);
		
//		WebElement button = driver.findElement(By.xpath("//*[@id=\"u_0_n_8X\"]"));
//		Actions act = new Actions(driver);
//		act.contextClick(button).perform();
		driver.findElement(By.name("websubmit")).click();
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
	}

}
