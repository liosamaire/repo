package tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelTask3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","c:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//new class
		driver.get("http://adam.goucher.ca/parkcalc/");
			
		//driver.manage().window().maximize(); //Maximise browser window
		//driver.manage().window().fullscreen(); //Fullscreen browser window
		
		//List <WebElement> radioButtons = driver.findElements(By.name("EntryTimeAMPM"));
		//System.out.println(radioButtons.size());
		//radioButtons.get(1).click();
		
		//driver is chrome driver - go now and find me element 
		//find element and store back to list
		List <WebElement> radioButtons = driver.findElements(By.name("EntryTimeAMPM"));
		System.out.println(radioButtons.size());
		radioButtons.get(1).click();
		
		for(int i=0; i < 2 ; i++ ){	 
			 String sValue = radioButtons.get(i).getAttribute("value");
			 if (sValue.equalsIgnoreCase("AM")){
				 radioButtons.get(1).click();
				 System.out.println(radioButtons.get(i).getAttribute("value"));
				 }	 
			else if (sValue.equalsIgnoreCase("PM")){
				radioButtons.get(0).click();
				 System.out.println(radioButtons.get(i).getAttribute("value"));
				
		;
		
		//if
		//boolean bValue = false;
		//bValue = radioButtons.get(0).isSelected();
		//if(bValue = true){
		//	radioButtons.get(1).click();
		//}else{
		//	radioButtons.get(0).click();
		//}
		
				  
		}}}}


	

