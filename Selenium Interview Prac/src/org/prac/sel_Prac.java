package org.prac;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class sel_Prac {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Christina\\eclipse-workspace\\Selenium Interview Prac\\driver\\chromedriver.exe");  //map concept
		WebDriver driver=new ChromeDriver();  //object creation or upcasting
		
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");  //method overloading 
		//driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
		//Thread.sleep(5000);
		//driver.switchTo().alert().accept();
		//driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
		//Thread.sleep(5000);

		//driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("christina");
		Thread.sleep(3000);
	    driver.switchTo().alert().accept();
	    
	    
	    
	    TakesScreenshot ts=(TakesScreenshot) driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    File destination = new File("C:\\Users\\Christina\\eclipse-workspace\\Selenium Interview Prac\\screenshot\\data.png");
	      FileHandler.copy(source, destination);
		
	
		
	}
	

}
