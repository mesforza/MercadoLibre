package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
/*
@CucumberOptions(
		features= "src/test/java/features", glue = {"stepDefinitions"}, stepNotifications = true) // package name
		//features= "src/test/java/features/Login.feature", //if u want an specific file
public class TestRunner {

}*/

@CucumberOptions(
		features= "src/test/java/features", 
		glue = {"stepDefinitions"}, stepNotifications = true, tags = "@RegressionTestMeli4",  monochrome=true, //dryRun=false,
		plugin= {"pretty", "html:target/cucumber.html", "json:target/cucumber.json", "junit:target/cukes.xml"}) // package name
		//features= "src/test/java/features/Login.feature", //if u want an specific file //dryRun=true,
public class TestRunner {

}
