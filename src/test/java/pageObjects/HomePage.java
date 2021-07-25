package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver; // local driver
	

	/*
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
*/

	By search = By.xpath("//input[@class='nav-search-input' and @type='text']");
	

	public HomePage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}


	public WebElement getSearch() {
		// TODO Auto-generated method stub
		return driver.findElement(search);
	}

	/*
	public WebElement getSearch() {
		return driver.findElement(search);
	}
	*/


	
}
