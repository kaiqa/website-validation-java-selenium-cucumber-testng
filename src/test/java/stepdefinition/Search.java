package stepdefinition;

import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import main.CucumberRunner;
import pages.SearchPage;

import java.util.List;

public class Search extends CucumberRunner{
	private SearchPage searchPage;

	public Search(){
		searchPage = new SearchPage(this.driver);
	}

	@Then("^I open the advanced search page$")
	public void i_open_the_advanced_search_page() throws Throwable {
		String advancedSearchUri = searchPage.advancedSearchUrl();
		driver.navigate().to(advancedSearchUri);
	}


	@Then("^I fill in the advanced search form name field with \"([^\"]*)\"$")
	public void i_fill_in_the_advanced_search_form_name_field_with(String name) throws Throwable {
		searchPage.advancedSearchPageFieldName.sendKeys(name);
	}

	@Then("^I fill in the advanced search form title field with \"([^\"]*)\"$")
	public void i_fill_in_the_advanced_search_form_title_field_with(String title) throws Throwable {
		searchPage.advancedSearchPageFieldTitle.sendKeys(title);
	}

	@Then("^I enable the advanced search form tick box only with images$")
	public void i_enable_the_advanced_search_form_tick_box_only_with_images() throws Throwable {
		searchPage.advancedSearchPageCheckBoxOnlyWithImages.click();
	}

	@Then("^I fill in the advanced search form field start year with \"([^\"]*)\"$")
	public void i_fill_in_the_advanced_search_form_field_start_year_with(String startyear) throws Throwable {
		searchPage.advancedSearchPageFieldStartYear.sendKeys(startyear);
	}

	@Then("^I fill in the advanced search form field end year with \"([^\"]*)\"$")
	public void i_fill_in_the_advanced_search_form_field_end_year_with(String endyear) throws Throwable {
		searchPage.advancedSearchPageFieldEndYear.sendKeys(endyear);
	}

	@Then("^I click on the advanced search form button find$")
	public void i_click_on_the_advanced_search_form_button_find() throws Throwable {
		searchPage.advancedSearchPageButtonFind.click();
	}

	@Then("^I see the advanced search results with \"([^\"]*)\" pictures$")
	public void i_see_the_advanced_search_results_with_pictures(String pictures) throws Throwable {
		int captions = driver.findElements(By.xpath("//div/figcaption/h2/a")).size();
		String amount = Integer.toString(captions);
		Assert.assertEquals(amount, pictures);
		List<WebElement> url = driver.findElements(By.xpath("//figure/img"));
		for(WebElement now : url)
		{ Assert.assertEquals(searchPage.getUrl(now.getAttribute("data-src")), "200"); }
	}
}
