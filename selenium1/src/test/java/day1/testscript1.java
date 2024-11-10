    package day1;

    import org.openqa.selenium.chrome.ChromeDriver;

    public class testscript1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		// open browser
		
		ChromeDriver driver = new ChromeDriver();//used to open a browser
		
		// maximize windows
		
		driver.manage().window().maximize(); // 
		
		// open the URL
		
		driver.get("https://www.google.co.in/");
		
		String hir = driver.getTitle();
		System.out.println(hir);
		
		if(hir.contains("Google"))
		{
			System.out.println("test case passed");
		}
		else
		{
			System.out.println("test is failed");
		}
		// stop for time
		
		 Thread.sleep(1000);
		
		// quit 
		
		driver.quit();
		
		
		
		
		
		
		
		
		
	}

}
