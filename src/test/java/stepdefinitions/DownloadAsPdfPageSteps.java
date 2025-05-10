package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.DownloadAsPdfPage;
import utils.FileUtils;

public class DownloadAsPdfPageSteps {

	private final DownloadAsPdfPage downloadAsPdfPage = new DownloadAsPdfPage();

	@When("I download the file from the Download as pdf page")
	public void iDownloadTheFileFromThePage() {
		downloadAsPdfPage.clickDownloadBtn();
	}

	@Then("the file with the correct name is downloaded successfully")
	public void theFileWithCorrectNameIsDownloaded() {
		String expectedFileName = downloadAsPdfPage.getFileName();
		Assert.assertTrue(FileUtils.isFileExist(expectedFileName), "File '" + expectedFileName + "' was not downloaded.");
	}
}
