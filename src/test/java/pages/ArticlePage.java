package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class ArticlePage extends Form {

	private final IButton toolsMenuBtn = getElementFactory().getButton(By.id("vector-page-tools-dropdown"), "Tools DropDown");
	private final IButton downloadAsPdfBtn = getElementFactory().getButton(By.id("coll-download-as-rl"), "Download As PDF Button");
	private final IButton pageInformationBtn = getElementFactory().getButton(By.xpath("//a[.//span[text()='Page information']]"), "Page Information Button");
	private final ILabel searchedText = getElementFactory().getLabel(By.id("firstHeading"), "Searched Text");

	public ArticlePage() {
		super(By.xpath("//div[@id='mw-content-text']//table[contains(@class, 'infobox') and contains(@class, 'biography')] "), "Article Page");
	}

	@Step("Click on Tools dropdown button")
	public void clickToolsDropdownBtn() {
		toolsMenuBtn.click();
	}

	@Step("Click on 'Download as PDF' button")
	public void clickDownloadAsPdfBtn() {
		downloadAsPdfBtn.click();
	}

	@Step("Click on 'Page Information' button")
	public void clickPageInformationBtn() {
		pageInformationBtn.click();
	}

	@Step("Get searched text from the article page")
	public String getSearchedText() {
		return searchedText.getText();
	}
}
