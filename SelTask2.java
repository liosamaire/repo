package exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelTask2 {

public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","c:\\Selenium\\geckodriver.exe");
		//initiate web driver
		WebDriver driver = new FirefoxDriver();
		//new class
		driver.get("http://www.nwrc.ac.uk/"); // "/"important for next page
		
		System.out.println("Title of homepage is "+ driver.getTitle());
		WebElement getLinkedInUrl = driver.findElement (By.xpath("/html/body/header/div[1]/div/div[2]/div[3]/span[4]/a"));
		System.out.println(getLinkedInUrl.getAttribute("href"));
		WebElement getTopUrl = driver.findElement (By.xpath("//*[@id=\"scrollUp\"]"));
		System.out.println(getTopUrl.getAttribute("id"));
							
}

};


