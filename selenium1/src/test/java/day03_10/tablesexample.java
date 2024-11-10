package day03_10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tablesexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		List <WebElement> col = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]//table//thead//tr//th"));
		System.out.println(col.size());
		List<WebElement> row = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
		System.out.println(row.size());
		WebElement tab = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody"));
		List <WebElement> rowtab = tab.findElements(By.tagName("tr"));
		int rowcount = rowtab.size();
		for(int Row=0;Row<rowcount;Row++)
		{
			List <WebElement> coltab = rowtab.get(Row).findElements(By.tagName("td"));
			int colcount = coltab.size();
			{
				for(int column=0;column<colcount;column++)
				{
					String text = coltab.get(column).getText();
					System.out.print(" "+text+" ");
				}
				
				System.out.println();
				System.out.println();
				
			}
			
		}
		driver.quit();	
	}

}
