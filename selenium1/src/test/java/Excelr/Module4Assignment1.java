package Excelr;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Module4Assignment1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/V4/index.php");
		driver.navigate().refresh();
		FileInputStream file = new FileInputStream("C:\\Users\\HIRENC\\eclipse-workspace\\selenium1\\Files");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		int totrow = sheet.getLastRowNum();
		int totalcell = sheet.getRow(1).getLastCellNum();
		for(int r=1;r<=totrow;r++)
		{
			XSSFRow currentrow = sheet.getRow(r);
			String id1 = currentrow.getCell(0).getStringCellValue();
			String pd1 = currentrow.getCell(1).getStringCellValue();
			driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(id1);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pd1);
			
		}
		
		
		
		
		
		
		
		
		
	}

}
