package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class Loginpage {
	
public WebDriver driver;
   WaitUtility wait=new WaitUtility();

public Loginpage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);//Elements initialize
	
}
@FindBy(xpath="//input[@name='username']")
WebElement Username;
@FindBy(xpath="//input[@name='password']")
WebElement Password;
@FindBy(xpath="//button[@type='submit']")
WebElement Signin;

@FindBy(xpath="(//a[@class='small-box-footer'])[2]")
WebElement dashboard;

@FindBy(xpath="(//a[@class='small-box-footer'])[2]")
WebElement dashboard1;
@FindBy(xpath="(//a[@class='small-box-footer'])[2]")
WebElement dashboard2;
@FindBy(xpath="(//a[@class='small-box-footer'])[2]")
WebElement dashboard3;



public Loginpage enterUsernameandPassword(String Usernamefield,String Passwordfield) {
	Username.sendKeys(Usernamefield);
	Password.sendKeys(Passwordfield);
	return this;
	
}
public Homepage clickonSigin() {
	//wait.waitforElementtoclick(driver, Signin);
	Signin.click();
	return new Homepage(driver);
}
public boolean isDashboardisdisplayed() {
	return dashboard.isDisplayed();
	
}
public boolean isDashboardisdisplayed1() {
	return dashboard1.isDisplayed();
	
}
public boolean isDashboardisdisplayed2() {
	return dashboard2.isDisplayed();
	
}
public boolean isDashboardisdisplayed3() {
	return dashboard3.isDisplayed();
	
}




}
