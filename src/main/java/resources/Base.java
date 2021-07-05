package resources;
import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
     public WebDriver driver;
     public Properties prop;
	public WebDriver initializeDriver() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\aravinda.s\\eclipse-workspace\\E2EProject\\src\\main\\java\\resources\\data.properties");
	    prop.load(fis);
	    String browserName=prop.getProperty("browser");
	    
	    if(browserName.equals("chrome"))
	    {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\aravinda.s\\eclipse-workspace\\E2EProject\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    }
	    else if(browserName.equals("firefox"))
	    {
	    	//firefox code
	    }
	    if(browserName.equals("ie"))
	    {
	    	//ie code
	    }
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    return driver;
	}
	
	public String getScreeshot(String testcasename,WebDriver driver) throws IOException
	{
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destfile=System.getProperty("user.dir")+"\\reports\\"+testcasename+".png";
		FileUtils.copyFile(f,new File(destfile));
		return destfile;
	}
}
