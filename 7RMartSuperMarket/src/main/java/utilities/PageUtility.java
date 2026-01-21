package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public void selectByindex(WebElement element,int index) {
	 Select select=new Select(element);
	 select.selectByIndex(index);
		
	}
	public void selectByVisibleText(WebElement element,String text) {
		Select select=new Select(element);
		select.selectByVisibleText(text);
		
	}
	public void selectByValues(WebElement element,String values) {
		Select select=new Select(element);
		select.selectByValue(values);
	}

}
