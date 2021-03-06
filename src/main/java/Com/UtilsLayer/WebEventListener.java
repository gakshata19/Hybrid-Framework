package Com.UtilsLayer;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import Com.BaseLayer.BaseClass;

public  class WebEventListener extends BaseClass implements WebDriverEventListener {

	public void beforeAlertAccept(WebDriver driver) {
		System.out.println("Before Alert Accept");
		
	}

	public void afterAlertAccept(WebDriver driver) {
		System.out.println("After Alert Accept");
		
	}

	public void afterAlertDismiss(WebDriver driver) {
		System.out.println("After Alert Dismiss");
		
	}

	public void beforeAlertDismiss(WebDriver driver) {
		System.out.println("Before Alert Dismiss");
		
	}

	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("Before Navigate To: "+url);
		
	}

	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("After Navigate To: "+url);
		
	}

	public void beforeNavigateBack(WebDriver driver) {
		System.out.println("Before Navigate Back");
		
	}

	public void afterNavigateBack(WebDriver driver) {
		System.out.println("After Navigate Back");
		
	}

	public void beforeNavigateForward(WebDriver driver) {
		System.out.println("Before Navigate Forward");
		
	}

	public void afterNavigateForward(WebDriver driver) {
		System.out.println("After Navigate Forward");
		
	}

	public void beforeNavigateRefresh(WebDriver driver) {
		System.out.println("Before Navigate Refresh");
		
	}

	public void afterNavigateRefresh(WebDriver driver) {
		System.out.println("After Navigate Refresh");
		
	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("Before Find By: ");
		
	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("After Find By: ");
		
	}

	public void beforeClickOn(WebElement element, WebDriver driver) {
		System.out.println("Before Click On: "+element.toString());
		
	}

	public void afterClickOn(WebElement element, WebDriver driver) {
		System.out.println("After Click On: "+element.toString());
		
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		System.out.println("Before Change Value Of: "+element.toString());
		
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		System.out.println("After Change Value Of: "+element.toString());
		
	}

	public void beforeScript(String script, WebDriver driver) {
		System.out.println("Before Script: "+script);
		
	}

	public void afterScript(String script, WebDriver driver) {
		System.out.println("After Script: "+script);
		
	}

	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		System.out.println("Before Switch To Window: "+windowName);
		
	}

	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		System.out.println("After Switch To Window: "+windowName);
		
	}

	public void onException(Throwable throwable, WebDriver driver) {
		System.out.println("Exception occurred");
		try {
			UtilsClass.captureScreenShot();
		} catch (Exception e) {
						e.printStackTrace();
		}
	}

	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub
		
	}

	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub
		
	}

	public void beforeGetText(WebElement element, WebDriver driver) {
		System.out.println("Before Get Text: "+element.toString());
		
	}

	public void afterGetText(WebElement element, WebDriver driver, String text) {
		System.out.println("After Get Text: "+element.toString());
		
	}

}
