package Com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.BaseLayer.BaseClass;

public class ContactPage extends BaseClass{

	@FindBy(xpath="//a[@href='/contacts']")
	WebElement contacts;
	
	@FindBy(xpath="//button[text()='Create'][@class='ui linkedin button']")
	WebElement createbutton;
	
	@FindBy(name="first_name")
	WebElement firstname;
	
	@FindBy(name="last_name")
	WebElement lastname;
	
	@FindBy(name="middle_name")
	WebElement middlename;
	
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div[2]/form/div[2]/div[2]/div/div/input")
	WebElement company;
	
	@FindBy(xpath="//label[text()='Company']/following::span[1]")
	WebElement companytag;
	
	@FindBy(xpath="//button[@class='ui small fluid positive toggle button']")
	WebElement accessbutton;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[3]/div[1]/div/div/div[2]/div/div[1]")
	WebElement dptextfield;
	
	@FindBy(xpath="//div[@class='selected item']")
	WebElement dptext;
	
	@FindBy(xpath="//button[@class='ui linkedin button']")
	WebElement save;
	
	public ContactPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void contactsclick() {
		contacts.click();
	}
	
	public void createButton() {
		createbutton.click();
	}

	public void firstName(String fname) {
		firstname.sendKeys(fname);
	}

	public void lastName(String lname) {
		lastname.sendKeys(lname);
	}

	public void middleName(String mname) {
		middlename.sendKeys(mname);
	}

	public void companyName(String cname) {
		company.sendKeys(cname);
	}

	public void companyTag() {
		companytag.click();
	}
	public void accessButton() {
		accessbutton.click();
	}

	public void dpTextField() {
		dptextfield.click();
	}

	public void dpText() {
		dptext.click();
	}
	
	public void saveButton() {
		save.click();
	}
}
