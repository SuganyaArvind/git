package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class table {
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/table.html");
		
		List<WebElement> tab = driver.findElements(By.tagName("table"));
		
//		System.out.println(tab.size());
		
		List<WebElement> alltr = driver.findElements(By.tagName("tr"));
//				System.out.println(alltr.size());

		for (WebElement trow : alltr) {
//			System.out.println(trow.getText());
			List<WebElement> alltd = trow.findElements(By.tagName("td"));
			System.out.println(alltd.get(1).getText());
						
		}
		
		
		
		
//		for (WebElement tcol : alltd) {
//			
//			System.out.println(tcol.getText());
//			
//			
//			
//		}
//		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
