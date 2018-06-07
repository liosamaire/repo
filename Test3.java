package selScripts;

import java.util.Iterator;		
import java.util.Set;		
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;		

public class Test3 {				

    public static void main(String[] args) throws InterruptedException {
    	
    	System.setProperty("webdriver.gecko.driver","c:\\Selenium\\geckodriver.exe");
		//initiate web driver
	    WebDriver driver=new FirefoxDriver();			
        		
        //Launching the site.				
            driver.get("http://localhost:8080/Popupandtab/");			
        driver.manage().window().maximize();		
        
        System.out.println("URL of homepage is "+ driver.getCurrentUrl());
        System.out.println("Title of parent page is "+ driver.getTitle());
		//System.out.println("URL of homepage is "+ driver.getCurrentUrl());
                		
driver.findElement(By.xpath("/html/body/a[1]")).click();			
        		
        String MainWindow=driver.getWindowHandle();		
        		
        // To handle all new opened window.				
            Set<String> s1=driver.getWindowHandles();		
        Iterator<String> i1=s1.iterator();		
        		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);	                                                                                                           
                        			
                    System.out.println("Title of child page is "+ driver.getTitle());
            		//System.out.println("URL of homepage is "+ driver.getCurrentUrl());
                    
                    driver.findElement(By.xpath("/html/body/a")).click();	
                                                                         
			// Closing the Child Window.
                        //driver.close();	
                       
            }	
 
            }	
        
                      
        // Switching to Parent window i.e Main Window.
            driver.switchTo().window(MainWindow);	
            
            System.out.println("Title of parent page2 is "+ driver.getTitle());
    		//System.out.println("URL of homepage is "+ driver.getCurrentUrl());
    }
}		