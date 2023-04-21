package tests;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	
		public void setUp() {
			DesiredCapabilities cap=new DesiredCapabilities();
			
			//desired capabilities always key and value pair
			cap.setCapability( "platformName","Android");
			cap.setCapability("platformVersion","12.0.5");
			cap.setCapability("UDID", "94972e3d");;
			cap.setCapability("deviceName", "Muguntha");
			cap.setCapability("appPackage","com.miui.calculator" );
			cap.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
		}
		
}
