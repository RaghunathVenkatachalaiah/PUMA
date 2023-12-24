package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="account-button")
	private WebElement menuIcon;
	
	@FindBy(xpath="//span[@data-test-id='account-email']")
	private WebElement emailText;
	
	@FindBy(xpath="//span[@data-test-id='account-full-name']")
	private WebElement accountNameText;
	
	@FindBy(xpath="//div[text()='Add Text']")
	private WebElement addNewAddressButton;
	
	public WebElement getAccountNameText()
	{
		return accountNameText;
	}
	
	public WebElement getEmailText()
	{
		return emailText;
	}
	
	public WebElement getMenuIcon()
	{
		return menuIcon;
	}

	public WebElement getAddNewAddressButton()
	{
		return addNewAddressButton;
	}

}
