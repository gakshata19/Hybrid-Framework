package Com.TestLayer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Com.BaseLayer.BaseClass;
import Com.PageLayer.ContactPage;
import Com.UtilsLayer.ExcelReader;
import Com.UtilsLayer.UtilsClass;

public class ContactPagetest extends BaseClass{
	
	LoginPagetest loginpagetest;
	HomePagetest homepagetest;
	ContactPage contactpage;
	ExcelReader excel;
	
	@BeforeClass
	public void setUp() {
		BaseClass.initialization();
		loginpagetest= new LoginPagetest();
		homepagetest= new HomePagetest();
		contactpage= new ContactPage();
		excel= new ExcelReader();
	}
	
	@Test(priority=1)
	public void validateLoginFunctionality() throws Exception {
		loginpagetest.loginFunctionality();
	}
	
	@Test(priority=2)
	public void clickcontacts() throws InterruptedException {
		Thread.sleep(5000);
		contactpage.contactsclick();
	}
	
	@Test(priority=3)
	public void createbutton() throws Exception {
		Thread.sleep(3000);
		UtilsClass.captureScreenShot();
		contactpage.createButton();
	}
	
	@Test(priority=4)
	public void fname() {
		contactpage.firstName(excel.getData(1, 1, 0));
	}
	
	@Test(priority=5)
	public void lname() {
		contactpage.lastName(excel.getData(1, 1, 2));
	}
	
	@Test(priority=6)
	public void mname() {
		contactpage.middleName(excel.getData(1, 1, 1));
	}
	
	@Test(priority=7)
	public void cname() {
		contactpage.companyName(excel.getData(1, 1, 3));
	}
	
	@Test(priority=8)
	public void cnametag() {	
		contactpage.companyTag();
	}
	
	@Test(priority=9)
	public void buttonaccess() {
		contactpage.accessButton();
	}
	
	@Test(priority=10)
	public void dpfield() {
		contactpage.dpTextField();
	}
	
	@Test(priority=11)
	public void dptext() throws InterruptedException  {
		contactpage.dpText();
		try {
			UtilsClass.captureScreenShot();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(3000);
	}
	
	@Test(priority=12)
	public void buttonsave(){
		contactpage.saveButton();
	}
	
	@AfterClass
	public void tearDown(){
		try {
			UtilsClass.captureScreenShot();
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.close();
	}
}
