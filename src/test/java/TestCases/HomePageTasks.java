package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utilities.CommonMethods;
import Utilities.Driver;
import Utilities.Reader;

public class HomePageTasks extends CommonMethods {

	@BeforeMethod
	public void setUp() {
		Driver.getDriver();
	}

	@Test(enabled = false)
	public void sliders() {

		CommonMethods.click(hp.shopTab);

		CommonMethods.click(sp.homeLink);

		CommonMethods.assertTrue(Integer.toString(hp.sliders.size()).equals(Reader.getValue("verifySliders")));
	}

	@Test(enabled = false)
	public void arrivals() {

		CommonMethods.click(hp.shopTab);

		CommonMethods.click(sp.homeLink);

		CommonMethods.assertTrue(Integer.toString(hp.arrivals.size()).equals(Reader.getValue("verifyArrivals")));
	}

	@Test(enabled = false)
	public void imagesInArrivals() {

		CommonMethods.click(hp.shopTab);

		CommonMethods.click(sp.homeLink);

		CommonMethods.assertTrue(Integer.toString(hp.arrivals.size()).equals(Reader.getValue("verifyArrivals")));

		String homePageTitle = CommonMethods.getTitle(Driver.getDriver());

		CommonMethods.click(hp.arrivalsImage);

		String itemPageTitle = CommonMethods.getTitle(Driver.getDriver());

		CommonMethods.assertTrue(!homePageTitle.equals(itemPageTitle));

		CommonMethods.assertTrue(CommonMethods.isClickable(Driver.getDriver(), ip.addToBasketButton));
	}

	@Test(enabled = false)
	public void arrivalsImagesDescription() {

		CommonMethods.click(hp.shopTab);

		CommonMethods.click(sp.homeLink);

		CommonMethods.assertTrue(Integer.toString(hp.arrivals.size()).equals(Reader.getValue("verifyArrivals")));

		String homePageTitle = CommonMethods.getTitle(Driver.getDriver());

		CommonMethods.click(hp.arrivalsImage);

		String itemPageTitle = CommonMethods.getTitle(Driver.getDriver());

		CommonMethods.assertTrue(!homePageTitle.equals(itemPageTitle));

		CommonMethods.assertTrue(CommonMethods.isClickable(Driver.getDriver(), ip.addToBasketButton));

		CommonMethods.click(ip.descriptionTab);

		CommonMethods.assertFalse(CommonMethods.textIsBlank(ip.descriptionBody));
	}

	@Test(enabled = false)
	public void arrivalsImagesReviews() {

		CommonMethods.click(hp.shopTab);

		CommonMethods.click(sp.homeLink);

		CommonMethods.assertTrue(Integer.toString(hp.arrivals.size()).equals(Reader.getValue("verifyArrivals")));

		String homePageTitle = CommonMethods.getTitle(Driver.getDriver());

		CommonMethods.click(hp.arrivalsImage);

		String itemPageTitle = CommonMethods.getTitle(Driver.getDriver());

		CommonMethods.assertTrue(!homePageTitle.equals(itemPageTitle));

		CommonMethods.assertTrue(CommonMethods.isClickable(Driver.getDriver(), ip.addToBasketButton));

		CommonMethods.click(ip.reviewsTab);

		CommonMethods.assertFalse(CommonMethods.textIsBlank(ip.reviewsBody));
	}

	@Test(enabled = false)
	public void arrivalsImagesAddToBasket() {

		CommonMethods.click(hp.shopTab);

		CommonMethods.click(sp.homeLink);

		CommonMethods.assertTrue(Integer.toString(hp.arrivals.size()).equals(Reader.getValue("verifyArrivals")));

		String homePageTitle = CommonMethods.getTitle(Driver.getDriver());

		CommonMethods.click(hp.arrivalsImage);

		String itemPageTitle = CommonMethods.getTitle(Driver.getDriver());

		CommonMethods.assertTrue(!homePageTitle.equals(itemPageTitle));

		CommonMethods.assertTrue(CommonMethods.isClickable(Driver.getDriver(), ip.addToBasketButton));

		CommonMethods.click(ip.addToBasketButton);

		CommonMethods.assertTrue(CommonMethods.getText(ip.itemPrice).equals(CommonMethods.getText(ip.itemMenuLink)));
//		CommonMethods.assertTrue(Double.parseDouble(CommonMethods.getText(ip.cartAmount).substring(1)) > 0);
	}

