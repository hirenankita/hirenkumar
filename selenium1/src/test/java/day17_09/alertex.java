package day17_09;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		

		 ChromeDriver driver = new ChromeDriver();
      
		
		driver.manage().window().maximize();
		
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		
		driver.findElement(By.xpath("//*[@id=\"confirmexample\"]")).click();
		
		Alert myalert = driver.switchTo().alert();
		
		System.out.println(myalert.getText());
		
		Thread.sleep(5000);
		
		myalert.accept();
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
		
		
		
	}

}
