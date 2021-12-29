package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;

public class BasketPage {
	public BasketPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//*[@id='coupon_code']")
	public WebElement couponCodeField;
	
	@FindBy(xpath = "//*[@name='apply_coupon']")
	public WebElement applyCouponButton;
	
	@FindBy(xpath = "//*[@data-title='Coupon: krishnasakinala']/span")
	public WebElement couponInformation;
	
	@FindBy(xpath="//*[@class='woocommerce-error']/li")
	public WebElement couponErrorMessage;
	
	@FindBy(xpath="//*[@title='Remove this item']")
	public WebElement removeButton;
	
	@FindBy(xpath="//*[@class='cart-empty']")
	public WebElement emptyBasketMessage;
	
	@FindBy(xpath="//*[@title='Qty']")
	public WebElement quantityTextbox;
	
	@FindBy(xpath="//*[@value='Update Basket']")
	public WebElement updateBasketButton;
	
	@FindBy(xpath="//*[@data-title='Subtotal']/span")
	public WebElement checkoutSubtotal;
	
	@FindBy(xpath="//*[@data-title='Total']/strong/span")
	public WebElement checkoutTotal;
	
	@FindBy(xpath="//*[contains(text(),'	Proceed to Checkout')]")
	public WebElement proceedToCheckoutButton;
}
