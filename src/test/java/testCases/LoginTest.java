package testCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import utility.BaseClass;

public class LoginTest extends BaseClass{

	@Test(groups = {"SmokeTest","RegressionTest"})
	public void TC_Puma_001() throws EncryptedDocumentException, IOException
	{
		System.out.println("Logged in");
		String value=excel.readExcelData("credentials",1, 2);
		System.out.println(value);
		HomePage hp=new HomePage(driver);
		if(hp.getAccountNameText().getText().equals("Robin Hood"))
		{
			System.out.println("account name verified");
		}
	}
	
}