	@Test(enabled = false)
	public void arrivalsAddToBasketWithMoreBooks() {

		CommonMethods.click(hp.shopTab);

		CommonMethods.click(sp.homeLink);

		CommonMethods.assertTrue(Integer.toString(hp.arrivals.size()).equals(Reader.getValue("verifyArrivals")));

		String homePageTitle = CommonMethods.getTitle(Driver.getDriver());

		CommonMethods.click(hp.arrivalsImage);

		String itemPageTitle = CommonMethods.getTitle(Driver.getDriver());

		CommonMethods.assertTrue(!homePageTitle.equals(itemPageTitle));

		CommonMethods.assertTrue(CommonMethods.isClickable(Driver.getDriver(), ip.addToBasketButton));

		CommonMethods.click(ip.addToBasketButton);

		CommonMethods.assertTrue(CommonMethods.getText(ip.itemPrice).equals(CommonMethods.getText(ip.itemMenuLink)));

		CommonMethods.input(ip.quantityField,
				(CommonMethods.extractDigitsFromString(CommonMethods.getText(ip.amountInStock)) + 1) + "");

		CommonMethods.click(ip.addToBasketButton);
	}

	@Test(enabled = false)
	public void arrivalsAddToBasketItems() {

		CommonMethods.click(hp.shopTab);

		CommonMethods.click(sp.homeLink);

		CommonMethods.assertTrue(Integer.toString(hp.arrivals.size()).equals(Reader.getValue("verifyArrivals")));

		String homePageTitle = CommonMethods.getTitle(Driver.getDriver());

		CommonMethods.click(hp.arrivalsImage);

		String itemPageTitle = CommonMethods.getTitle(Driver.getDriver());

		CommonMethods.assertTrue(!homePageTitle.equals(itemPageTitle));

		CommonMethods.assertTrue(CommonMethods.isClickable(Driver.getDriver(), ip.addToBasketButton));

		CommonMethods.click(ip.addToBasketButton);

		CommonMethods.click(ip.itemMenuLink);

		String basketPageTitle = CommonMethods.getTitle(Driver.getDriver());

		CommonMethods.assertTrue(!itemPageTitle.equals(basketPageTitle));
	}

	@Test(enabled = false)
	public void arrivalsAddToBasketItemsCoupon() {

		CommonMethods.click(hp.shopTab);

		CommonMethods.click(sp.homeLink);

		CommonMethods.assertTrue(Integer.toString(hp.arrivals.size()).equals(Reader.getValue("verifyArrivals")));

		String homePageTitle = CommonMethods.getTitle(Driver.getDriver());

		CommonMethods.click(hp.arrivalsImage);

		String itemPageTitle = CommonMethods.getTitle(Driver.getDriver());

		CommonMethods.assertTrue(!homePageTitle.equals(itemPageTitle));

		CommonMethods.assertTrue(CommonMethods.isClickable(Driver.getDriver(), ip.addToBasketButton));

		CommonMethods.click(ip.addToBasketButton);

		CommonMethods.waitAndClick(Driver.getDriver(), ip.itemMenuLink);

		String basketPageTitle = CommonMethods.getTitle(Driver.getDriver());

		CommonMethods.assertTrue(!itemPageTitle.equals(basketPageTitle));

		CommonMethods.input(bp.couponCodeField, Reader.getValue("couponCode"));

		CommonMethods.click(bp.applyCouponButton);

		CommonMethods.assertTrue(
				CommonMethods.getText(bp.couponInformation).substring(1).equals(Reader.getValue("expectedDiscount")));
	}

