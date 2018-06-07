package selScripts;

import org.openqa.selenium.WebDriver;

import selSetup.Browsers;

public class Test1 {

	static WebDriver driver;
	
	public static void main(String[] args) 
	{
		String url = "http://www.google.ie";
		String browserName = "ff";
		driver = Browsers.openWebPage(browserName, url);
		System.out.println(driver.getCurrentUrl());
		//https://www.guru99.com/page-object-model-pom-page-factory-in-selenium-ultimate-guide.html
		//http://www.seleniumeasy.com/selenium-tutorials/page-object-model-framework-introduction
		
		String url2 = "http://www.google.ie";
		String browserName2 = "ch";
		driver = Browsers.openWebPage(browserName2, url);
		System.out.println(driver.getCurrentUrl());
	}

}
