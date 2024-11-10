package day24_09;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelexa {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileInputStream file =new FileInputStream(System.getProperty("user.dir")+"\\Files\\Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet2");
		int totrow = sheet.getLastRowNum();
		int totalcell = sheet.getRow(1).getLastCellNum();
		System.out.println(totrow);	
		System.out.println(totalcell);
		for(int r=0;r<=totrow;r++)
		{
			XSSFRow currentRow = sheet.getRow(r);
			{
				for(int c=0;c<totalcell;c++)
				{
					XSSFCell cell = currentRow.getCell(c);
					System.out.print(cell.toString()+"\t");
				}
				System.out.println();
			}
			workbook.close();
			file.close();
		}
		
	
//		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Files\\Book1.xlsx");
//		XSSFWorkbook workbook = new XSSFWorkbook(file);
//		XSSFSheet sheet1 = workbook.getSheet("sheet1");
//		int totalnorow = sheet1.getLastRowNum();
//		System.out.println(totalnorow);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
