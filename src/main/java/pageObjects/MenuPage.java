package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {
	
	public WebDriver driver;
	public MenuPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="logout")
	private WebElement logoutButton;
	
	public WebElement getLogoutButton()
	{
		return logoutButton;
	}

}
