package stepDefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageObjectRepository.LoginPageFactory;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import browser_Initialization.Base;

@RunWith(Cucumber.class)
public class StepDefination extends Base{
	
	  public WebDriver driver;
	  public LoginPageFactory lp;
	
	
	  
	  @Given("^User Validate the Browser$")
	  public void user_validate_the_browser() throws IOException{
		  
		  driver=initialise_Browser(); 
	    }

	  @When("^User Triggered the Browser$")
	  public void user_triggered_the_browser(){
	    	
		  driver.get(prop.getProperty("url"));
	    }

	  @Then("^User check browser invoking successfully or not$")
	  public void user_check_browser_invoking_successfully_or_not(){
		  
		  	
		  	// Amazon Home page tittle validation check
	    	Assert.assertEquals(driver.getTitle(), "Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more");
	    }

	
	
	
	

    @Given("^User Landed on Amazon Home Page$")
    public void user_landed_on_amazon_home_page(){
    	
    	//Search Text Box validation check
    	
    	Assert.assertTrue(driver.findElement(By.cssSelector("div[id='nav-search']")).isDisplayed());     
    	
    }

    @When("^User Click on SignIn Option at Amazon Home Page$")
    public void user_click_on_signin_option_at_amazon_home_page() throws InterruptedException{

    	lp=new LoginPageFactory(driver);
    	lp.accept_Cookies().click();
		lp.signin_Option().click();
    }

    @Then("^SignIn Page is Displayed$")
    public void signin_page_is_displayed(){
    	
    	//Signin LOGO validation
    	
    	Assert.assertTrue(driver.findElement(By.cssSelector("h1[class='a-spacing-small']")).isDisplayed());
    }
    
    @When("^User enter (.+) and (.+)$")
    public void user_enter_and(String email, String password){
    	
    	lp.enter_EmailAddress().sendKeys(email);
		lp.continue_Button().click();
		lp.enter_Password().sendKeys(password);
    }
    
    @And("^Click on SignIn Button$")
    public void click_on_signin_button(){
    	
    	lp.signin_button().click();
    }


    @Then("^Amzon Account home page is displayed for valid user$")
    public void amzon_account_home_page_is_displayed_for_valid_user(){
    	
    	//user name is displayed in Delivery logo validation check
    	
    	Assert.assertTrue(driver.findElement(By.cssSelector("span[id='glow-ingress-line1']")).isDisplayed());
    }

    @And("^User checked the account and click on signout button$")
    public void user_checked_the_account_and_click_on_signout_button() throws InterruptedException{
    
    	
    	lp.all_option().click();
    	Thread.sleep(2000L);
    	lp.sign_Out().click();;
    	
    }
    
    @And("^User closed the browser$")
    public void user_closed_the_browser(){
    	
    	driver.quit();
    }
    
    @When("^User Enter email Address \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_enter_email_address_something_and_password_something(String email, String password){
    	
    	lp.enter_EmailAddress().sendKeys(email);
		lp.continue_Button().click();
		lp.enter_Password().sendKeys(password);
    	
    	
    }
    
   
    @When("^User Enter incorrect email Address \"([^\"]*)\"$")
    public void user_enter_incorrect_email_address_something(String email){
    	
    	lp.enter_EmailAddress().sendKeys(email);
    }
    
    @And("^Click on continue button$")
    public void click_on_continue_button() throws InterruptedException{
    	
    	lp.continue_Button().click();
    	Thread.sleep(1000L);
    }
    
    
    
    
    @Then("^we cannot find account error message is displayed on the screen$")
    public void we_cannot_find_account_error_message_is_displayed_on_the_screen() throws InterruptedException{
    	
    	Assert.assertTrue(driver.findElement(By.cssSelector("div#auth-error-message-box")).isDisplayed());
    	Thread.sleep(1000L);
    	
    }
    
    @When("^User Enter blank email Address \"([^\"]*)\"$")
    public void user_enter_blank_email_address_something(String email){
    	
    	lp.enter_EmailAddress().sendKeys(email);
    }


    
    @Then("^Enter your email address or phone number error message is displayed on the screen$")
    public void enter_your_email_address_or_phone_number_error_message_is_displayed_on_the_screen() throws InterruptedException{
    	
    	Assert.assertTrue(driver.findElement(By.cssSelector("div#auth-email-missing-alert")).isDisplayed());
    	
    	
    }
    
   
    
    
    
    
    @Then("^forgot password link is displayed on the page$")
    public void forgot_password_link_is_displayed_on_the_page() throws InterruptedException{
    	
    	Thread.sleep(1000L);
    	Assert.assertTrue(driver.findElement(By.cssSelector("a[id='auth-fpp-link-bottom']")).isDisplayed());
    	
    }

    @And("^important message is also displayed$")
    public void important_message_is_also_displayed() throws InterruptedException{
    	
    	Assert.assertTrue(driver.findElement(By.cssSelector("div.a-box-inner.a-alert-container")).isDisplayed());
    	
    }
    
    @Then("^Enter your password error message is dispalyed on the page$")
    public void enter_your_password_error_message_is_dispalyed_on_the_page() throws InterruptedException{
    	
    	Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Enter your passw')]")).isDisplayed());
    }


    


}