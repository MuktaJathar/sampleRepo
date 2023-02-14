package Webtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommds {

	public static void main(String[] args) {
		//Open a Browser
		WebDriver driver =new ChromeDriver();
		
		//Open an Application_get(Url)
		driver.get("https://www.google.com");
		
		//To capture a title_getTitle();
		String Title=driver.getTitle();
		System.out.println("Application Title is:"+Title);
		
		//To capture current url of the page_get current url();
		
		System.out.println(driver.getCurrentUrl());
		
		//To capture page Source of code_get page Source();
		
	//	System.out.println(driver.getPageSource());
		//close();
		//driver.close();
		//quit();
		driver.quit();
		
		
		
				
		

	}

}
