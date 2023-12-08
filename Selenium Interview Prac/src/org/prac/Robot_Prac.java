package org.prac;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_Prac {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Christina\\eclipse-workspace\\Selenium Interview Prac\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();

		
		WebElement Gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		
		Actions c=new Actions(driver);
		
		c.contextClick(Gmail).build().perform();  //To right click context click can be used 
		
		Thread.sleep(3000);
		
		Robot ro=new Robot();
		ro.keyPress(KeyEvent.VK_PAGE_UP);
		ro.keyRelease(KeyEvent.VK_PAGE_UP);
	ro.keyPress(KeyEvent.VK_ENTER);
	ro.keyRelease(KeyEvent.VK_ENTER);;
	
	}

}