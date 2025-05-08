package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.ArticlePage;

public class ArticlePageSteps {

    ArticlePage articlePage = new ArticlePage();

    @And("I click the Tools menu on the article page")
    public void iClickTheToolsMenuOnTheArticlePage(){
        articlePage.clickToolsDropdownBtn();
    }

    @And("I click the Download as PDF button")
    public void iClickTheDownloadAsPdfBtn(){
        articlePage.clickDownloadAsPdfBtn();
    }

    @And("click the Page information button on the tools dropdown")
    public void clickThePageInformationBtn(){
        articlePage.clickPageInformationBtn();
    }

    @Then("The article page for {string} is displayed")
    public void articlePageForSearchedTextIsDisplayed(String searchedText){
        String expectedResult =  articlePage.getSearchedText();
        Assert.assertEquals(expectedResult , searchedText , "Article page was not displayed correctly");
    }
}
