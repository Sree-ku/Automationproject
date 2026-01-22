package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.Constant;
import utilities.FileuploadUtility;

public class ManageCategory {
	public WebDriver driver;
	FileuploadUtility files=new FileuploadUtility();
	public  ManageCategory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		@FindBy(xpath="//a[@onclick='click_button(1)']")
    WebElement  New;
	@FindBy(xpath="//input[@name='category']")
	WebElement category;
	@FindBy(xpath="//li[@id='134-selectable']")
	WebElement discount;
	@FindBy(xpath="//input[@type='file']")
	WebElement choosefile;
	@FindBy(xpath="//label[text()='Show On Top Menu']")
	WebElement showtopmenu;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement save;
	
	
	
		public ManageCategory clickonNew() {
		New.click();
		return this;
	}
	public ManageCategory  enterCategory(String Categoryfield) {
		category.sendKeys(Categoryfield);
		return this;
		
	}
	public ManageCategory clickonDiscount() {
		discount.click();
		return this;
	}
	public ManageCategory uploadChoosefile() {
		files.senkeysforfileupload(choosefile,Constant.IMAGE);
		return this;
	}
	public ManageCategory clickonShowTopmenu() {
		showtopmenu.click();
		return this;
		
	}
	public ManageCategory clickonSavebutton() {
		save.click();
		return this;
	}
	
	
}
