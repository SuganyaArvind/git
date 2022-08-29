package org.test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {
	
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		int count= 0;
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int size = links.size();
		System.out.println(size);
		
		for (int i = 0; i < links.size(); i++) {
			String attribute = links.get(i).getAttribute("href");
			//System.out.println("Links : "+attribute);
			
			if (!(attribute==null)) {
				
				URL url = new URL(attribute);
				URLConnection openConnection = url.openConnection();
				HttpURLConnection connection = (HttpURLConnection)openConnection;
				int responseCode = connection.getResponseCode();
				
				if (!(responseCode==200)) {
					
					count++;
					System.out.println("Broken Link is : "+attribute);
					System.out.println("Suganya");
					System.out.println("Suganya2");
					System.out.println("Suganya2");
			}
			
		}
		
	}
	
	}
}
