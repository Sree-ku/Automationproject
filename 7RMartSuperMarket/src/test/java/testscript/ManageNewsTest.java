package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.Homepage;
import pages.Loginpage;
import pages.ManageNews;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {
	public Homepage home;
	public ManageNews news;

	@Test(description="veriftyusercanloginmanagenewspage")
	public void enterUsernameAndPasswword() throws IOException {
		Loginpage loginpage = new Loginpage(driver);
		// String username=ExcelUtility .getStringData(1,0, "ManageNews");
		// String password=ExcelUtility.getStringData(1, 1,"ManageNews");
		loginpage.enterUsernameandPassword("admin", "admin");
		home = loginpage.clickonSigin();
		news = home.clickonMoreinfoNews();
		news.clickonNew().enterNews("Today is monday").clickonSavebutton();

		boolean adminalertdisplayed = news.isNewsalertdisplayed();
		Assert.assertTrue(adminalertdisplayed, Constant.ERRORMESSAGEFORNEWS);

		/*
		 * ManageNews managenew=new ManageNews(driver); managenew.clickonMoreinfo();
		 * managenew.clickonNew(); managenew.enterNews("Today is Sunday");
		 * managenew.clickonSavebutton();
		 */
	}

}
