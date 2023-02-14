package Webtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("Application Title is:"+ driver.getTitle());
		
		//navigation
		driver.navigate().to("https://www.facebook.com");
		System.out.println("Application Titel is:"+driver.getTitle());
		Thread.sleep(2000);
		//back
		driver.navigate().back();//Google
		Thread.sleep(2000);
		//forward
		driver.navigate().forward();//Facebook
		Thread.sleep(2000);
		//refresh
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();

	}

}
