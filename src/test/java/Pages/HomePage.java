package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//*[@id='menu-item-40']/a")
	public WebElement shopTab;
	
	@FindBy(xpath="//*[@id='n2-ss-6']/div/div/div/div")
	public List<WebElement> sliders;
	
	@FindBy(xpath="//*[@class='products']")
	public List<WebElement> arrivals;
	
	@FindBy(xpath="//*[@title='Selenium Ruby']")
	public WebElement arrivalsImage;
	
	@FindBy(xpath="//*[@title='Thinking in HTML']")
	public WebElement arrivalsImage2;
	
	@FindBy(xpath="//*[@id='menu-item-50']/a")
	public WebElement myAccountTab;
}
