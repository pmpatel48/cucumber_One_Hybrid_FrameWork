package pageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	
	public WebDriver driver;
	
	public LoginPageFactory(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(id="sp-cc-accept")
	WebElement acceptcookies;
	
	@FindBy(xpath="//div[@id='nav-tools'] //a[contains(@href,'signin?')]")
	WebElement signinoption;
	
	@FindBy(id="ap_email")
	WebElement email;
	
	@FindBy(id="continue")
	WebElement continuebtn;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(id="signInSubmit")
	WebElement signinbtn;
	
	@FindBy(xpath="//a[@id='nav-hamburger-menu']")
	WebElement alloption;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	WebElement signout;
	
	public WebElement accept_Cookies() {
		
		return acceptcookies;
	}
	
	public WebElement signin_Option() {
		
		return signinoption;
	}

	public WebElement enter_EmailAddress() {
		
		return email;
	}
	
	public WebElement continue_Button() {
		
		return continuebtn;
	}
	public WebElement enter_Password() {
		
		return pwd;
	}
	public WebElement signin_button() {
		
		return signinbtn;
	}
	public WebElement all_option() {
		
		return alloption;
	}
	public WebElement sign_Out() {
	
	return signout;
	}

}
