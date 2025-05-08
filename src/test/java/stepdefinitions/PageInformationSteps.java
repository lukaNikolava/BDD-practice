package stepdefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.PageInformationPage;

public class PageInformationSteps {

    PageInformationPage pageInformationPage = new PageInformationPage();

    @Then("The information page for {string} article is displayed")
    public void theInformationPageIsDisplayedSuccessfully(String searchedText){
        Assert.assertTrue(pageInformationPage.isCorrectArticleInfoDisplayed(searchedText), "Information page for " + searchedText + " is not displayed correctly.");
    }
}
