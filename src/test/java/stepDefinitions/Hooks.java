package stepDefinitions;

import Automation.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base {
	
	@Before("@MobileTest")
	public void beforevalidation(){
		System.out.println("Before MobileTest hook");
	}
	
	@After("@MobileTest")
	public void aftervalidation(){
		System.out.println("After MobileTest hook");
	}
		

	@Before("@WebTest")
	public void befor_eweb_validation(){
		System.out.println("Before WebTest hook");
	}
		
	@After("@WebTest")
	public void after_webTest_validation(){
		System.out.println("After WebTest hook");
	}
	
	@Before("@SmokeTest")
	public void before_smokeTest_validation(){
		System.out.println("Before  SmokeTest hook");
	}
		
	@After("@SmokeTest")
	public void after_smokeTest_validation(){
		System.out.println("After SmokeTest hook");
	}
	
	@Before("@RegressionTest")
	public void beforeRegressionValidation(){
		System.out.println("Before RegressionTest hook");
	}
		
	@After("@RegressionTest")
	public void after_regressionTest_validation(){
		System.out.println("After RegressionTest hook");
	}
	
	@After("@RegressionTestMeli")
	public void after_regressionTestMeli() {
		driver.close();
	}
	
	@After("@RegressionTestFravega")
	public void after_regressionTestFravega() {
		driver.close();
	}
	@After("@SmokeTestMeli")
	public void after_SmokeTestMeli() {
		driver.close();
	}
	
}

