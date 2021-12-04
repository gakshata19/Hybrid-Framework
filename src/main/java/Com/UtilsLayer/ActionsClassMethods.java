package Com.UtilsLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassMethods {
	public static Actions act;
	//click on web element
	public static void clickOnWebElement(WebElement wb) {
		act.click(wb).build().perform();;
	}
	//double click on WebElement
	public static void doubleClickOnWebElement(WebElement wb) {
		act.doubleClick(wb).build().perform();
	}
	//right click on WebElement
	public static void rightClickOnWebElement(WebElement wb) {
		act.contextClick(wb).build().perform();
	}
	//Drag and drop
	public static void dragAndDropWebElement(WebElement source, WebElement dist) {
		act.dragAndDrop(source, dist).release().build().perform();;
	}
	//Mouse over action
	public static void mouseOverAction(WebElement wb) {
		act.moveToElement(wb).build().perform();
	}
	//Scroll to end of page
	public static void scrollToEnd() {
		act.keyDown(Keys.CONTROL).sendKeys(Keys.END).keyUp(Keys.CONTROL).build().perform();
	}
	//Scroll to start of page
	public static void scrollToStart() {
		act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).keyUp(Keys.CONTROL).build().perform();
	}
	//Send text in upper case
	public static void sendUpperCase(WebElement wb, String text) {
		act.click(wb).keyDown(Keys.SHIFT).sendKeys(text).keyUp(Keys.SHIFT).build().perform();
	}
}
