import org.apache.poi.ss.usermodel.Row;  
import org.apache.poi.ss.usermodel.Sheet;  
import org.apache.poi.ss.usermodel.Workbook;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.chrome.ChromeDriver;  
import org.openqa.selenium.support.ui.Select;  

import java.io.FileOutputStream;  
import java.io.IOException;  
import java.util.List;  
public class inexcelfile {
	public static void main(String[] args) {  
          

        // Initialize the WebDriver  
        ChromeDriver driver = new ChromeDriver();  
        driver.get("https://demo.guru99.com/test/newtours/register.php");  

        // Locate the country dropdown  
        WebElement countryDropdown = driver.findElement(By.name("country"));  
        Select select = new Select(countryDropdown);  

        // Get all the options in the dropdown  
        List<WebElement> options = select.getOptions();  

        // Create an Excel workbook and sheet  
        Workbook workbook = new XSSFWorkbook();  
        Sheet sheet = workbook.createSheet("Countries");  

        // Write options to the Excel sheet  
        int rowCount = 0;  
        for (WebElement option : options) {  
            Row row = sheet.createRow(rowCount++);  
            row.createCell(0).setCellValue(option.getText());  
        }  

        // Write to the Excel file  
        try (FileOutputStream outputStream = new FileOutputStream(System.getProperty("user.dir")+"\\Files\\countries.xlsx")) {  
            workbook.write(outputStream);  
        } catch (IOException e) {  
            e.printStackTrace();  
        } finally {  
            try {  
                workbook.close();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
            // Close the browser  
            driver.quit();  
        }  
        
        System.out.println("Country options have been written to Countries.xlsx");  
    }  
}  


