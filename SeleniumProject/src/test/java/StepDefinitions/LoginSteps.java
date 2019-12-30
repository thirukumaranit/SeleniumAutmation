package StepDefinitions;

import DriverClass.TestDriver;
import io.cucumber.java.en.Given;

public class LoginSteps {
	public String BrowserName;
	public LoginSteps() {
		// TODO Auto-generated constructor stub
	}

	@Given("I am logged in to google.com")
	public void i_am_logged_in_to_google_com() {
		System.out.println("given url launch- execute");
		 
		TestDriver np = new TestDriver();

	}

	@Given("I am in google page.")
	public void i_am_in_google_page() {
		System.out.println("i ma in login page executed");
	}

	
	@Given("I dddd on thisss.")
	public void domsomethin() {
		
		System.out.println("tttt");
		
	} 
}
