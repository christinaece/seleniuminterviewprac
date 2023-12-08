package org.prac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Christina\\eclipse-workspace\\Selenium Interview Prac\\driver\\chromedriver.exe");
				
		WebDriver dri=new ChromeDriver();
		
		dri.manage().window().maximize();
		
		dri.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> elements = dri.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
		 for (WebElement webElement : elements) {    //To get more than one date we have to use foreach loop to print in console
			   
			   String text = webElement.getText();
			
			  System.out.println(text);
		}
			
		WebElement ele = dri.findElement(By.xpath("//table[@id='customers']/tbody/tr[5]/td[2]"));
		
		String text = ele.getText();
		System.out.println(text);
	}

}
