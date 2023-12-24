package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorUtility {
	
	public void javascriptClick(WebElement ele, WebDriver driver)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();",ele);
	}

	public void JavascriptSenddata(WebElement ele, WebDriver driver, String data) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("argument[0]", null)
	}
	
}
