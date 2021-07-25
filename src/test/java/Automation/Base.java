package Automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public static WebDriver getDriver() throws IOException { // i can acces to this method calling Base
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Usuario\\eclipse-workspace-Oxygen\\MercadoLibre\\src\\test\\java\\Automation\\global.properties"); 
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usuario\\Documents\\Selenium WebDriver\\Webdriver\\chromedriver-91.exe");
 		ChromeOptions options = new ChromeOptions(); 
 		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
 		driver=new ChromeDriver();
 		driver.manage().window().maximize();
 		//driver.get("https://www.mercadolibre.com.ar/");
 		driver.get(prop.getProperty("url"));
 		
 		
 		return driver; // which ever class access this method will receive the driver will return the driver
	}
}
