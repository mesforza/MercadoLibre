package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {

	public WebDriver driver; // local driver
	
			
	public ProductPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}
	
	By buttonAddProductToCart = By.xpath("//a[@class='ui-pdp-bookmark__link-bookmark']/*[name()='svg']");
	By addProductToFavorites = By.xpath("//a[@class='ui-pdp-bookmark__link-bookmark']/*[name()='svg']");
	By loginToAddFavorites = By.xpath("//h1[contains(text(),'¡Hola! Para agregar favoritos, ingresá a tu cuenta')]");
	By buttonImNew = By.xpath("//span[contains(text(),'Soy nuevo')]");	
	
	
	public WebElement buttonAddProductToCart() {
		return driver.findElement(buttonAddProductToCart);
	}
	
	public WebElement addProductToFavorites() {
		return driver.findElement(addProductToFavorites);
	}
	
	public WebElement loginToAddFavorites() {
		return driver.findElement(loginToAddFavorites);
	}
	
	public WebElement buttonImNew() {
		return driver.findElement(buttonImNew);
	}
}
