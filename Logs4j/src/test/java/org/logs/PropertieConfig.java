package org.logs;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class PropertieConfig {
	static WebDriver driver;
	@Test
	public void launch() throws IOException {
	FileInputStream stream=new FileInputStream("config.properties");
	Properties property=new Properties();
	property.load(stream);
	String browser = property.getProperty("browser");
	String location = property.getProperty("DriverLocation");
	
	if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", location);
		
		driver=new ChromeDriver();
	}
		driver.get("https://www.google.com/");
	}

}