	@Test(enabled = false)
	public void arrivalsAddToBasketItemsCouponValue450() {

		CommonMethods.click(hp.shopTab);

		CommonMethods.click(sp.homeLink);

		CommonMethods.assertTrue(Integer.toString(hp.arrivals.size()).equals(Reader.getValue("verifyArrivals")));

		String homePageTitle = CommonMethods.getTitle(Driver.getDriver());

		CommonMethods.click(hp.arrivalsImage2);

		String itemPageTitle = CommonMethods.getTitle(Driver.getDriver());

		CommonMethods.assertTrue(!homePageTitle.equals(itemPageTitle));

		CommonMethods.assertTrue(CommonMethods.isClickable(Driver.getDriver(), ip.addToBasketButton));

		CommonMethods.click(ip.addToBasketButton);

		CommonMethods.waitAndClick(Driver.getDriver(), ip.itemMenuLink);

		String basketPageTitle = CommonMethods.getTitle(Driver.getDriver());

		CommonMethods.assertTrue(!itemPageTitle.equals(basketPageTitle));

		CommonMethods.input(bp.couponCodeField, Reader.getValue("couponCode"));

		CommonMethods.click(bp.applyCouponButton);

		CommonMethods.assertTrue(
				CommonMethods.getText(bp.couponErrorMessage).equals(Reader.getValue("expectedCouponErrorMessage")));
	}

	@Test(enabled = false)
	public void arrivalsAddToBasketItemsRemoveBook() {

		CommonMethods.click(hp.shopTab);

		CommonMethods.click(sp.homeLink);

		CommonMethods.assertTrue(Integer.toString(hp.arrivals.size()).equals(Reader.getValue("verifyArrivals")));

		String homePageTitle = CommonMethods.getTitle(Driver.getDriver());

		CommonMethods.click(hp.arrivalsImage2);

		String itemPageTitle = CommonMethods.getTitle(Driver.getDriver());

		CommonMethods.assertTrue(!homePageTitle.equals(itemPageTitle));

		CommonMethods.assertTrue(CommonMethods.isClickable(Driver.getDriver(), ip.addToBasketButton));

		CommonMethods.click(ip.addToBasketButton);

		CommonMethods.waitAndClick(Driver.getDriver(), ip.itemMenuLink);

		CommonMethods.click(bp.removeButton);

		CommonMethods.assertTrue(
				CommonMethods.getText(bp.emptyBasketMessage).equals(Reader.getValue("expectedEmptyCartMessage")));
	}

	@Test(enabled = false)
	public void arrivalsAddToBasketItemsAddBook() {

		CommonMethods.click(hp.shopTab);

		CommonMethods.click(sp.homeLink);

		CommonMethods.assertTrue(Integer.toString(hp.arrivals.size()).equals(Reader.getValue("verifyArrivals")));

		String homePageTitle = CommonMethods.getTitle(Driver.getDriver());

		CommonMethods.click(hp.arrivalsImage2);

		String itemPageTitle = CommonMethods.getTitle(Driver.getDriver());

		CommonMethods.assertTrue(!homePageTitle.equals(itemPageTitle));

		CommonMethods.assertTrue(CommonMethods.isClickable(Driver.getDriver(), ip.addToBasketButton));

		CommonMethods.click(ip.addToBasketButton);

		CommonMethods.waitAndClick(Driver.getDriver(), ip.itemMenuLink);

		CommonMethods.click(bp.quantityTextbox);

		bp.quantityTextbox.sendKeys(Keys.ARROW_UP);

		CommonMethods.click(bp.updateBasketButton);

		CommonMethods.assertTrue((CommonMethods.extractDigitsFromString(
				CommonMethods.getText(Driver.getDriver().findElement(By.xpath("//*[text()='2 items']")))) + "")
						.equals(Reader.getValue("expectedQuantity")));
	}

