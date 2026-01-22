package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.Homepage;
import pages.Loginpage;
import utilities.ExcelUtility;

public class HomepageTest extends Base {
	public Homepage home;
  @Test
  public void clickonAdminAndLogoutbutton() throws IOException {
	  Loginpage loginpage=new Loginpage(driver);
	  //String username=ExcelUtility.getStringData(1, 0,"Homepage");
	 // String password=ExcelUtility.getStringData(1,1,"Homepage");
	  loginpage.enterUsernameandPassword("admin","admin");
	  
     home=loginpage.clickonSigin();
	 home.clickonAdmin().clickonLogout();
	  loginpage.clickonSigin();
	  
	  /*Homepage homepage=new Homepage(driver);
	   homepage.clickonAdmin();
	   homepage.clickonLogout();*/
	  
	  String expected= "Login | 7rmart supermarket";
	  String actual=driver.getTitle();
	  Assert.assertEquals(expected, actual,Constant.ERRORMESSAGEFORLOGOUT);
  }
}
