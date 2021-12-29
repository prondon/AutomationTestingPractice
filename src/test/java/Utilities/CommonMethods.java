package Utilities;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CommonMethods extends PageInitializer {

	public static void click(WebElement element) {
		element.click();
	}

	public static void assertTrue(boolean bool) {
		Assert.assertTrue(bool);
	}
	
	public static void assertFalse(boolean bool) {
		Assert.assertFalse(bool);
	}

	public static String getTitle(WebDriver driver) {
		return driver.getTitle();
	}

	public static WebDriverWait getWaitObj(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		return wait;
	}

	public static void waitAndClick(WebDriver driver, WebElement element) {
		getWaitObj(driver).until(ExpectedConditions.elementToBeClickable(element)).click();
	}
	
	public static boolean isClickable(WebDriver driver, WebElement element) {
		try {
			getWaitObj(driver).until(ExpectedConditions.elementToBeClickable(element));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static String getText(WebElement element) {
		return element.getText();
	}

	public static boolean textIsBlank(WebElement element) {
		try {
			return getText(element).isBlank();
		} catch (Exception e) {
			return false;
		}
	}
	
	public static int extractDigitsFromString(String str) {
		ArrayList<Character> digits = new ArrayList<>();
		for(int i=0; i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				digits.add(str.charAt(i));
			}
		}
		String nums="";
		for(int i=0; i<digits.size();i++) {
			nums+=digits.get(i);
		}
		int numbers = Integer.parseInt(nums);
		return numbers;
	}
	
	public static void input(WebElement element, String str) {
		element.clear();
		element.sendKeys(str);
	}
}
