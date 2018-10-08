package runClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class browserlaunch {
	
	public static WebDriver driver;
		
 @BeforeTest
	public static void blaunch(){
	 
//	 System.setProperty("webdriver.gecko.driver", "F:\\eclipse_working_folder\\Google.com\\geckodriver.exe");
//	  DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//      capabilities.setCapability("marionette", true);
//		
//		driver = new FirefoxDriver();
		
//	 System.setProperty("webdriver.chrome.driver", "F:\\eclipse_working_folder\\Google.com\\chromedriver.exe");
		
		driver = new ChromeDriver();
	driver.get("http://toolsqa.com/automation-practice-form/");
		
		
	}
 
 @AfterTest
 public void aftertest(){
	 driver.close();
 }
	

}
