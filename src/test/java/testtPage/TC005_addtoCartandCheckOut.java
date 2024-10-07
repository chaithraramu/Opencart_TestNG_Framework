package testtPage;

import org.testng.annotations.Test;

import PageBase.BaseClassTest;
import pageObjects.LoginAccountPageObj;
import pageObjects.addToCartandCheckOutObj;
import pageObjects.homePage;
import pageObjects.searchProductObj;

public class TC005_addtoCartandCheckOut extends BaseClassTest{
	
	@Test(groups="Master")
	public void addtoCartandCheckout() throws InterruptedException
	{
		logger.info("*********SearchProduct Start*************");
		
		homePage hp=new homePage(driver);
		hp.ClickMyAccount();
		logger.info("Clicked on My Account");
		
		hp.ClickLoggin();
		logger.info("Clicked on Login");
		
		logger.info("**********Starting Login Page*******");
		//Login Page

		LoginAccountPageObj lp=new LoginAccountPageObj(driver);
		lp.getEmail(p.getProperty("email"));
		lp.getPassword(p.getProperty("password"));
		lp.btnClickLogin();
		
		logger.info("Login Successful");
		
		logger.info("Input Searching product");
		searchProductObj sp=new searchProductObj(driver);
		sp.inputsearch(p.getProperty("product"));
		Thread.sleep(3000);
		sp.Clicksearch();
		logger.info("Validating Searching product");
		sp.isProductAvailable();
		System.out.println("Product is available");
		
		addToCartandCheckOutObj atc=new addToCartandCheckOutObj(driver);
//		atc.CartClear();
//		Thread.sleep(3000);
		atc.ClickonProduct();
		Thread.sleep(3000);
		atc.AddtoCart();
		Thread.sleep(3000);
		atc.ShowCart();
		Thread.sleep(3000);
		atc.viewCart();
		Thread.sleep(3000);
		atc.CheckOut();
		
		
	}

}
