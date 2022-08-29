package org.test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample1 {
	
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Image.html");
		
		List<WebElement> links = driver.findElements(By.tagName("img"));
		System.out.println(links.size());
		
		
		
		for (int i = 0; i < links.size(); i++) {
			
			String attribute = links.get(i).getAttribute("src");
			
			if (!(attribute==null)) {
				
				URL url = new URL(attribute);
				URLConnection openConnection = url.openConnection();
				HttpURLConnection connection = (HttpURLConnection) openConnection;
				int responseCode = connection.getResponseCode();	
				
				if (!(responseCode==200)) {
					int count=0;
					count++;
					
					System.out.println("brokenlinks:"+attribute);
					
				}
				
				
			}
			
		}
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