	@Test(enabled = false)
	public void arrivalsAddToBasketItemsCheckOutBookFinalPrice() {

		CommonMethods.click(hp.shopTab);

		CommonMethods.click(sp.homeLink);

		CommonMethods.assertTrue(Integer.toString(hp.arrivals.size()).equals(Reader.getValue("verifyArrivals")));

		String homePageTitle = CommonMethods.getTitle(Driver.getDriver());

		CommonMethods.click(hp.arrivalsImage2);

		String itemPageTitle = CommonMethods.getTitle(Driver.getDriver());

		CommonMethods.assertTrue(!homePageTitle.equals(itemPageTitle));

		CommonMethods.assertTrue(CommonMethods.isClickable(Driver.getDriver(), ip.addToBasketButton));

		CommonMethods.click(ip.addToBasketButton);

		CommonMethods.waitAndClick(Driver.getDriver(), ip.itemMenuLink);

		CommonMethods.assertTrue(CommonMethods.getText(bp.checkoutTotal).equals(Reader.getValue("expectedTotal")));
	}

	@Test(enabled = false)
	public void arrivalsAddToBasketItemsCheckOutUpdateBasket() {

		CommonMethods.click(hp.shopTab);

		CommonMethods.click(sp.homeLink);

		CommonMethods.assertTrue(Integer.toString(hp.arrivals.size()).equals(Reader.getValue("verifyArrivals")));

		String homePageTitle = CommonMethods.getTitle(Driver.getDriver());

		CommonMethods.click(hp.arrivalsImage2);

		String itemPageTitle = CommonMethods.getTitle(Driver.getDriver());

		CommonMethods.assertTrue(!homePageTitle.equals(itemPageTitle));

		CommonMethods.assertTrue(CommonMethods.isClickable(Driver.getDriver(), ip.addToBasketButton));

		CommonMethods.click(ip.addToBasketButton);

		CommonMethods.waitAndClick(Driver.getDriver(), ip.itemMenuLink);

		CommonMethods.click(bp.quantityTextbox);

		bp.quantityTextbox.sendKeys(Keys.ARROW_UP);

		CommonMethods.click(bp.updateBasketButton);

		CommonMethods.assertTrue((CommonMethods.extractDigitsFromString(
				CommonMethods.getText(Driver.getDriver().findElement(By.xpath("//*[text()='2 items']")))) + "")
						.equals(Reader.getValue("expectedQuantity")));
	}

	@Test(enabled = false)
	public void arrivalsAddToBasketItemsCheckOutTotalAndSubototalCondition() {

		CommonMethods.click(hp.shopTab);

		CommonMethods.click(sp.homeLink);

		CommonMethods.assertTrue(Integer.toString(hp.arrivals.size()).equals(Reader.getValue("verifyArrivals")));

		String homePageTitle = CommonMethods.getTitle(Driver.getDriver());

		CommonMethods.click(hp.arrivalsImage2);

		String itemPageTitle = CommonMethods.getTitle(Driver.getDriver());

		CommonMethods.assertTrue(!homePageTitle.equals(itemPageTitle));

		CommonMethods.assertTrue(CommonMethods.isClickable(Driver.getDriver(), ip.addToBasketButton));

		CommonMethods.click(ip.addToBasketButton);

		CommonMethods.waitAndClick(Driver.getDriver(), ip.itemMenuLink);

		CommonMethods.assertTrue(
				CommonMethods.extractDigitsFromString(CommonMethods.getText(bp.checkoutSubtotal)) < CommonMethods
						.extractDigitsFromString(CommonMethods.getText(bp.checkoutTotal)));
	}

