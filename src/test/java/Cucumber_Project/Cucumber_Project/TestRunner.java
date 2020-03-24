package Cucumber_Project.Cucumber_Project;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

 
@RunWith(Cucumber.class)
@CucumberOptions(
		
 features = "C:\\Users\\anuj.k.singh\\eclipse-workspace\\Cucumber_Project\\Features\\test.feature"
 ,
 glue={"stepdefenation"}, 
 plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
		 "junit:target/cucumber-reports/Cucumber.xml",
		 "html:target/cucumber-reports"},
		 monochrome = true
 
 
 ) 	
 
public class TestRunner {
 
}
 

