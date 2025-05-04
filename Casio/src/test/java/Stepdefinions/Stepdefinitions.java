package Stepdefinions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.Register;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefinitions {
	
	WebDriver driver;
	
		HomePage homepage;
		Register register;
	
		@Test (groups= {"smoke"})
	@Given("User on the casio india homepage")
	public void user_on_the_casio_india_homepage() {
		 WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
		 driver.get("https://www.casioindiashop.com/");
		 driver.manage().window().maximize();
		 homepage = new HomePage(driver);
		 register = new Register(driver);
	    
		}

		

		

		
		
	@When("User click on the navigation menu")
	public void user_click_on_the_navigation_menu() {
		homepage.closebtn();
	    homepage.navigation();
	}

	@Then("The navigation main menu page should be visible")
	public void the_navigation_main_menu_page_should_be_visible() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User check the banner on homepge")
	public void user_check_the_banner_on_homepge() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Banner is displayed")
	public void banner_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User enter the {string} into the search bar")
	public void user_enter_the_into_the_search_bar(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should see Search Result for {string}")
	public void user_should_see_search_result_for(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	

}
