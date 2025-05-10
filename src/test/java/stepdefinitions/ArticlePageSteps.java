package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ArticlePage;

public class ArticlePageSteps {

	private final ArticlePage articlePage = new ArticlePage();

	@When("I click the Tools menu on the article page")
	public void iClickTheToolsMenuOnTheArticlePage() {
		articlePage.clickToolsDropdownBtn();
	}

	@When("I click the Download as PDF button")
	public void iClickTheDownloadAsPdfBtn() {
		articlePage.clickDownloadAsPdfBtn();
	}

	@When("click the Page information button on the tools dropdown")
	public void clickThePageInformationBtn() {
		articlePage.clickPageInformationBtn();
	}

	@Then("The article page for {string} is displayed")
	public void articlePageForSearchedTextIsDisplayed(String searchedText) {
		String expectedResult = articlePage.getSearchedText();
		Assert.assertEquals(expectedResult, searchedText, "Article page was not displayed correctly");
	}
}
