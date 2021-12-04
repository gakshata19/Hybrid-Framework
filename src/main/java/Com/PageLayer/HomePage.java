package Com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.BaseLayer.BaseClass;

public class HomePage extends BaseClass{

	@FindBy(xpath="//*[@id=\"top-header-menu\"]/div[1]")
	WebElement logo;
	
	@FindBy(className="user-display")
	WebElement displayname;
	
	@FindBy(xpath="//a[@href='/contacts']")
	WebElement contactlink;
	
	@FindBy(xpath="//a[@href='/calendar']")
	WebElement calendarlink;
	
	@FindBy(xpath="//a[@href='/companies']")
	WebElement companylink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public String URL() {
		String url=driver.getCurrentUrl();
		return url;
	}
	
	public String title() {
		String title=driver.getTitle();
		return title;
	}
	
	public boolean displayLogo(){
		boolean logoStatus=logo.isDisplayed();
		return logoStatus;
	}
	
	public String displayName(){
		String name=displayname.getText();
		return name;
	}
	
	public void contactLink(){
		contactlink.click();
	}
	
	public void calendarLink(){
		calendarlink.click();
	}
	
	public void companyLink(){
		companylink.click();
	}
}
