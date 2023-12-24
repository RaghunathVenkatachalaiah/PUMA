package utility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MenuPage;

public class BaseClass {
	
	public WebDriver driver;
	public JavaScriptExecutorUtility jsU=new JavaScriptExecutorUtility();
	public ExcelUtility excel=new ExcelUtility();
	public PropertiesUtility properties=new PropertiesUtility();
	
	@Parameters("browser")
	@BeforeClass(groups = {"SmokeTest","RegressionTest"})
	public void launchingBrowser(String BROWSER) throws IOException
	{
		//String browser=properties.readPropertiesData("browser");
		System.out.println("Launching browser");
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@BeforeMethod(groups = {"SmokeTest","RegressionTest"})
	public void loginToApplication() throws InterruptedException
	{
		System.out.println("login to application");
		Thread.sleep(2000);
		driver.get("https://in.puma.com/in/en/account/login?action=login_with_email");
		LoginPage login=new LoginPage(driver);
		login.goToHomePage("talktorajat002@gmail.com","Robin@123");
		WebElement loginButton=login.getLoginButton();
		jsU.javascriptClick(loginButton, driver);
		
	}
	
	@AfterMethod(groups = {"SmokeTest","RegressionTest"})
	public void logoutApplication()
	{
		System.out.println("logged out");
		HomePage home=new HomePage(driver);
		home.getMenuIcon().click();
		MenuPage menu=new MenuPage(driver);
		menu.getLogoutButton().click();
	}
	
	@AfterClass(groups = {"SmokeTest","RegressionTest"})
	public void quitBrowser()
	{
		System.out.println("quit browser");
		driver.quit();
	}

}
