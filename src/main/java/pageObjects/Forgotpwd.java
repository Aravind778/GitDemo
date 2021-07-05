package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Forgotpwd {
	
	public WebDriver driver;
	
	By email=By.xpath("//input[@type='email']");
	By instrs=By.xpath("//input[@type='submit']");

	
	public Forgotpwd(WebDriver driver) {
	       this.driver=driver;
	}

	public WebElement getemail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getInstrs()
	{
		return driver.findElement(instrs);
	}
}
