package stepdefinitions;

import constants.Languages;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

public class MainPageSteps {

	private final MainPage mainPage = new MainPage();

	@When("I open the main page")
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

	@When("I change the search language")
	public void iChangeSearchLanguage() {
		mainPage.selectLanguage(Languages.SPANISH);
	}
}
