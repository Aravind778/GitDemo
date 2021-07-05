package Academy;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.Forgotpwd;
import pageObjects.Landingpage;
import pageObjects.Loginpage;
import resources.Base;


public class Homepage extends Base{

	@BeforeTest
	public void startBrowser() throws IOException
	{
		driver=initializeDriver();
	}
	
	@Test(dataProvider="getData")
	public void basepageNavigation(String UN,String PWD) throws IOException
	{
//		driver.get(prop.getProperty("url"));
//		Landingpage l=new Landingpage(driver);
//		l.signin().click();
//		Loginpage lp=new Loginpage(driver);
//		lp.getEmail().sendKeys(UN);
//		lp.getPwd().sendKeys(PWD);
//		lp.getloginbtn().click();
		driver.get(prop.getProperty("url"));
		Landingpage l=new Landingpage(driver);
		Loginpage lp=l.signin();
		lp.getEmail().sendKeys(UN);
		lp.getPwd().sendKeys(PWD);
		lp.getloginbtn().click();
		Forgotpwd fp=lp.forgotpwd();
		fp.getemail().sendKeys("sfbksh@gmail.com");
		fp.getInstrs().click();
		
	}
	
   @DataProvider
   public Object[][] getData()
{
	Object obj[][]=new Object[2][2];
	obj[0][0]="abc@gmail.com";
	obj[0][1]="123456789";

	obj[1][0]="abc@gmail.com";
	obj[1][1]="123456789";

	return obj;
}
   
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
//	@AfterTest
//	public void tearDown()
//	{
//		driver.close();
//	}
//	@AfterTest
//	public void tearDown()
//	{
//		driver.close();
//	}
//	@AfterTest
//	public void tearDown()
//	{
//		driver.close();
//	}

}
