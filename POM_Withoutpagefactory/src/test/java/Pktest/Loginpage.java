package Pktest;

public class Loginpage
{
public class LoginPage extends Baseclass
	
	{   //WebDriver driver;  
		WebElement user;
		
		public void loginDetails()
		   {
			user=driver.findElement(By.name("userName"));
			user.sendkeys("tutorial");
			WebElement password=driver.findElement(By.name("password"));
			password.sendkeys("tutorial");
			WebElement login = driver.findElement(By.name("Login"));
			login.submit();
			}
		
		public String validateloginpagetitle()
		{
			String a = driver.getTitle();
			return a;
		}
		public LoginPage(WebDriver driver)
		{
			this.driver=driver;
		}
	}
	
	
}
