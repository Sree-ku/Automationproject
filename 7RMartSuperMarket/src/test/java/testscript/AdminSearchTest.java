package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.AdminuserSearch;
import pages.Adminuserpage;
import pages.Homepage;
import pages.Loginpage;

public class AdminSearchTest extends Base {
	public Homepage home;
	public Adminuserpage admin;
  @Test
  public void enterUsernameandUsertype(){
	  Loginpage loginpage=new Loginpage(driver);
	  	 loginpage.enterUsernameandPassword("admin","admin");
	    home= loginpage.clickonSigin();
	    admin=home.clickonMoreinfoAdmin();
	     
	     
	     
	     AdminuserSearch search=new AdminuserSearch(driver);
	     search.enterUsername("Jean");
	     search.enterUsertype();
	     search.clickonSearchButton();
  
  }
}
