package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;

public class DashboardPage {
	
	public DashboardPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="(//*[@class='woocommerce-MyAccount-content']/p)[1]")
	public WebElement welcomeMessage;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	public WebElement logoutButton;
}
