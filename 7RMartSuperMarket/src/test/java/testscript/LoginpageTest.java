package testscript;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import constant.Constant;
import pages.Homepage;
import pages.Loginpage;
import utilities.ExcelUtility;

public class LoginpageTest extends Base {
	Homepage home;

	@Test(groups = "smoke", description = "verify username and password")
	public void enterCorrectUsernameAndCorrectPassword() throws IOException {
		Loginpage loginpage = new Loginpage(driver);
		// String username=ExcelUtility.getStringData(1, 0,"Loginpage");
		// String password=ExcelUtility.getStringData(1, 1,"Loginpage");
		loginpage.enterUsernameandPassword("admin", "admin");
		home = loginpage.clickonSigin();
		boolean dashboarddisplayed = loginpage.isDashboardisdisplayed();
		Assert.assertTrue(dashboarddisplayed, Constant.ERRORMESSAGEFORLOGIN);
	}

	@Test(groups = "smoke",description="username and invalidpassword")
	public void enterCorrectUsernameAndWrongPassword() throws IOException {
		Loginpage loginpage = new Loginpage(driver);
		// String username=ExcelUtility.getStringData(2, 0, "Loginpage");
		// String password=ExcelUtility.getStringData(2, 1, "Loginpage");
		loginpage.enterUsernameandPassword("admin", "1234");
		home = loginpage.clickonSigin();
		String expected="Login | 7rmart supermarket";
		String actual=driver.getTitle();
		Assert.assertEquals(expected, actual,Constant.ERRORMESSAGEFORLOGIN1);
		
		

	}

	@Test(dataProvider = "cerenditials", description="Invalidusername and password")
	public void enterWrongUsernameAndCorrectPassword(String Username, String Password) {
		Loginpage loginpage = new Loginpage(driver);
		loginpage.enterUsernameandPassword(Username, Password);
		home = loginpage.clickonSigin();
		String expected="Login | 7rmart supermarket";
		String actual=driver.getTitle();
		Assert.assertEquals(expected, actual,Constant.ERRORMESSAGEFORLOGIN2);
		

		

	}

	@Test(description="invalid username and invalidpassword")
	public void enterWrongUsernameAndWrongPassword() throws IOException {
		Loginpage loginpage = new Loginpage(driver);
		// String username=ExcelUtility.getStringData(3, 0,"Loginpage");
		// String password=ExcelUtility.getStringData(3, 1,"Loginpage");
		loginpage.enterUsernameandPassword("admin", "admin");
		home=loginpage.clickonSigin();
		String expected="Login | 7rmart supermarket";
		String actual=driver.getTitle();
		Assert.assertEquals(expected, actual,Constant.ERRORMESSAGEFORLOGIN3);
		
	}

	@DataProvider(name = "cerenditials")
	public Object[][] data() {
		Object testdata[][] = { { "admin", "1q3w4r" }, { "admin", "admi" } };
		return testdata;
	}

}
