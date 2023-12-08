package org.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Prac {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Christina\\eclipse-workspace\\Selenium Interview Prac\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		Actions a=new Actions(driver);
		
		WebElement data = driver.findElement(By.xpath("//a[text()='Images']"));
		
		a.moveToElement(data).click().build().perform();
		
		driver.navigate().to("https://www.leafground.com/frame.xhtml");
		
	}

}
