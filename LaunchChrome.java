package browserchecks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","c:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//new class
		driver.get("http://www.nwrc.ac.uk");
			
		driver.manage().window().maximize(); //Maximise browser window
		//driver.manage().window().fullscreen(); //Fullscreen browser window
		
		}

};

