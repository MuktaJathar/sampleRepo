package Webtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("MUKTA123");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Jathar");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mukta@123");
		driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("9865472365");
		driver.findElement(By.xpath("////input[@name='password']")).sendKeys("Mukta");

	}

}
