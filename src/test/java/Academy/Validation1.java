package Academy;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.Landingpage;
import resources.Base;

public class Validation1 extends Base{
	public WebDriver driver;
	@BeforeTest
	public void startBrowser() throws IOException
	{
		driver=initializeDriver();

		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void basepageNavigation() throws IOException
	{

		Landingpage l=new Landingpage(driver);
		Assert.assertFalse(l.validation().isDisplayed());
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
