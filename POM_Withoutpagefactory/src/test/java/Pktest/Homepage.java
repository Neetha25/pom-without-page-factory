package Pktest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Homepage
{
	WebDriver driver;
	public void homeDetails()
	{
		WebElement ob= driver.findElements(By.name("TitleId"));
	Select s=new Select(ob);
	s.selectByValue("2");
	WebElement user = driver.findElement(By.name("Initial"));
	user.sendKeys("nil");
	WebElement user1 = driver.findElement(By.name("FirstName"));
	user1.sendKeys("Neetha");
	WebElement user2 = driver.findElement(By.name("MiddleName"));
	user2.sendKeys("Philip");
	WebElement user3 = driver.findElement(By.name("MiddleName"));
	user3.sendKeys("Philip");
	driver.findElement(By.name("nee")).click();
	driver.findElement(By.name("save")).click();
	}
	public HomePage(WebDriver driver)
	     {
	this.driver=driver;

	      }
	
	}
}
