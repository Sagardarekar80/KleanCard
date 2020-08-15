package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/*
*
*Author Sagar
*
*/
	public class Generic 
	{
		
	public WebDriver driver;
	
	static
	{
		/*  Specific Browser and path of a exe file */
	System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	}

	/* Before method statement to open the browser */
	@BeforeMethod
	public void openAppln()
	{
		/*  Specific Browser  */
	driver =new FirefoxDriver();
	/*URL*/
	driver.get("http://dev.klearcard.com");
	/*Window maximize*/
	driver.manage().window().maximize();
	/*wait for all element to load in DOM document
	 * @param driver*/
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	/* After Method statement to close the browser */
	@AfterMethod
	public void closeAppln()
	{
	driver.quit();
	}

	}


