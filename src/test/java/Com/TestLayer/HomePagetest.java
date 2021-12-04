package Com.TestLayer;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Com.BaseLayer.BaseClass;
import Com.PageLayer.HomePage;
import Com.UtilsLayer.UtilsClass;

public class HomePagetest extends BaseClass{
	
	HomePage homepage;
	LoginPagetest loginpage;
	
	@BeforeClass
	public void setUp() {
		BaseClass.initialization();
		homepage=new HomePage();
		loginpage=new LoginPagetest();
	}
	
	@Test(priority=3)
	public void validateLoginFunctionality() throws Exception {
		loginpage.loginFunctionality();
	}
	
	@Test(priority=1)
	public void validateURL() throws Exception{
		try {
			UtilsClass.captureScreenShot();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String Url=homepage.URL();
		System.out.println(Url);
		Assert.assertEquals(Url, "https://ui.cogmento.com/");
	}
	
	@Test(priority=2)
	public void validateTitle() {
		String title=homepage.title();
		System.out.println(title);
		Assert.assertEquals(title, "Cogmento CRM");
	}

	@Test(priority=4)
	public void validateDisplayLogo() {
		boolean logo=homepage.displayLogo();
		System.out.println("Logo displayed? "+logo);
	}
	
	@Test(priority=5)
	public void validateDisplayName() {
		String name=homepage.displayName();
		System.out.println("Displayed name: "+name);
	}
	
	@Test(priority=6)
	public void validateContactLink() {
		try {
			UtilsClass.captureScreenShot();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		homepage.contactLink();
	}
	
	@Test(priority=7)
	public void validateCalendarLink() {
		try {
			UtilsClass.captureScreenShot();
		} catch (Exception e) {
			e.printStackTrace();
		}
		homepage.calendarLink();
	}
	
	@Test(priority=8)
	public void validateCompanyLink() {
		try {
			UtilsClass.captureScreenShot();
		} catch (Exception e) {
			e.printStackTrace();
		}
		homepage.companyLink();
	}
	
	@AfterClass
	public void tearDown() {
		try {
			UtilsClass.captureScreenShot();
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.close();
	}
	
}
