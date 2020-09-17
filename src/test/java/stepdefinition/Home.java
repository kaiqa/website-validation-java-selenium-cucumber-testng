package stepdefinition;

import cucumber.api.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import main.CucumberRunner;
import pages.HomePage;

public class Home extends CucumberRunner{
	private HomePage homePage;

public Home(){
	homePage = new HomePage(this.driver);
}

	@Given("^I delete all cookies$")
	public void i_delete_all_cookies() throws Throwable {
		deleteAllCookies();
	}

	@Given("^I am on the home page$")
	public void I_am_on_the_home_page() throws Throwable{
    String title = homePage.getHomePageTitle();
    String	baseUrl = config.getProperty("siteUrl");
    driver.navigate().to(baseUrl);
	// Assert.assertEquals(title, "Rijksmuseum – The Museum of the Netherlands - in Amsterdam");
	}

	@Given("^I click on the cookie accept button$")
	public void I_click_on_the_cookie_accept_button() throws Throwable{
		homePage.homePageButtonCookieAccept.click();
	}
	@Given("^I click on the home page login button$")
	public void I_click_on_the_home_page_login_button() throws Throwable{
		homePage.homePageButtonLogin.click();
	}

	@Then("^I fill in the home page login form email field with \"([^\"]*)\"$")
	public void i_fill_in_the_home_page_login_form_email_field_with(String email) throws Throwable {
		homePage.homePageLoginFormFieldEmail.sendKeys(email);;
	}

	@Then("^I fill in the home page login form password field with \"([^\"]*)\"$")
	public void i_fill_in_the_home_page_login_form_password_field_with(String password) throws Throwable {
		homePage.homePageLoginFormFieldPassword.sendKeys(password);;
	}

	// register

	@Then("^I click on the sign up link$")
	public void i_click_on_the_sign_up_link() throws Throwable {
		homePage.homePageLoginFormSignUpLink.click();
	}

	@Then("^I click on the button create account with email$")
	public void i_click_on_the_button_create_account_with_email() throws Throwable {
		homePage.homePageLoginFormSButtonCreateAccount.click();
	}

	@Then("^I fill in the home page register form name field with \"([^\"]*)\"$")
	public void i_fill_in_the_home_page_register_form_name_field_with(String registerName) throws Throwable {
		homePage.homePageLoginFormFieldRegisterName.sendKeys(registerName);
	}

	@Then("^I fill in the home page register form email field with \"([^\"]*)\"$")
	public void i_fill_in_the_home_page_register_form_email_field_with(String registerEmail) throws Throwable {
		homePage.homePageLoginFormFieldRegisterEmail.sendKeys(registerEmail);
	}

	@Then("^I fill in the home page register form password field with \"([^\"]*)\"$")
	public void i_fill_in_the_home_page_register_form_password_field_with(String registerEmail) throws Throwable {
		homePage.homePageLoginFormFieldRegisterPassword.sendKeys(registerEmail);
	}

	@Then("^I fill in the home page register form password repeat field with \"([^\"]*)\"$")
	public void i_fill_in_the_home_page_register_form_password_repeat_field_with(String registerPasswordRepeat) throws Throwable {
		homePage.homePageLoginFormFieldRegisterPasswordRepeat.sendKeys(registerPasswordRepeat);
	}

	@Then("^I enable the home page register form agreement tick box$")
	public void i_enable_the_home_page_register_form_agreement_tick_box() throws Throwable {
		homePage.homePageLoginFormRegisterTickBox.click();
	}

	@Then("^I click on the home page register form button sign up$")
	public void i_click_on_the_home_page_register_form_button_sign_up() throws Throwable {
		homePage.homePageLoginFormButtonSignUp.click();
	}

	@Given("^I click on the home page login form button login$")
	public void I_click_on_the_home_page_login_form_button_login() throws Throwable{
		homePage.homePageLoginFormFieldButtonLogin.click();
	}

	@Given("^I click on the home page profile button$")
	public void I_click_on_the_home_page_profile_button_in_the_upper_right_corner() throws Throwable{
		homePage.homePageHeaderButtonProfile.click();
	}

	@Then("^I click on the search icon button$")
	public void i_click_on_the_search_icon_button() throws Throwable {
		homePage.homePageHeaderButtonSearch.click();
	}

	@Then("^I fill in the search field with \"([^\"]*)\"$")
	public void i_fill_in_the_search_field_with(String search) throws Throwable {
		homePage.homePageHeaderFieldSearch.sendKeys(search);
	}

	@Then("^I see the title \"([^\"]*)\"$")
	public void i_see_the_title(String title) throws Throwable {
		String pageTitle = homePage.getHomePageTitle();
		Assert.assertEquals(pageTitle, title);
	}
	@Then("^I navigate back$")
	public void i_navigate_back() throws Throwable {
		driver.navigate().back();
	}

	@Then("^I locate the picture the milkmaid$")
	public void i_locate_the_picture_the_milkmaid() throws Throwable {
		Actions actions = new Actions(driver);
		actions.moveToElement(homePage.searchPageResultMilkmaid).perform();
	}

	@Then("^I click on the picture the milkmaid heart icon button$")
	public void i_click_on_the_picture_the_milkmaid_heart_icon_button() throws Throwable {
		homePage.searchPageResultMilkmaid.click();
	}


	@Then("^I click on the modal dialog button my first collection$")
	public void i_click_on_the_modal_dialog_button_my_first_collection() throws Throwable {
		homePage.searchPageResultModalDialogButtonMyFirstCollection.click();
	}

	@Then("^I click on the collection item the milkmaid$")
	public void i_click_on_the_collection_item_button_the_milkmaid() throws Throwable {
		homePage.collectionPageMyFirstCollectionPictureText.click();
	}

	@Then("^I click on the button get started$")
	public void i_click_on_the_button_get_started() throws Throwable {
		homePage.collectionPageDialogButtonGetStarted.click();
	}

	@Then("^I click on the x of the dialog start the tour$")
	public void i_click_on_the_x_of_the_dialog_start_the_tour() throws Throwable {
		homePage.collectionPageDialogButtonStartTheTourCloseWithX.click();
	}

	@Then("^I click on the x of the dialog first time added hint$")
	public void i_click_on_the_x_of_the_dialog_first_time_added_hint() throws Throwable {
		homePage.collectionPageDialogButtonFirstTimeHintCloseWithX.click();
	}

	@Then("^I see the title and author of the milkmaid picture$")
	public void i_see_the_title_and_author_of_the_milkmaid_picture() throws Throwable {
		String itemMilkmaidTextTitle =	homePage.collectionPageListItemTitleMilkmaid.getText();
		String itemMilkmaidTextAuthor =	homePage.collectionPageListItemAuthorMilkmaid.getText();
		Assert.assertEquals( itemMilkmaidTextTitle, "The Milkmaid");
		Assert.assertEquals(itemMilkmaidTextAuthor, "Johannes Vermeer");
	}

}
