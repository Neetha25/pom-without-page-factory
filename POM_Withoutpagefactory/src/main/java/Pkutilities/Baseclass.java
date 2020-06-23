package Pkutilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Baseclass 
{

public WebDriver driver;
	
	@BeforeClass
	public void beforeclass()
	{
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\chrome\\chromedriver.exe"); 
			WebDriver driver=new ChromeDriver();   // create an object for WebDriver
		    
		    driver.get("http://executeautomation.com/demosite/Login.html");
		    driver.manage().timeouts().implicitlyWait(5,TimeUnit.MINUTES);
			
	}
}
