package Cucumber_Project.Cucumber_Project;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

 
@RunWith(Cucumber.class)
@CucumberOptions(
		
 features = "C:\\Users\\anuj.k.singh\\eclipse-workspace\\Cucumber_Project\\Features\\test.feature"
 ,
 glue={"stepdefenation"}, 
 plugin = { "pretty", "json:test-output/cucumber-reports/Cucumber.json",
		 "junit:test-output/cucumber-reports/Cucumber.xml",
		 "html:test-output/cucumber-reports"},
		 monochrome = true
 
 
 ) 	
 
public class TestRunner {
 
}
 

