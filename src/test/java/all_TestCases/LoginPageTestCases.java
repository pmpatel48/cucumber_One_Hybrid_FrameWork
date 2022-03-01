


package all_TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import browser_Initialization.Base;
import pageObjectRepository.LoginPageFactory;

public class LoginPageTestCases extends Base{
	
	// Author Name Pmpatel48
	
	public WebDriver driver;
	public LoginPageFactory lp;
	
	@BeforeTest
	public void invoke_Browser() throws IOException {
		
		driver=initialise_Browser();
		driver.get(prop.getProperty("url"));
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void loginValidation() throws IOException, InterruptedException {
		
		
		
		
		lp=new LoginPageFactory(driver);
		lp.accept_Cookies().click();
		lp.signin_Option().click();
		lp.enter_EmailAddress().sendKeys(prop.getProperty("email"));
		lp.continue_Button().click();
		lp.enter_Password().sendKeys(prop.getProperty("password"));
		lp.signin_button().click();
		lp.all_option().click();
		Thread.sleep(2000);
		lp.sign_Out().click();
	
		
	}
	
	@AfterTest
	public void close_Browser() {
		
		driver.quit();
	}

}
