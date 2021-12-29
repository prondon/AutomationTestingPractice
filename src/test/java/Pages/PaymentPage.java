package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;

public class PaymentPage {

	
	public PaymentPage(){
		
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="//*[@name='billing_first_name']")
	public WebElement firstNameField;
	
	@FindBy(xpath="//*[@name='billing_last_name']")
	public WebElement lastNameField;
	
	@FindBy(xpath="//*[@name='billing_email']")
	public WebElement emailaddressField;
	
	@FindBy(xpath="//*[@name='billing_phone']")
	public WebElement phoneField;
	
	@FindBy(xpath="//*[@name='billing_address_1']")
	public WebElement addressField;
	
	@FindBy(xpath="//*[@name='billing_city']")
	public WebElement cityField;
	
	@FindBy(xpath="//*[@class='select2-choice select2-default']")
	public WebElement stateDropdown;
	
	@FindBy(xpath="//*[@id='s2id_autogen2_search']")
	public WebElement stateInputField;
	
	@FindBy(xpath="//*[@name='billing_postcode']")
	public WebElement zipField;
	
	@FindBy(xpath="//*[@class='woocommerce-billing-fields']/h3")
	public WebElement billingDetailsTitle;
	
	@FindBy(xpath="//*[@class='woocommerce-shipping-fields']/h3")
	public WebElement additionalInformationTitle;
	
	@FindBy(xpath="//*[@id='order_review_heading']")
	public WebElement yourOrderTitle;
	
	@FindBy(xpath="//*[@id='payment_method_bacs']")
	public WebElement directBankTransferRadioButton;
	
	@FindBy(xpath="//*[@for='payment_method_bacs']")
	public WebElement directBankTransferTitle;
	
	@FindBy(xpath="//*[@id='payment_method_cheque']")
	public WebElement checkPaymentsRadioButton;
	
	@FindBy(xpath="//*[@id='payment_method_cod']")
	public WebElement cashOnDeliveryRadioButton;
	
	@FindBy(xpath="//*[@id='payment_method_ppec_paypal']")
	public WebElement payPalRadioButton;
	
	@FindBy(xpath="//*[@id='place_order']")
	public WebElement placeOrderButton;
	
	@FindBy(xpath="//*[@class='woocommerce']/div[2]")
	public WebElement haveACouponMessage;
}

