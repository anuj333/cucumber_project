package stepdefenation;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Stepnew {
	
	

	
	
	@Given("^print without data$")
	public void print_without_data() throws Throwable {
		System.out.println("without data");

	}

	@Then("^print with data$")
	public void print_with_data_and(DataTable values) throws Throwable {
		for(Map<String,String>ls :values.asMaps(String.class,String.class)) {
		
		System.out.println(ls.get("first name"));	
		System.out.println(ls.get("last name"));
		}
	}

	
}
