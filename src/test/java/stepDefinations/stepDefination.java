package stepDefinations;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {
	
	
	  @Given("^validate the browser$")
	    public void validate_the_browser() throws Throwable {
	        System.out.println("validate the browser");
	    }

	    @When("^browser is trigerred$")
	    public void browser_is_trigerred() throws Throwable {
	    	System.out.println("browser is trigerred"); 
	    }

	    @Then("^Check if browser is started$")
	    public void check_if_browser_is_started() throws Throwable {
	    	System.out.println("Check if browser is started");
	    }


    @Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
    	System.out.println("user on landing page");
    }
        
    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
    	//code
    	System.out.println("user on application page");
      
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	//code
    	System.out.println("user on home page");
       
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	//code
    	System.out.println("user oncards page");
    }      
    
    @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1);
        System.out.println(strArg2);
    }
    
    @Then("Cards are displayed {string}")
    public void cards_are_displayed(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(string);
    }
    
    @When("^User login into APP with (.+)and password (.+)$")
    public void user_login_into_app_with_and_password(String username, String password) throws Throwable {
        System.out.println(username);
        System.out.println(password);
        
    }
    
 
    
}

