package testscript;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.Loginpage;
import utilities.ExcelUtility;

public class LoginpageTest extends Base {
Homepage home;	
 
@Test(groups ="smoke",description="verifyusernameandpassword")
  public void enterCorrectUsernameAndCorrectPassword() throws IOException {
	  Loginpage loginpage=new Loginpage(driver);
	 // String username=ExcelUtility.getStringData(1, 0,"Loginpage");
	  //String password=ExcelUtility.getStringData(1, 1,"Loginpage");
	  loginpage.enterUsernameandPassword("admin","admin");
	home=loginpage.clickonSigin();
	  boolean dashboarddisplayed=loginpage.isDashboardisdisplayed();
	  Assert.assertTrue(dashboarddisplayed, "Fail to login");
	  }
  @Test(groups ="smoke")
  public void enterCorrectUsernameAndWrongPassword() throws IOException {
	  Loginpage loginpage=new Loginpage(driver);
	 // String username=ExcelUtility.getStringData(2, 0, "Loginpage");
	  //String password=ExcelUtility.getStringData(2, 1, "Loginpage");
	  loginpage.enterUsernameandPassword("admin","1234");
	  loginpage.clickonSigin();
	  }
  @Test(dataProvider = "cerenditials")
  public void enterWrongUsernameAndCorrectPassword(String Username,String Password) {
	  Loginpage loginpage=new Loginpage(driver); 
	  loginpage.enterUsernameandPassword(Username,Password);
	  loginpage.clickonSigin();
	  }
  @Test
  public void enterWrongUsernameAndWrongPassword() throws IOException {
	  Loginpage loginpage=new Loginpage(driver);
	  String username=ExcelUtility.getStringData(3, 0,"Loginpage");
	  String password=ExcelUtility.getStringData(3, 1,"Loginpage");
	  loginpage.enterUsernameandPassword(username,password);
	  loginpage.clickonSigin();
	  }
  @DataProvider(name="cerenditials")
  public Object[][] data(){
	  Object testdata[][]= {{"admin","1q3w4r"},{"admin","admi"}};
	  return testdata;
  }
  
}
