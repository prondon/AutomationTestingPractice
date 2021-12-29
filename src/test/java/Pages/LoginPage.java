package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;

public class LoginPage {
	
	public LoginPage() {
	PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="//*[@id='username']")
	public WebElement usernameInputField;
	
	@FindBy(xpath="//*[@id='password']")
	public WebElement passwordInputField;
	
	@FindBy(xpath="//*[@class='woocommerce-Button button' and @name='login']")
	public WebElement loginButton;
	
	@FindBy(xpath="//*[@class='woocommerce-error']/li")
	public WebElement errorMessage;
	
	@FindBy(xpath="//*[@id='customer_login']/div/h2")
	public WebElement loginMessage;
}
