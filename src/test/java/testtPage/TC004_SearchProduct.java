package testtPage;

import org.testng.annotations.Test;

import PageBase.BaseClassTest;
import pageObjects.LoginAccountPageObj;
import pageObjects.homePage;
import pageObjects.searchProductObj;

public class TC004_SearchProduct extends BaseClassTest{

	
	@Test(groups="Master")
	public void SearchProduct() throws InterruptedException
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
		Thread.sleep(5000);
		sp.Clicksearch();
		logger.info("Validating Searching product");
		sp.isProductAvailable();
		System.out.println("Product is available");
		
		
	}
}
