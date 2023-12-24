package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="email")
	private WebElement emailTextField;
	
	
	///****@FindBys will accept multiple @FindBy of a single webelement and it will be like "and" operator in findElement()*****////
	
	@FindBys({
		@FindBy(id="password"),
		@FindBy(xpath="//input[@data-test-id='auth-field-password']")
	})
	private WebElement passwordTextField;
	
	//////****@FindAll will also accept multiple @FindBy of a single webelement and it will be like "or" operator in findElement()***/////
	
	@FindAll({
		@FindBy(id="login-submit"),
		@FindBy(xpath="//button[@data-test-id='auth-button-login']")
	})
	private WebElement loginButton;
	
	///****We can declare the webelement as private and access the same inside the method of same class or can use getters of the element
	/*public WebElement getEmailTextField()
	{
		return emailTextField;
	}*/
	
	public WebElement getLoginButton()
	{
		return loginButton;
	}
	
	public void goToHomePage(String username, String password)
	{
		emailTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
//		loginButton.click();
	}
}
