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

	By ofertasText = By.xpath("//h2[contains(text(),'Ofertas')]");
	By pickFlagArg = By.id("AR");
	By beneficiosText = By.xpath("//h2[contains(text(),'Beneficios de Mercado Puntos')]");
	By descubriText = By.xpath("//h2[contains(text(),'Descubrí')]");
	By las_Mejores_Tiendas_Text = By.xpath("//h2[contains(text(),'Las mejores tiendas te esperan')]");
	By newCookieDisclaimerButton = By.id("newCookieDisclaimerButton");
	By nav_search_input = By.cssSelector("input.nav-search-input");
	By nav_search_btn = By.xpath("//button[@class='nav-search-btn']");
	//button[@class='ui-pdp-icon ui-pdp-icon--bookmark ui-pdp-bookmark__icon-bookmark']
	
	//button[@class='ui-pdp-bookmark__link-bookmark']/*[name()='svg']
	
	
	//a[@class='ui-pdp-bookmark__link-bookmark']/*[name()='svg']
	
		
	public HomePage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}

	public WebElement pickFlagArg() {
		return driver.findElement(pickFlagArg);
	}
	
	
	public WebElement ofertasText() {
		return driver.findElement(ofertasText);
	}
	
	public WebElement beneficiosText() {
		return driver.findElement(beneficiosText);
	}
	
	public WebElement descubriText() {
		return driver.findElement(descubriText);
	}
	
	public WebElement las_mejores_tiendas_text() {
		return driver.findElement(las_Mejores_Tiendas_Text);
	}

	public WebElement newCookieDisclaimerButton() {
		return driver.findElement(newCookieDisclaimerButton);
	}
	
	public WebElement nav_search_input() {
		return driver.findElement(nav_search_input);
		
	}
	
	public WebElement nav_search_btn() {
		return driver.findElement(nav_search_btn);
	}
}
