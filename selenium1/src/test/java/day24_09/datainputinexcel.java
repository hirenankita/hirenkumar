package day24_09;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datainputinexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		FileOutputStream file =new FileOutputStream(System.getProperty("user.dir")+"\\Files\\Book2.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Exceler");
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("hiren");
		row1.createCell(1).setCellValue("kumar");
		row1.createCell(2).setCellValue("50");
		
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("ankita");
		row2.createCell(1).setCellValue("chotaliya");
		row2.createCell(2).setCellValue("100");
		
		XSSFRow row3 = sheet.createRow(2);
		row3.createCell(0).setCellValue("hardik");
		row3.createCell(1).setCellValue("monika");
		row3.createCell(2).setCellValue("200");
		
		workbook.write(file);
		workbook.close();
		
		System.out.println("all value updated");
		
		
		
		
		
		
		
		
		
		
	}

}
