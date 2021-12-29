package StepDefinitions;

import Utilities.CommonMethods;
import Utilities.Driver;
import Utilities.Reader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class myAccountStepDef extends CommonMethods {

	@Given("User opens the browser")
	public void user_opens_the_browser() {
		Driver.getDriver();
	}

	@When("User navigates to “http:\\/\\/practice.automationtesting.in\\/”")
	public void user_navigates_to_http_practice_automationtesting_in() {
		driver.get(Reader.getValue("url"));
	}

	@When("clicks on the My Account menu tab")
	public void clicks_on_the_my_account_menu_tab() {
		CommonMethods.click(hp.myAccountTab);
	}

	@Given("User enters registered username in username textbox")
	public void user_enters_registered_username_in_username_textbox() {
		CommonMethods.input(lp.usernameInputField, Reader.getValue("username"));
	}

	@Given("enters password in password textbox")
	public void enters_password_in_password_textbox() {
		CommonMethods.input(lp.passwordInputField, Reader.getValue("password"));
	}

	@Given("clicks on login button")
	public void clicks_on_login_button() {
		CommonMethods.click(lp.loginButton);
	}

	@Then("User must successfully login to the web page")
	public void user_must_successfully_login_to_the_web_page() {
		CommonMethods.assertTrue(CommonMethods.getText(dp.welcomeMessage).contains(Reader.getValue("username")));
	}

	@Given("User enters incorrect username {string} in username textbox")
	public void user_enters_incorrect_username_in_username_textbox(String string) {
		CommonMethods.input(lp.usernameInputField, string);
	}

	@Given("enters incorrect password {string} in password textbox.")
	public void enters_incorrect_password_in_password_textbox(String string) {
		CommonMethods.input(lp.passwordInputField, string);
	}

	@Then("proper error {string} must be displayed \\(ie Invalid username) and prompt to enter login again")
	public void proper_error_must_be_displayed_ie_invalid_username_and_prompt_to_enter_login_again(String string) {
		CommonMethods.assertTrue(CommonMethods.getText(lp.errorMessage).contains(string));
	}

	@Given("enters empty password {string} in the password textbox")
	public void enters_empty_password_in_the_password_textbox(String string) {
		CommonMethods.input(lp.passwordInputField, string);
	}

	@Then("proper error {string} must be displayed \\(ie Invalid password) and prompt to enter login again")
	public void proper_error_must_be_displayed_ie_invalid_password_and_prompt_to_enter_login_again(String string) {
		CommonMethods.assertTrue(CommonMethods.getText(lp.errorMessage).contains(string));
	}

	@Given("User enters empty username {string} in username textbox")
	public void user_enters_empty_username_in_username_textbox(String string) {
		CommonMethods.input(lp.usernameInputField, string);
	}

	@Then("proper error {string} must be displayed \\(ie required username) and prompt to enter login again")
	public void proper_error_must_be_displayed_ie_required_username_and_prompt_to_enter_login_again(String string) {
		CommonMethods.assertTrue(CommonMethods.getText(lp.errorMessage).contains(string));
	}

	@Given("User enters the case changed username in username textbox")
	public void user_enters_the_case_changed_username_in_username_textbox() {
		CommonMethods.input(lp.usernameInputField, Reader.getValue("username").toUpperCase());
	}

	@Given("enters the case changed password in the password textbox")
	public void enters_the_case_changed_password_in_the_password_textbox() {
		CommonMethods.input(lp.passwordInputField, Reader.getValue("password").toUpperCase());
	}

	@Then("login must fail saying incorrect username\\/password {string}.")
	public void login_must_fail_saying_incorrect_username_password(String string) {
		CommonMethods.assertTrue(CommonMethods.getText(lp.errorMessage).contains(string));
	}

	@Given("cnce your are logged in, sign out of the site")
	public void cnce_your_are_logged_in_sign_out_of_the_site() {
		CommonMethods.click(dp.logoutButton);
	}

	@Given("press back button")
	public void press_back_button() {
		driver.navigate().back();
	}

	@Then("User shouldn’t be signed in to his account rather a general webpage must be visible {string}")
	public void user_shouldn_t_be_signed_in_to_his_account_rather_a_general_webpage_must_be_visible(String string) {
		CommonMethods.assertTrue(CommonMethods.getText(lp.loginMessage).contains(string));
	}
}
