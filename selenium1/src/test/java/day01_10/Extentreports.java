package day01_10;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentreports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("hiren1.html");
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Excelr");
		extent.attachReporter(spark);
		
		ExtentTest test = extent.createTest("logintest");
		test.pass("loginsuccessfull");
		test.fail("login unsuccessful");
		extent.flush();
		
		 
		
		
		
		
		
		
	}

}
