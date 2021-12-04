package Com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.BaseLayer.BaseClass;

public class LoginPage extends BaseClass{

	@FindBy(name="email")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement loginbutton;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void typeUsername(String uname) {
		username.sendKeys(uname);
	}
	
	public void typePassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickLoginButton() {
		loginbutton.click();
	}
	
	
	
}
