package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class Loginpage {

	public WebDriver driver;
	WaitUtility wait = new WaitUtility();

	public Loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);// Elements initialize

	}

	@FindBy(xpath = "//input[@name='username']")
	WebElement username;
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement signin;

	@FindBy(xpath = "(//a[@class='small-box-footer'])[2]")
	WebElement dashboard;

		public Loginpage enterUsernameandPassword(String Usernamefield, String Passwordfield) {
		username.sendKeys(Usernamefield);
		password.sendKeys(Passwordfield);
		return this;

	}

	public Homepage clickonSigin() {
		// wait.waitforElementtoclick(driver, signin);
		signin.click();
		return new Homepage(driver);
	}

	public boolean isDashboardisdisplayed() {
		return dashboard.isDisplayed();

	}

}
