package selScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {

	static WebDriver driver;
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","c:\\Selenium\\geckodriver.exe");
		//initiate web driver
		WebDriver driver = new FirefoxDriver();
		//new class
		driver.get("http://localhost:8080/Popupandtab/"); // "/"important for next page
		
		System.out.println("Title of homepage is "+ driver.getTitle());
		System.out.println("URL of homepage is "+ driver.getCurrentUrl());
		
		//click popup
		WebElement popupElement = driver.findElement(By.xpath("/html/body/a[1]"));
		System.out.println("URL of homepage is "+ driver.getCurrentUrl());
		popupElement.click();
		
		//click close
		WebElement closepopupElement = driver.findElement(By.xpath("/html/body/a"));
		System.out.println("URL of homepage is "+ driver.getCurrentUrl());
		closepopupElement.click();
		}

}
