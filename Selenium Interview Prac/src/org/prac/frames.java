package org.prac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Christina\\eclipse-workspace\\Selenium Interview Prac\\driver\\chromedriver.exe");
		
		WebDriver dri=new ChromeDriver();
		
		dri.get("https://www.leafground.com/frame.xhtml");
		dri.manage().window().maximize();
		
		//dri.switchTo().frame(0);
		
		//WebElement data = dri.findElement(By.id("Click"));
		
		//data.click();
		
		//String text = data.getText();
		//System.out.println(text);
		
		dri.switchTo().defaultContent();
		
       List<WebElement> frame = dri.findElements(By.tagName("iframe"));
	    
	   int size = frame.size();
	   
	   System.out.println(size);
	   
	   dri.switchTo().defaultContent();
	    
	   WebElement data1 = dri.findElement(By.xpath("//iframe[@src='page.xhtml']"));
		
	   dri.switchTo().frame(data1);
	   
	   WebElement data2 = dri.findElement(By.id("frame2"));
		
		dri.switchTo().frame(data2);
		
	 WebElement data3 = dri.findElement(By.id("Click"));
	 data3.click();
	 
	 String text2 = data3.getText();
	 System.out.println(text2);

	
		
		
	}

}
