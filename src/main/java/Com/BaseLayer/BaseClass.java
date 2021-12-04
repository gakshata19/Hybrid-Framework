package Com.BaseLayer;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import Com.UtilsLayer.WebEventListener;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;
//	public static EventFiringWebDriver e_driver;
//	public static WebEventListener eventListener;
	
	public BaseClass() {
		prop=new Properties();
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\akshatag\\Automation\\eclipse\\Workbook\\HybridFrameWork\\src\\main\\java\\Com\\ConfigLayer\\Data.properties");
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshatag\\Desktop\\Automation\\Selenium Notes\\chromedriver_win32(1)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);			
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
//		 e_driver=new EventFiringWebDriver(driver);
//		eventListener= new WebEventListener();
//		e_driver.register(eventListener);
//		driver=e_driver;
	}
}
