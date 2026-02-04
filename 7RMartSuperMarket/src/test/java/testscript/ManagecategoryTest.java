package testscript;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.Homepage;
import pages.Loginpage;
import pages.ManageCategory;
import utilities.ExcelUtility;

public class ManagecategoryTest extends Base {
	public Homepage home;
	public ManageCategory category;

	@Test(description="verifyusercanloginmanagecategorypage")
	public void enterUsernameAndPasswword() throws IOException {

		Loginpage loginpage = new Loginpage(driver);
		// String username=ExcelUtility .getStringData(1,0, "ManageCategory");
		// String password=ExcelUtility.getStringData(1, 1,"ManageCategory");

		loginpage.enterUsernameandPassword("admin", "admin");

		home = loginpage.clickonSigin();

		category = home.clickonMoreinfoCategory();
		category.clickonNew().enterCategory("grapes").clickonDiscount().uploadChoosefile().clickonShowTopmenu()
				.clickonSavebutton();

		boolean alert = category.iscategoryisdisplayed();
		Assert.assertTrue(alert, Constant.ERRORMESSAGEFORCATEGORY);

		/*
		 * ManageCategory managecategory=new ManageCategory(driver);
		 * managecategory.clickonMoreinfo(); managecategory.clickonNew();
		 * managecategory.enterCategory("Fruits"); managecategory.clickonDiscount();
		 * managecategory.uploadChoosefile(); managecategory.clickonShowTopmenu();
		 * managecategory.clickonSavebutton();
		 */

	}
}
