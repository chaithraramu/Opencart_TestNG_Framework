package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import PageBase.BasePageObj;

public class searchProductObj extends BasePageObj{

	public searchProductObj(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//input[@placeholder='Search']") 
	WebElement txtSearch;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']") 
	WebElement btnSearch;

	@FindBy(xpath="//a[normalize-space()='iPhone']")
	WebElement txtsearched;
	
	
	public void inputsearch(String product)
	{
		txtSearch.sendKeys(product);
	}
	
	public void Clicksearch()
	{
		btnSearch.click();
	}
	
	public boolean isProductAvailable()
	{
		return txtsearched.isDisplayed();
	}
}


