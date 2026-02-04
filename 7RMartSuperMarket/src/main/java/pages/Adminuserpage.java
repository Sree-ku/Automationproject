package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

public class Adminuserpage {
	public WebDriver driver;
	PageUtility pageutility=new PageUtility();
	public Adminuserpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@onclick='click_button(1)']")
	WebElement news;
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	@FindBy(xpath="//select[@name='user_type']")
	WebElement usertype;
	@FindBy(xpath="//button[@name='Create']")
	WebElement save;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement alert;
	
		public Adminuserpage clickonNewbutton() {
		news.click();
		return this;
	}
	public Adminuserpage enterUsernameAndPassword(String Usernamefield,String Passwordfield) {
		username.sendKeys(Usernamefield);
		password.sendKeys(Passwordfield);
		return this;
		
		

	}
	/*public void enterUsertype() {
		Select select=new Select(Usertype);
		//select.selectByIndex(1);
	}*/
	public Adminuserpage clickonSavebutton() {
		pageutility.selectByindex(usertype, 1);
	
		
		save.click();
		return this;
	}
	public boolean isAlertisdisplayed() {
		return alert.isDisplayed();
	}
	

}