	@Test(enabled = false)
	public void arrivalsAddToBasketItemsCheckOutFunctionality() {

		CommonMethods.click(hp.shopTab);

		CommonMethods.click(sp.homeLink);

		CommonMethods.assertTrue(Integer.toString(hp.arrivals.size()).equals(Reader.getValue("verifyArrivals")));

		String homePageTitle = CommonMethods.getTitle(Driver.getDriver());

		CommonMethods.click(hp.arrivalsImage2);

		String itemPageTitle = CommonMethods.getTitle(Driver.getDriver());

		CommonMethods.assertTrue(!homePageTitle.equals(itemPageTitle));

		CommonMethods.assertTrue(CommonMethods.isClickable(Driver.getDriver(), ip.addToBasketButton));

		CommonMethods.click(ip.addToBasketButton);

		CommonMethods.waitAndClick(Driver.getDriver(), ip.itemMenuLink);

		CommonMethods.assertTrue(
				CommonMethods.extractDigitsFromString(CommonMethods.getText(bp.checkoutSubtotal)) < CommonMethods
						.extractDigitsFromString(CommonMethods.getText(bp.checkoutTotal)));

		CommonMethods.click(bp.proceedToCheckoutButton);

		CommonMethods.assertTrue(
				CommonMethods.getText(pp.billingDetailsTitle).equals(Reader.getValue("expectedPaymentPageTitle")));
	}

	@Test(enabled = false)
	public void arrivalsAddToBasketItemsCheckOutPaymentGateway() {

		CommonMethods.click(hp.shopTab);

		CommonMethods.click(sp.homeLink);

		CommonMethods.assertTrue(Integer.toString(hp.arrivals.size()).equals(Reader.getValue("verifyArrivals")));

		String homePageTitle = CommonMethods.getTitle(Driver.getDriver());

		CommonMethods.click(hp.arrivalsImage2);

		String itemPageTitle = CommonMethods.getTitle(Driver.getDriver());

		CommonMethods.assertTrue(!homePageTitle.equals(itemPageTitle));

		CommonMethods.assertTrue(CommonMethods.isClickable(Driver.getDriver(), ip.addToBasketButton));

		CommonMethods.click(ip.addToBasketButton);

		CommonMethods.waitAndClick(Driver.getDriver(), ip.itemMenuLink);

		CommonMethods.assertTrue(
				CommonMethods.extractDigitsFromString(CommonMethods.getText(bp.checkoutSubtotal)) < CommonMethods
						.extractDigitsFromString(CommonMethods.getText(bp.checkoutTotal)));

		CommonMethods.click(bp.proceedToCheckoutButton);

		CommonMethods.assertTrue(
				CommonMethods.getText(pp.billingDetailsTitle).equals(Reader.getValue("billingDetailsTitle")));
		CommonMethods.assertTrue(CommonMethods.getText(pp.yourOrderTitle).equals(Reader.getValue("yourOrderTitle")));
		CommonMethods.assertTrue(CommonMethods.getText(pp.additionalInformationTitle)
				.equals(Reader.getValue("additionalInformationTitle")));
		CommonMethods.assertTrue(
				CommonMethods.getText(pp.directBankTransferTitle).equals(Reader.getValue("directBankTransferTitle")));

		CommonMethods.input(pp.firstNameField, Reader.getValue("firstName"));
		CommonMethods.input(pp.lastNameField, Reader.getValue("lastName"));
		CommonMethods.input(pp.emailaddressField, Reader.getValue("email"));
		CommonMethods.input(pp.phoneField, Reader.getValue("phone"));
		CommonMethods.input(pp.addressField, Reader.getValue("address"));
		CommonMethods.input(pp.cityField, Reader.getValue("city"));

		CommonMethods.click(pp.stateDropdown);
		CommonMethods.input(pp.stateInputField, Reader.getValue("state"));
		pp.stateInputField.sendKeys(Keys.ENTER);

		CommonMethods.input(pp.zipField, Reader.getValue("zipcode"));
		
		CommonMethods.assertTrue(CommonMethods.getText(pp.haveACouponMessage).equals(Reader.getValue("enterCouponMessage")));
		
		CommonMethods.click(pp.directBankTransferRadioButton);
		CommonMethods.assertTrue(pp.directBankTransferRadioButton.isSelected());
		
		CommonMethods.click(pp.checkPaymentsRadioButton);
		CommonMethods.assertTrue(pp.checkPaymentsRadioButton.isSelected());
		
		CommonMethods.click(pp.cashOnDeliveryRadioButton);
		CommonMethods.assertTrue(pp.cashOnDeliveryRadioButton.isSelected());
		
		CommonMethods.click(pp.payPalRadioButton);
		CommonMethods.assertTrue(pp.payPalRadioButton.isSelected());
	}

