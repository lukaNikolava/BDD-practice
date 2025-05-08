package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.DownloadAsPdfPage;
import utils.DownloadUtils;

public class DownloadAsPdfPageSteps {

    DownloadAsPdfPage downloadAsPdfPage = new DownloadAsPdfPage();

    @And("I download the file from the Download as pdf page")
    public void iDownloadTheFileFromThePage(){
        downloadAsPdfPage.clickDownloadBtn();
    }

    @Then("the file with the correct name is downloaded successfully")
    public void theFileWithCorrectNameIsDownloaded(){
        String expectedFileName = downloadAsPdfPage.getFileName();
        Assert.assertTrue(DownloadUtils.isFileExist(expectedFileName), "File '" + expectedFileName + "' was not downloaded.");
    }
}
