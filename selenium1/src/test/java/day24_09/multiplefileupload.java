package day24_09;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplefileupload {

	    public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		driver.manage().deleteAllCookies();
		String file1 = "C:\\New folder\\Assembly Work.xlsx";
		String file2 = "C:\\New folder\\mom.xlsx";
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
	/*	if(driver.findElement(By.xpath("(//ul[@id='fileList']//li)[2]")).getText().equals("mom.xlsx") && (driver.findElement(By.xpath("(//ul[@id='fileList']//li)[1]")).getText().equals("mom.xlsx")))
			
		
				{
					System.out.println("pass");
				}
	    else
				{
					System.out.println("fail");
				}
	    
		*/
		
	    String t1 =  driver.findElement(By.xpath("//*[@id=\"fileList\"]/li[1]")).getText();
//		System.out.println(t1);
		String t2 =  driver.findElement(By.xpath("//*[@id=\"fileList\"]/li[2]")).getText();
//		System.out.println(t2);
		if((t1.contains("Assembly Work.xlsx")&&(t2.contains("mom.xlsx"))))
		{
		 System.out.println("multiple file uploded suceesfully");
		}
		else
		{
		 System.out.println("multiple file uploded not suceesfully");
		}
		driver.quit();
		
	}

}
