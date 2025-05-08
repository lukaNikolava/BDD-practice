package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class DownloadAsPdfPage extends Form {

    private final IButton downloadBtn = getElementFactory().getButton(By.xpath("//button[@type='submit']"), "Download Button");
    private final ITextBox fileName = getElementFactory().getTextBox(By.className("mw-electronpdfservice-selection-label-desc"), "File Name");

    public DownloadAsPdfPage() {
        super(By.xpath("//h1[@id='firstHeading' and normalize-space(text())='Download as PDF']"), "Download As Pdf Page");
    }

    @Step("Click on the 'Download' button")
    public void clickDownloadBtn() {
        downloadBtn.click();
    }

    @Step("Get the name of the PDF file")
    public String getFileName() {
        return fileName.getText();
    }
}
