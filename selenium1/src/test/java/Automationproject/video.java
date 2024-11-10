package Automationproject;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  

import javax.imageio.ImageIO;  
import java.awt.*;  
import java.awt.image.BufferedImage;  
import java.io.File;  
import java.io.IOException;

public class video {

	 public static void main(String[] args) throws AWTException, IOException {  
	        // Set up WebDriver  
	        
	        ChromeDriver driver = new ChromeDriver();  
	        
	        // Start recording  
	        Robot robot = new Robot();  
	        int counter = 0;  

	        driver.get("https://example.com"); // Your target URL  

	        // Capture screenshots at intervals  
	        for (int i = 0; i < 10; i++) { // Adjust the loop as needed  
	            BufferedImage screenCapture = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));  
	            ImageIO.write(screenCapture, "png", new File("screenshot" + (counter++) + ".png"));  
	            try {  
	                Thread.sleep(1000); // Wait for a second before next capture  
	            } catch (InterruptedException e) {  
	                e.printStackTrace();  
	            }  
	        }  

	        driver.quit(); // Close browser  
	    }  
	}  