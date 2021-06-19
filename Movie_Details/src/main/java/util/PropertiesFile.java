package util;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesFile {
	static Properties prop = new Properties();
	public static void getProperties() {
		
		try {
			FileInputStream input = new FileInputStream("C:\\Users\\amanj\\eclipse-workspace\\Movie_Details\\src\\config\\property.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			String URL = prop.getProperty("URL");
			System.out.println(URL);
			TestBase.Browser = browser;
			TestBase.URL = URL;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}

}
