package stepdefenation;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
@Before(order=1)
public void beforemethod() {
	System.out.println("before method");	
}
@Before("@smoke")
public void beforemethod1() {
	System.out.println("before method = 0");	
}
@After
public void Aftermethod(){
	System.out.println("after method");
}
}
