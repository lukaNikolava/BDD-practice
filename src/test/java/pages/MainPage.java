package pages;

import aquality.selenium.core.elements.ElementState;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IComboBox;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import constants.Languages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class MainPage extends Form {

	private final ITextBox searchInput = getElementFactory().getTextBox(By.id("searchInput"), "Search Input");
	private final IButton submitBtn = getElementFactory().getButton(By.xpath("//button[@type='submit']"), "Submit Button");
	private final IComboBox languageDropdown = getElementFactory().getComboBox(By.id("searchLanguage"), "Language Drop Down", ElementState.EXISTS_IN_ANY_STATE);

	public MainPage() {
		super(By.className("central-featured-logo"), "Main Page");
	}

	@Step("Enter search text: {searchText}")
	public void enterSearchText(String searchText) {
		searchInput.clearAndType(searchText);
	}

	@Step("Click the submit button")
	public void clickSubmitBtn() {
		submitBtn.click();
	}

	@Step("Select language")
	public void selectLanguage(Languages language) {
		languageDropdown.selectByValue(language.getValue());
	}
}
