package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;

public class ConfirmationPage {

	public ConfirmationPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//*[@class='woocommerce-thankyou-order-received']")
	public WebElement orderConfirmationMessage;
}