	@Test(enabled = true)
	public void arrivalsAddToBasketItemsCheckOutPaymentGatewayPlaceOrder() {

		CommonMethods.click(hp.shopTab);

		CommonMethods.click(sp.homeLink);

		CommonMethods.assertTrue(Integer.toString(hp.arrivals.size()).equals(Reader.getValue("verifyArrivals")));

		String homePageTitle = CommonMethods.getTitle(Driver.getDriver());

		CommonMethods.click(hp.arrivalsImage2);

		String itemPageTitle = CommonMethods.getTitle(Driver.getDriver());

		CommonMethods.assertTrue(!homePageTitle.equals(itemPageTitle));

		CommonMethods.assertTrue(CommonMethods.isClickable(Driver.getDriver(), ip.addToBasketButton));

		CommonMethods.click(ip.addToBasketButton);

		CommonMethods.waitAndClick(Driver.getDriver(), ip.itemMenuLink);

		CommonMethods.assertTrue(
				CommonMethods.extractDigitsFromString(CommonMethods.getText(bp.checkoutSubtotal)) < CommonMethods
						.extractDigitsFromString(CommonMethods.getText(bp.checkoutTotal)));

		CommonMethods.click(bp.proceedToCheckoutButton);

		CommonMethods.assertTrue(
				CommonMethods.getText(pp.billingDetailsTitle).equals(Reader.getValue("billingDetailsTitle")));
		CommonMethods.assertTrue(CommonMethods.getText(pp.yourOrderTitle).equals(Reader.getValue("yourOrderTitle")));
		CommonMethods.assertTrue(CommonMethods.getText(pp.additionalInformationTitle)
				.equals(Reader.getValue("additionalInformationTitle")));
		CommonMethods.assertTrue(
				CommonMethods.getText(pp.directBankTransferTitle).equals(Reader.getValue("directBankTransferTitle")));

		CommonMethods.input(pp.firstNameField, Reader.getValue("firstName"));
		CommonMethods.input(pp.lastNameField, Reader.getValue("lastName"));
		CommonMethods.input(pp.emailaddressField, Reader.getValue("email"));
		CommonMethods.input(pp.phoneField, Reader.getValue("phone"));
		CommonMethods.input(pp.addressField, Reader.getValue("address"));
		CommonMethods.input(pp.cityField, Reader.getValue("city"));

		CommonMethods.click(pp.stateDropdown);
		CommonMethods.input(pp.stateInputField, Reader.getValue("state"));
		pp.stateInputField.sendKeys(Keys.ENTER);

		CommonMethods.input(pp.zipField, Reader.getValue("zipcode"));
		
		CommonMethods.assertTrue(CommonMethods.getText(pp.haveACouponMessage).equals(Reader.getValue("enterCouponMessage")));
		
		CommonMethods.click(pp.directBankTransferRadioButton);
		CommonMethods.assertTrue(pp.directBankTransferRadioButton.isSelected());
		
		CommonMethods.click(pp.checkPaymentsRadioButton);
		CommonMethods.assertTrue(pp.checkPaymentsRadioButton.isSelected());
		
		CommonMethods.click(pp.cashOnDeliveryRadioButton);
		CommonMethods.assertTrue(pp.cashOnDeliveryRadioButton.isSelected());
		
		CommonMethods.click(pp.payPalRadioButton);
		CommonMethods.assertTrue(pp.payPalRadioButton.isSelected());
		
		CommonMethods.click(pp.cashOnDeliveryRadioButton);
		CommonMethods.click(pp.placeOrderButton);
		
		CommonMethods.assertTrue(CommonMethods.getText(cp.orderConfirmationMessage).equals(Reader.getValue("orderConfirmationMessage")));	
	}

	@AfterMethod
	public void shutDown() {
		Driver.tearDown();
	}
}
