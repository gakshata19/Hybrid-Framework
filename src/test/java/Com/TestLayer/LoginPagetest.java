package Com.TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.BaseLayer.BaseClass;
import Com.PageLayer.LoginPage;
import Com.UtilsLayer.UtilsClass;

public class LoginPagetest extends BaseClass {
	LoginPage loginpage;
	
	@BeforeTest
	public void setUp() {
		BaseClass.initialization();
		
	}
	
	@Test
	public void loginFunctionality() throws Exception {
		loginpage =new LoginPage();
		loginpage.typeUsername(prop.getProperty("username"));
		loginpage.typePassword(prop.getProperty("password"));
		UtilsClass.captureScreenShot();
		loginpage.clickLoginButton();
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
