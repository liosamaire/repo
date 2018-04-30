package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class NWRC_Checks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","c:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//new class
		driver.manage().window().maximize();
		driver.get("http://localhost:32768/");
			
		System.out.println("Title of homepage is "+ driver.getTitle());
		System.out.println("URL of homepage is "+ driver.getCurrentUrl());
		
		//Identify the number of Link on webpage and assign into Webelement List 
        List<WebElement> allLinkElements = driver.findElements(By.xpath("//a"));
       
        // Count the total Link list on Web Page 
        int linkListCount = allLinkElements.size();
               
        //Print the total count of links on webpage
        System.out.println("Total Number of link count on webpage = "  + linkListCount);    
             
       //Identify all the elements on web page
       List<WebElement> allElements = driver.findElements(By.xpath("//*"));
      
       //Count the total all element on web page
       linkListCount = allElements.size();
    
       //Print the total count of all element on webpage
       System.out.println("Total Number of All Element on webpage = "  + linkListCount);   
      
        		}
           
        }
				  
		


	

