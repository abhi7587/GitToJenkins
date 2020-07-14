package girmavenpackage.GitMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1Test {
	
	//String browserName;
	
	@Test
	@Parameters({"browser", "SiteURL"})
	public void testclass1(String browserName, String SiteURL)
	{
		
		
		//System.getProperty("user.dir")+"src\\test\\java\\resources\\chromedriver.exe"
		
		//String browserName =  System.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\java\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(SiteURL);
		
		}
		
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\test\\java\\resources\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get(SiteURL);		
			
		}
		
		
		
		
	}

}
