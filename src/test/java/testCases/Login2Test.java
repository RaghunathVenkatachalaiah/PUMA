package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import utility.BaseClass;

public class Login2Test extends BaseClass {

	@Test(groups = "SmokeTest")
	public void TC_Puma_002()
	{
		HomePage hp=new HomePage(driver);
		if(hp.getEmailText().getText().equals("talktorajat002@gmail.com"))
		{
			System.out.println("email verified");
		}
	}
	
	@Test(groups = "RegressionTest")
	public void TC_Puma_003()
	{
		HomePage hp=new HomePage(driver);
		hp.getAddNewAddressButton().click();
		if(driver.getCurrentUrl().equals("https://in.puma.com/in/en/account/addresses/add-address"))
		{
			System.out.println("URL address verified");
		}
	}
	
}
