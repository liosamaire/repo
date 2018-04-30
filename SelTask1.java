package exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelTask1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","c:\\Selenium\\geckodriver.exe");
		//initiate web driver
		WebDriver driver = new FirefoxDriver();
		//new class
		driver.get("http://www.google.co.uk/"); // "/"important for next page
		
		/*GMail By Class Name
		WebElement gmailElement = driver.findElement(By.className("gb_P"));
		System.out.println(gmailElement.getText());
		gmailElement.click();
		
		Images By Link Text		
		WebElement imagesElement = driver.findElement(By.linkText("Images"));
		System.out.println(imagesElement.getText());
		imagesElement.click();
		
		GoogleApps By X path
		WebElement gappsElement = driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/div/div/div/div[2]/div[2]/div[1]/a"));
		System.out.println(gappsElement.getAttribute("title"));
		gappsElement.click();		
		
		Sign in By X path
	    WebElement signinElement = driver.findElement (By.xpath("//*[@id=\"gb_70\"]"));
	    System.out.println(signinElement.getText());
		signinElement.click();
		
		Sign in By Id
	    WebElement signinElement = driver.findElement(By.id("gb_70"));
	    System.out.println(signinElement.getText());
		signinElement.click();
		
		Google image exist By X path
	    WebElement logoElement = driver.findElement (By.xpath("//*[@id=\"hplogo\"]"));
	    System.out.println(logoElement.getAttribute("id"));
		
		Search Bar By Class Name
		WebElement searchbarElement = driver.findElement(By.className("gsfi"));
		System.out.println(searchbarElement.getAttribute("title"));	
		
		Google Search By Link Text
		WebElement searchElement = driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[3]/center/input[1]"));
		System.out.println(searchElement.getAttribute("aria-label"));*/
		
		//Google Feeling Lucky
		//WebElement feelingLuckyElement =driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[3]/center/input[2]"));
		//System.out.println(feelingLuckyElement.getAttribute("aria-label"));
		
		//Advertising
		//WebElement AdvertisingFooterElement =driver.findElement(By.xpath("/html/body/div/div[6]/div[1]/div/div/div/div/span[2]/a[1]"));
		//System.out.println(AdvertisingFooterElement.getText());
		
		//Business
		//WebElement BusinessFooterElement =driver.findElement(By.xpath("/html/body/div/div[6]/div[1]/div/div/div/div/span[2]/a[2]"));
		//System.out.println(BusinessFooterElement.getText());
		
		//About
		//WebElement AboutFooterElement =driver.findElement(By.xpath("/html/body/div/div[6]/div[1]/div/div/div/div/span[2]/a[3]"));
		//System.out.println(AboutFooterElement.getText());
		
		//Privacy
		//WebElement PrivacyFooterElement = driver.findElement(By.xpath("/html/body/div/div[6]/div[1]/div/div/div/div/span[1]/a[1]"));
		//System.out.println(PrivacyFooterElement.getText());
		
		//TermsFooter
		//WebElement TermsFooterElement = driver.findElement(By.xpath("/html/body/div/div[6]/div[1]/div/div/div/div/span[1]/a[2]"));
		//System.out.println(TermsFooterElement.getText());
		
		//SettingsFooter
		//WebElement SettingsFooterElement =driver.findElement(By.id("fsettl"));
		//System.out.println(SettingsFooterElement.getText());
		
	
		}
};

