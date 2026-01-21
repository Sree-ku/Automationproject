package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminuserSearch {
	
	public WebDriver driver;
	public AdminuserSearch(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@onclick='click_button(2)']")
	WebElement search;
	@FindBy(xpath="//input[@id='un']")
	WebElement username;
	@FindBy(xpath="//select[@name='ut']")
	WebElement usertype;
	@FindBy(xpath="//button[@name='Search']")
	WebElement searchs;
	
	public void clickonSearchButton() {
		search.click();
	}
	public void enterUsername(String usernamefield) {
		username.sendKeys(usernamefield);
		
	}
	public void enterUsertype() {
		Select select=new Select(usertype);
		select.selectByIndex(2);
	}
	public void searchButton() {
		searchs.click();
	}

}
