package browserchecks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","c:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//new class
		driver.get("http://www.nwrc.ac.uk");
			
		System.out.println("Title of homepage is "+ driver.getTitle());
		System.out.println("URL of homepage is "+ driver.getCurrentUrl());
		
		String title = "North West Regional College – Full-Time or Part-Time Study";
		String title2 = new String(driver.getTitle());
		if(title.equals(title2))
			System.out.println("Title Exists");
		else System.out.println("Title Missing") ;
				
		}

};

