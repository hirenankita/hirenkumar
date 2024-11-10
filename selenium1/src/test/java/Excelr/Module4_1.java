package Excelr;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Module4_1 {

	private Workbook workbook;
	private Sheet sheet;
	
	public Module4_1(String filepath,String sheetname)throws IOException
	{
		FileInputStream fis = new FileInputStream(filepath);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(sheetname);
	}
		
	public int getRowCount()
	{
		return sheet.getLastRowNum();
	}
		
	public String getcelldata(int rownum,int colnum)
	{
		Row row = sheet.getRow(rownum);
		return row.getCell(colnum).getStringCellValue();
	}
	public void close() throws IOException
	{
		workbook.close();
	}
		
}


