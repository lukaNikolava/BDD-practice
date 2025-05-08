package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

public class BrowserSteps {

    MainPage mainPage = new MainPage();

    @Given("The main page is displayed")
    public void isMainPageDisplayed(){
        step("Checking if main page is displayed");
        Assert.assertTrue(mainPage.state().waitForDisplayed() , "Main page is not displayed");
    }

    @When("I input {string} in the search field")
    public void iInputTextInSearchField(String text){
        mainPage.enterSearchText(text);
    }

    @And("I click the submit button")
    public void iClickTheSubmitButton(){
        mainPage.clickSubmitBtn();
    }

    @When("I change the search language to {string}")
    public void iChangeSearchLanguage(String selectLanguage){
        mainPage.selectLanguage(selectLanguage);
    }
}
