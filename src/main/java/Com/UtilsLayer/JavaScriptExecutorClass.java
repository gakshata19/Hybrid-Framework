package Com.UtilsLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Com.BaseLayer.BaseClass;

public class JavaScriptExecutorClass extends BaseClass{
	public static JavascriptExecutor js=(JavascriptExecutor)driver;
	
	public static void clickOnWebElement(WebElement wb) {
		js.executeScript("arguments[0].click();" , wb);
	}
	
	//Enter data in text box
	public static void enterDataInTextBox(String text, WebElement wb) {
		//	js.executeScript("arguments[0].value=+text)
	}
}
