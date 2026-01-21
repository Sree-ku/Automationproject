package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Adminuserpage;
import pages.Homepage;
import pages.Loginpage;
import pages.ManageNews;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminuserTest extends Base{
	public Homepage home;
	public Adminuserpage admin;
	FakerUtility faker=new FakerUtility();
	
  @Test(retryAnalyzer = retry.Retry.class)//Retry
 public void enterUsernameAndPasswword() throws IOException{
	  Loginpage loginpage=new Loginpage(driver);
	  //String username=ExcelUtility .getStringData(1,0, "Adminuserpage");
	  //String password=ExcelUtility.getStringData(1, 1,"Adminuserpage");
	 loginpage.enterUsernameandPassword("admin","admin");
	   home= loginpage.clickonSigin();
	   admin=home.clickonMoreinfoAdmin();
	   admin.clickonNewbutton().enterUsernameAndPassword(faker.getFakeFirstName(),faker.getPassword()).clickonSavebutton();

		boolean admindisplayed=admin.isAlertisdisplayed();
		Assert.assertTrue(admindisplayed,"Fail to admin");
	
	 /* Adminuserpage adminuser=new Adminuserpage(driver);
	 adminuser.clickonMoreinfo();
	  adminuser.clickonNewbutton();
	  adminuser.enterUsernameAndPassword("beauty", "sree");
	  adminuser.enterUsertype();
	  adminuser.clickonSavebutton();*/
  }
}