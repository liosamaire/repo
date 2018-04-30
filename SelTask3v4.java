package tasks;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;//go and find by**
import org.openqa.selenium.WebDriver;//go find web element
import org.openqa.selenium.WebElement;//go and find web element
import org.openqa.selenium.chrome.ChromeDriver;//go and find chromedriver

public class SelTask3v4 {

	
	public static void main(String[] args) {
		
		List<WebElement> radioButtons =
				new ArrayList<WebElement>();
				
		System.setProperty("webdriver.chrome.driver","c:\\Selenium\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		driver.get("http://adam.goucher.ca/parkcalc/");

		radioButtons = driver.findElements(By.name("EntryTimeAMPM"));
		
		System.out.println("Size of list is " + radioButtons.size());
		
		for (int index=0;index<radioButtons.size(); ++index)
		{
			
			radioButtons.get(index).click();
			boolean radioButtonSelected = radioButtons.get(index).isSelected();
			System.out.println("Radio_Button_no : " + (index + 1)
					+radioButtons.get(index).getAttribute("value"));
					
					if (radioButtonSelected)
					{
						System.out.println("First radio button has been selected");
					}
					else
					{
						System.out.println("Second radio button has been selected");
					}
		
	}}}


