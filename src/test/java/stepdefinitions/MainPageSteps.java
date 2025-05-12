package stepdefinitions;

import constants.Languages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

public class MainPageSteps {

	private final MainPage mainPage = new MainPage();

	@Then("The main page is displayed")
	public void isMainPageDisplayed() {
		step("Checking if main page is displayed");
		Assert.assertTrue(mainPage.state().waitForDisplayed(), "Main page is not displayed");
	}

	@When("I input {string} in the search field")
	public void iInputTextInSearchField(String text) {
		mainPage.enterSearchText(text);
	}

	@When("I click the submit button")
	public void iClickTheSubmitButton() {
		mainPage.clickSubmitBtn();
	}

	@When("I change the search language to {string}")
	public void iChangeTheSearchLanguageTo(String languageName) {
		Languages language = Languages.valueOf(languageName.toUpperCase());
		mainPage.selectLanguage(language);
	}
}
