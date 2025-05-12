package pages;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class InformationPage extends Form {

	private final ILabel articleInfoLabel = getElementFactory().getLabel(By.id("firstHeading"), "Article Info Header");

	public InformationPage() {
		super(By.xpath("//div[@id='bodyContent']//h2[@id='Basic_information']"), "Page Information");
	}

	@Step("Check if article information is correctly displayed")
	public String getArticleInfoText() {
		return articleInfoLabel.getText();
	}
}
