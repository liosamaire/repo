package tasks;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;//go and find by**
import org.openqa.selenium.WebDriver;//go find web element
import org.openqa.selenium.WebElement;//go and find web element
import org.openqa.selenium.chrome.ChromeDriver;//go and find chromedriver

public class SelTask3v2 {

	
	public static void main(String[] args) {
		
		List<WebElement> radioButtons =
				new ArrayList<WebElement>();
		
//		ArrayList<Integer> numbers =
//				new ArrayList<>();
//		numbers.add(1);
//		int no = numbers.get(0);  //autoboxing 
//		
		System.setProperty("webdriver.chrome.driver","c:\\Selenium\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		driver.get("http://adam.goucher.ca/parkcalc/");
		
//		WebElement butElement =
//		driver.findElement(By.name("Submit"));
//		butElement.click();
//		
		
		radioButtons = driver.findElements(By.name("EntryTimeAMPM"));
		
		System.out.println("Size of list is " + radioButtons.size());
		
		for (int index=0;index<radioButtons.size(); ++index)
		{
		 System.out.println("Radio_Button_no : " + (index + 1)
					+ radioButtons.get(index).getAttribute("value") );
		 
					}
		
	}}


	

