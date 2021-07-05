package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	
	public WebDriver driver;
	By email=By.xpath("//input[@type='email']");
	By pwd=By.xpath("//input[@type='password']");
	By loginbtn=By.xpath("//input[@value='Log In']");
	By forgotpwd=By.xpath("//a[text()='Forgot Password?']");
	
	public Loginpage(WebDriver driver) {
	       this.driver=driver;
	}

	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getPwd()
	{
		return driver.findElement(pwd);
	}
	public WebElement getloginbtn()
	{
	   return driver.findElement(loginbtn);
	   
	}
	public Forgotpwd forgotpwd()
	{
	   driver.findElement(forgotpwd).click();
       Forgotpwd fp=new Forgotpwd(driver);
	   return fp;
	}

}
