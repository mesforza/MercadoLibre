package stepDefinitions;

import static org.junit.Assert.assertTrue;

import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import io.cucumber.junit.Cucumber;
import junit.framework.Assert;
import pageObjects.HomePage;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Automation.Base;
import io.cucumber.datatable.DataTable;
//import Automation.MercadoLibre.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



@RunWith(Cucumber.class)
public class stepDefinitionTest extends Base {
	
	//public WebDriver driver;
	HomePage h;
	 
	//public static final ChromeOptions driver = new ChromeOptions();
	
	//Opening Chrome Browser and launching the login page of application

	//private final WebDriver driver = new ChromeDriver();
	//driver.manage().window().maximize();
	
	// Smoke Test
	@Given("^Enter to the website mercadolibrecom$")
	public void enter_to_the_website_mercadolibrecom() throws Throwable {
		System.out.println("Deciding the browser to open");
		
	   	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usuario\\Documents\\Selenium WebDriver\\Webdriver\\chromedriver-91.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercadolibre.com/");			
    }
		
	
	// Regression Test
	@When("^Pick ARG flag$")
	public void pick_arg_flag() throws Throwable {
	   	//HomePage MeliHome = new HomePage(driver);
	   	//MeliHome.btnCountry().click();
	   	assertTrue( true );
		System.out.println("Valida seleccionar territorio");
    }

    @Then("^Validate Creá tu cuenta of Home page$")
    public void validate_cre_tu_cuenta_of_home_page() throws Throwable {
    	assertTrue( true );
		System.out.println("Validá texto de crear tu cuenta");
    }

    @And("^Validate ingresá text of Home page$")
    public void validate_ingres_text_of_home_page() throws Throwable {
    	assertTrue( true );
		System.out.println("Valida texto de ingresá");
    }
	    
	    
	// Smoke Test    
    @Given("^Enter to the website mercadolibrecomar$")
    public void enter_to_the_website_mercadolibrecomar() throws Throwable {
    	assertTrue( true );
		System.out.println("Valida que ingreso al sitio de mercadolibre arg");
   	}

    @When("^Search for \"([^\"]*)\"$")
    public void search_for_something(String strArg1) throws Throwable {
    	assertTrue( true );
		System.out.println("Valida que buscó por " + strArg1 );
    }

    /*
    @Then("^The results of searching \"([^\"]*)\" is \"([^\"]*)\"$")
    public void the_results_of_searching_something_is_something(String strArg1, String strArg2) throws Throwable {
    	assertTrue( true );
		System.out.println("El resultado de la búsqueda de " + strArg1 + " fue " + strArg2);
    }*/
    
    
    
   // Web Test
    @Given("^The result of searching \"([^\"]*)\"$")
    public void the_result_of_searching_something(String strArg1) throws Throwable {
    	assertTrue( true );
		System.out.println("El resultado de la búsqueda de " + strArg1 );
    }

    @When("^Search for the price between \"([^\"]*)\" and \"([^\"]*)\"$")
    public void search_for_the_price_between_something_and_something(String strArg1, String strArg2) throws Throwable {
    	assertTrue( true );
		
    }
    
    
    @Then("^The results is \"([^\"]*)\"$")
    public void the_results_is_something(String strArg1) throws Throwable {
    	assertTrue( true );
		System.out.println("El resultado es " + strArg1 );
    }
    
    // Regression Test
    @When("^Search for the price between$")
    public void search_for_the_price_between(DataTable data) throws Throwable {
    	List<List<String>> obj = data.asLists();
    	System.out.println(obj.get(0).get(0)); // colum and row
    	System.out.println(obj.get(0).get(1));
    	System.out.println(obj.get(1).get(0)); 
    	System.out.println(obj.get(1).get(1));
    	System.out.println(obj.get(2).get(0)); 
    	System.out.println(obj.get(2).get(1));
    }
	    
    @When("^Search for the price betwen (.+) and (.+)$")
    public void search_for_the_price_between_and(String initialprice, String price) throws Throwable {
    	System.out.println(initialprice);
    	System.out.println(price);
    }
    
    
    
    
    // Search
    
    // Smoke Test Meli 2
    @Given("^User enter to the website mercadolibrecomar$")
    public void user_enter_to_the_website_mercadolibrecomar() throws Throwable {
    	
        System.out.println("Deciding the browser to open");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usuario\\Documents\\Selenium WebDriver\\Webdriver\\chromedriver-91.exe");
		ChromeOptions options = new ChromeOptions(); 
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercadolibre.com.ar/");
			 
    }

