package selSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Browsers 
{
	static WebDriver driver;
	
	public static WebDriver openWebPage(String browserName, String url)
	{
		launchBrowser(browserName);
		openURL(url);
		return driver;
	}
	public static void openURL(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static WebDriver launchBrowser(String browserName)
	{
		browserName = browserName.toLowerCase();
		switch (browserName) 
		{
		case "ch":
			System.setProperty("webdriver.chrome.driver","c:\\Selenium\\chromedriver.exe");
			driver= new ChromeDriver();
			break;
		case "ff":
			System.setProperty("webdriver.gecko.driver","c:\\Selenium\\geckodriver.exe");
			driver= new FirefoxDriver();
			break;
		case "ie":
			DesiredCapabilities IEcaps = DesiredCapabilities.internetExplorer();
			IEcaps.setCapability(
			InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);		
			System.setProperty("webdriver.ie.driver", "C:\\Selenium Servers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver(IEcaps );
			break;
		default:
			System.out.println("No browser of your type present");
			break;
		}
		return driver;
	}

}