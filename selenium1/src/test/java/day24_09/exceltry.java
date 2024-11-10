package day24_09;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceltry {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Files\\book3.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		int totrow = sheet.getLastRowNum();
		int totalcell = sheet.getRow(1).getLastCellNum();
		System.out.println(totrow);
		System.out.println(totalcell);
		for(int r=0;r<=totrow;r++)
		{
			XSSFRow currentrow = sheet.getRow(r);
			for(int c=0;c<totalcell;c++)
			{
				XSSFCell cell = currentrow.getCell(c);
				System.out.print(cell.toString()+"\t");
			}
			System.out.println();
		}
		
		 
		
		
		
		
		
		
		
		
		
		
		
	}

}
