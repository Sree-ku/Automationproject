package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.AdminuserSearch;
import pages.Adminuserpage;
import pages.Homepage;
import pages.Loginpage;

public class AdminSearchTest extends Base {
	public Homepage home;
	public AdminuserSearch admin;
	public Adminuserpage admin1;
  @Test
  public void enterUsernameandUsertype(){
	  Loginpage loginpage=new Loginpage(driver);
	 // String username=ExcelUtility .getStringData(1,0, "Adminsearch");
	  //String password=ExcelUtility.getStringData(1, 1,"Adminsearch");
	 loginpage.enterUsernameandPassword("admin","admin");
	  	
	    home= loginpage.clickonSigin();
	    admin1=home.clickonMoreinfoAdmin();
	    
	   admin.clickonSearchButton().enterUsername("jeans").enterUsertype().searchButton();
	    
	     
	     
	     
	  /*   AdminuserSearch search=new AdminuserSearch(driver);
	     search.enterUsername("Jean");
	     search.enterUsertype();
	     search.clickonSearchButton();*/
  
  }
}
