package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landingpage {
	
	public WebDriver driver;
	
	public Landingpage(WebDriver driver) {
		this.driver=driver;
		//PageFactory.initElements(driver,this);
	}
	
//	@FindBy(xpath="//span[text()='Login']")
//	WebElement signin;
//	
//	@FindBy(xpath="//h2[text()='Featured Courses']")
//	WebElement val1;
	
//	public Loginpage signin()
//	{
//		signin.click();
//		Loginpage lp=new Loginpage(driver);
//		return lp;
//		
//	}
//	public WebElement validation()
//	{
//		return val1;
//	}
	
	By signin=By.xpath("//span[text()='Login']");
	By val1=By.xpath("//h2[text()='Featured Courses']");

	public Loginpage signin()
	{
		driver.findElement(signin).click();
		Loginpage lp=new Loginpage(driver);
		return lp;
		
	}
	public WebElement validation()
	{
		return driver.findElement(val1);
	}

}
