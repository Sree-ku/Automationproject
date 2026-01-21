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
	WebElement New;
	@FindBy(xpath="//input[@name='username']")
	WebElement Username;
	@FindBy(xpath="//input[@name='password']")
	WebElement Password;
	@FindBy(xpath="//select[@name='user_type']")
	WebElement Usertype;
	@FindBy(xpath="//button[@name='Create']")
	WebElement Save;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement alert;
	
		public Adminuserpage clickonNewbutton() {
		New.click();
		return this;
	}
	public Adminuserpage enterUsernameAndPassword(String Usernamefield,String Passwordfield) {
		Username.sendKeys(Usernamefield);
		Password.sendKeys(Passwordfield);
		return this;
		
		

	}
	/*public void enterUsertype() {
		Select select=new Select(Usertype);
		//select.selectByIndex(1);
	}*/
	public Adminuserpage clickonSavebutton() {
		pageutility.selectByindex(Usertype, 1);
	
		
		Save.click();
		return this;
	}
	public boolean isAlertisdisplayed() {
		return alert.isDisplayed();
	}
	

}
