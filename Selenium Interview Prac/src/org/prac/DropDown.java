package org.prac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Christina\\eclipse-workspace\\Selenium Interview Prac\\driver\\chromedriver.exe");
		WebDriver web=new ChromeDriver();
		web.get("https://letcode.in/dropdowns");
		web.manage().window().maximize();
		
		 WebElement data = web.findElement(By.id("superheros"));
		
        Select sc=new Select(data);
        
        boolean single = sc.isMultiple();
        System.out.println(single);
        
		//String text = data.getText();
		//System.out.println(text);
		
		//List<WebElement> options = sc.getOptions();
		//int size = options.size();
		//System.out.println(size);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
