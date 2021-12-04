package Com.UtilsLayer;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Com.BaseLayer.BaseClass;

public class UtilsClass extends BaseClass{

	
	//handle drop down
	public static void clickDropDown(WebElement wb, String text) {
		Select sel= new Select(wb);
		sel.selectByVisibleText(text);
		List<WebElement> ls=sel.getOptions();
		ls.size();
	}
	
	//handle alert pop up
	public static void handleAlertPopup() {
		Alert act=driver.switchTo().alert();
		act.accept();
	}
	
	//handle frames.. child frame
	public static void handleChildFrame(int frameIndex) {
		driver.switchTo().frame(frameIndex);
	}
	
	//handle frame..parent(top) frame
	public static void handleTopFrame() {
		driver.switchTo().defaultContent();
	}
	
	//Capture Screenshot
	public static void captureScreenShot() throws Exception {
		DateFormat date_format_obj = new SimpleDateFormat("dd-MM-yy_HH-mm-ss");
        Date date_obj = new Date();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);
		String path="C:\\Users\\akshatag\\Desktop\\Automation\\Selenium Notes\\Screenshots\\cogmento"+date_format_obj.format(date_obj)+".jpg";
		File dist=new File(path);
		FileUtils.copyFile(source, dist);
	}
	
	//handle explicit wait
	public static void explicitWait(int time) {
		WebDriverWait wait=new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
	}
}
