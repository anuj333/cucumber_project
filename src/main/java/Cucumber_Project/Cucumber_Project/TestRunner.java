package Cucumber_Project.Cucumber_Project;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "Features"
 ,glue={"stepDefenation"}
 )
 
public class TestRunner {
 
}
 

