package stepdefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.InformationPage;

public class InformationPageSteps {

	private final InformationPage informationPage = new InformationPage();

	@Then("The information page for {string} article is displayed")
	public void theInformationPageIsDisplayedSuccessfully(String searchedText) {
		Assert.assertTrue(informationPage.getArticleInfoText().contains(searchedText), "Information page for " + searchedText + " is not displayed correctly.");
	}
}
