package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;

public class ItemPage {

	public ItemPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//*[@class='single_add_to_cart_button button alt']")
	public WebElement addToBasketButton;

	@FindBy(xpath = "//*[text()='Description']")
	public WebElement descriptionTab;

	@FindBy(xpath = "//*[@id='tab-description']/p")
	public WebElement descriptionBody;

	@FindBy(xpath = "//*[text()='Reviews (0)']")
	public WebElement reviewsTab;

	@FindBy(xpath = "//*[@id='reviews']/div/p")
	public WebElement reviewsBody;

	@FindBy(xpath = "//*[@class='amount']")
	public WebElement itemMenuLink;
	
	@FindBy(xpath="//*[@class='cartcontents']")
	public WebElement menuCartContents;

	@FindBy(xpath = "//*[@class='woocommerce-Price-amount amount']")
	public WebElement itemPrice;

	@FindBy(xpath = "//*[@class='stock in-stock']")
	public WebElement amountInStock;
	
	@FindBy(xpath="//*[@type='number']")
	public WebElement quantityField;
}
