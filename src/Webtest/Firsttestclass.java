package Webtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firsttestclass {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		driver.get("https://www.facebook.com");
		
		
	}

}
