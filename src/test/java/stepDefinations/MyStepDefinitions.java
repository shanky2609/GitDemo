package stepDefinations;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class MyStepDefinitions {
	
	public WebDriver driver;

    @Given("^User is on Greenkart$")
    public void user_is_on_greenkart() throws Throwable {
    	System.setProperty("webdriver.chrome.driver","F:\\Automation\\chromedriver.exe");
    	 driver= new ChromeDriver();
    	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");    
    }
    @When("^User searched for  \"([^\"]*)\" Vegetable$")
    public void user_searched_for_something_vegetable(String strArg1) throws Throwable {
    	
    	driver.findElement(By.xpath("//input[@type='search']")).sendKeys(strArg1);
    	Thread.sleep(3000);
        
    }

    @Then("^\"([^\"]*)\" results are displayed$")
    public void something_results_are_displayed(String strArg1) throws Throwable {
    	//to check weather it contains Same product name cucumber
    	Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(strArg1));
        
    }
    
    @Then("^verify selected \"([^\"]*)\" items are displayed in Check out page.$")
    public void verify_selected_something_items_are_displayed_in_check_out_page(String strArg1) throws Throwable {
    	Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(strArg1));
        
    }

    @And("^Added items to cart$")
    public void added_items_to_cart() throws Throwable {
    	driver.findElement(By.cssSelector("a.increment")).click();
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[3]/button")).click();
       
    }

    @And("^User proceeded to Checkout page for purchase$")
    public void user_proceeded_to_checkout_page_for_purchase() throws Throwable {
    	driver.findElement(By.xpath("/html/body/div/div/header/div/div[3]/a[4]/img")).click();
    	driver.findElement(By.xpath("/html/body/div/div/header/div/div[3]/div[2]/div[2]/button")).click();
        
    }

}
