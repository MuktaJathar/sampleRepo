package Webtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assiment1Selenium {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
driver.get("https://automationplayground.com/crm/");

driver.findElement(By.linkText("Sign In")).click();

driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
driver.findElement(By.id("password")).sendKeys("test1234");
driver.findElement(By.id("remember")).click();
driver.findElement(By.id("submit-id")).click();

driver.findElement(By.linkText("New Customer")).click();
driver.findElement(By.className("email")).sendKeys("mukta@gmail.com");
driver.findElement(By.id("FirstName")).sendKeys("mukta");
driver.findElement(By.id("LastName")).sendKeys("jathar");
driver.findElement(By.id("City")).sendKeys("pune");
driver.findElement(By.className("gender")).sendKeys("Male");
driver.findElement(By.className("gender")).sendKeys("Female");
driver.findElement(By.className("promos-name")).click();
driver.findElement(By.className("btn btn-default")).click();

driver.findElement(By.linkText("Sign Out")).click();





	}

}
