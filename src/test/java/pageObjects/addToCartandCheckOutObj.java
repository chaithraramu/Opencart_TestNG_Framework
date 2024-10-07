package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import PageBase.BasePageObj;

public class addToCartandCheckOutObj extends BasePageObj{

	public addToCartandCheckOutObj(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//span[@id='cart-total']") 
	WebElement cartclear;
	
	@FindBy(xpath="//div[@class='caption']//a[contains(text(),'iPhone')]") 
	WebElement clickonproduct;
	
	@FindBy(xpath="//button[@id='button-cart']") 
	WebElement btnaddCart;
	
	@FindBy(xpath="//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']") 
	WebElement btnshowCart;
	
	@FindBy(xpath="//strong[normalize-space()='View Cart']") 
	WebElement ViewCart;
	
	@FindBy(xpath="//a[@class='btn btn-primary']") 
	WebElement btnCheckout;
	
	public void CartClear()
	{
		cartclear.clear();
	}
	
	public void ClickonProduct()
	{
		clickonproduct.click();
	}
	public void AddtoCart()
	{
		btnaddCart.click();
	}
	
	public void ShowCart()
	{
		btnshowCart.click();
	}
	
	public void viewCart()
	{
		ViewCart.click();
	}
	
	public void CheckOut()
	{
		btnCheckout.click();
	}


}
