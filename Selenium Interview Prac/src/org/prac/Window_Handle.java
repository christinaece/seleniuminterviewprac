package org.prac;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handle {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Christina\\eclipse-workspace\\Selenium Interview Prac\\driver\\chromedriver.exe");
		
        WebDriver dri=new ChromeDriver();

        dri.get("https://www.amazon.in/");
        
        String windowHandle = dri.getWindowHandle();
        
        System.out.println("first window:"  +windowHandle);
        
        WebElement element = dri.findElement(By.xpath("//a[text()='Amazon miniTV']"));
        Actions ac=new Actions(dri);
        for(int i=0; i<5; i++) {
       ac.contextClick(element).build().perform();
       Thread.sleep(4000);
Robot ro=new Robot();
ro.keyPress(KeyEvent.VK_PAGE_DOWN);
ro.keyRelease(KeyEvent.VK_PAGE_DOWN);
ro.keyPress(KeyEvent.VK_ENTER);
ro.keyRelease(KeyEvent.VK_ENTER);

        }
        
        Set<String> windowHandles = dri.getWindowHandles();
        List<String> li = new ArrayList<String>(windowHandles);
        dri.switchTo().window(li.get(3));
        System.out.println(dri.getCurrentUrl());
        System.out.println(windowHandles);

	}
}