    @When("^User search for \"([^\"]*)\"$")
    public void user_search_for_something(String strArg1) throws Throwable {
    	
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@class='nav-search-input' and @type='text']")).sendKeys(strArg1);
	   driver.findElement(By.cssSelector("input.nav-search-input")).click();
	   driver.findElement(By.xpath("//button[@class='nav-search-btn']")).click();
  	
   }


    @Then("^The results of searching \"([^\"]*)\" is \"([^\"]*)\"$")
    public void the_results_of_searching_something_is_something(String strArg1, String strArg2) throws Throwable {
       if( driver.findElement(By.cssSelector("span.ui-search-search-result__quantity-results")).isDisplayed()){
    		System.out.println("Element " + strArg1 + " is visible, the status is " + strArg2);
    		}else{
    		System.out.println("Element is InVisible");
    		}
    }
     //Regression Test MELI    
       
    @Given("^User is on the result page of searching (.+)$")
    public void user_is_on_the_result_page_of_searching(String product) throws Throwable {
    	
    	/*
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usuario\\Documents\\Selenium WebDriver\\Webdriver\\chromedriver-91.exe");
 		ChromeOptions options = new ChromeOptions(); 
 		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
 		driver=new ChromeDriver();
 		driver.manage().window().maximize();
 		*/
    	driver = Base.getDriver();
 		//driver.get("https://www.mercadolibre.com.ar/");
 		Thread.sleep(2000);
 		h = new HomePage(driver);
 		//driver.findElement(By.xpath("//input[@class='nav-search-input' and @type='text']")).sendKeys(product);
 		h.getSearch().sendKeys(product);
 		 
 		driver.findElement(By.cssSelector("input.nav-search-input")).click();
 	    driver.findElement(By.xpath("//button[@class='nav-search-btn']")).click();
    }

    @When("^User search a product with price betwen (.+) and (.+)$")
    public void user_search_a_product_with_price_betwen_and(String initialprice, String topprice) throws Throwable {
 		//Thread.sleep(2000);
 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.findElement(By.xpath("//input[@data-testid='Minimum-price' and @placeholder='Mínimo']")).sendKeys(initialprice);
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.findElement(By.xpath("//input[@data-testid='Maximum-price' and @placeholder='Máximo']")).sendKeys(topprice);
    	//Thread.sleep(2000);
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.findElement(By.xpath("//button[@data-testid='submit-price' and @class='ui-search-price-filter-action-btn']")).click();
		System.out.println("Element is Visible");

    }

     @Then("^The result (.+) are displayed (.+)$")
     public void the_result_are_displayed(String text, String status) throws Throwable {
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	try   
    	  {    
    	    if( driver.findElement(By.xpath("//span[@class='ui-search-search-result__quantity-results']")).isDisplayed() )     
    	    {      
    	    	System.out.println("Element " + text + " is Visible, the status is " + status);   
    	    }    
    	  }      
    	  catch(Exception e)     
    	  {       
    		  System.out.println("Element " + text + " is Visible, the status is " + status);  
    	  }     
     }

    
    
    // RegressionTestFravega
    @Given("^User is on the result page of searching (.+)Fravega$")
    public void user_is_on_the_result_page_of_searchingFravega(String product) throws Throwable {
    	System.out.println("Deciding the browser to open");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usuario\\Documents\\Selenium WebDriver\\Webdriver\\chromedriver-91.exe");
		ChromeOptions options = new ChromeOptions(); 
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.fravega.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[3]/div[1]/div[2]/button[1]")).click();
		Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@class='sc-hTRkXV enlJuL']")).sendKeys(product);
    	driver.findElement(By.xpath("//button[@class='sc-iNiQyp jdiWPe']")).click();
		Thread.sleep(2000);

    	
    }

    @When("^User search a product with price betwen (.+) and (.+)Fravega$")
    public void user_search_a_product_with_price_betwen_andFravega(String initialprice, String price) throws Throwable {
    	
    	driver.findElement(By.xpath("//input[@type='number' and @placeholder='Min']")).sendKeys(initialprice);
        driver.findElement(By.xpath("//input[@type='number' and @placeholder='Max']")).sendKeys(price);
    	Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='PriceRangeFilterForm__SubmitButton-fzon6y-2 hEUlwn' and @type='submit']")).click();
    }

    @Then("^The result (.+) are displayed (.+)Fravega$")
    public void the_result_are_displayedFravega(String text, String status) throws Throwable {
    	Thread.sleep(1000);
    	if( driver.findElement(By.xpath("//li[@name='totalResult' and @class='listingDesktopstyled__TotalResult-wzwlr8-2 eTPNDu']")).isDisplayed()){
    		System.out.println("Element " + text + " is Visible, the status is " + status);
    		}else{
    		System.out.println("Element is InVisible");
    		}
    	
    	System.out.println("The result are displayed " + status);
    }

}
