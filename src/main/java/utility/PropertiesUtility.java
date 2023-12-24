package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility {

	public String readPropertiesData(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./src/main/resources/browser.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty("browser");
		return value;
		
	}
}
