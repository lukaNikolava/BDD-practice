package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class ListOfElements extends BaseTest {

    private final Double EXPECTED_SUM = 251.0;
    private Double ACTUAL_SUM =  0.0;

    @Test
    public void dataTableTest(){
        driver.get("https://the-internet.herokuapp.com/tables");
        List<WebElement> tdElements = driver.findElements(By.xpath("//*[@id='table1']//td[4]"));
        for (WebElement td : tdElements) {
            String elementText = td.getText();
            Double elementValue = Double.parseDouble(elementText.replace("$", ""));
            ACTUAL_SUM += elementValue;
        }
        assert ACTUAL_SUM.equals(EXPECTED_SUM) : "Sum does not match the expected value.";
    }
}