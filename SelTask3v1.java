package tasks;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelTask3v1 {

	
	public static void main(String[] args) {
		
		ArrayList<WebElement> radioButtons =
				new ArrayList<WebElement>();
		
		ArrayList<Integer> numbers =
				new ArrayList<>();
		numbers.add(1);
		int no = numbers.get(0);  //autoboxing 
		
		System.setProperty("webdriver.chrome.driver","c:\\Selenium\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("http://adam.goucher.ca/parkcalc/");
		
		WebElement butElement =
		driver.findElement(By.name("Submit"));
		butElement.click();
		
	}}


	

