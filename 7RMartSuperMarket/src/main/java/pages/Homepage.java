package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	public WebDriver driver;

	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	WebElement admin;
	@FindBy(xpath = "(//a[@class='dropdown-item'])[2]") // index-xpath
	WebElement logout;

	@FindBy(xpath = "(//a[@class='small-box-footer'])[1]")
	WebElement moreinfoAdmin;

	@FindBy(xpath = "(//a[@class='small-box-footer'])[7]")
	WebElement moreinfoNews;

	@FindBy(xpath = "(//a[@class='small-box-footer'])[9]")
	WebElement moreinfoCategory;

	public Homepage clickonAdmin() {
		admin.click();
		return this;
	}

	public Homepage clickonLogout() {
		logout.click();
		return this;
	}

	public Adminuserpage clickonMoreinfoAdmin() {
		moreinfoAdmin.click();
		return new Adminuserpage(driver);

	}

	public ManageNews clickonMoreinfoNews() {
		moreinfoNews.click();
		return new ManageNews(driver);

	}

	public ManageCategory clickonMoreinfoCategory() {
		moreinfoCategory.click();
		return new ManageCategory(driver);

	}

}
