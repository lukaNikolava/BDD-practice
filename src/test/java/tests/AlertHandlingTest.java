package tests;

import base.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertHandlingTest extends BaseTest {

    @Test
    public void alertsHandling(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement resultText = driver.findElement(By.id("result"));
        Assert.assertEquals(resultText.getText(), "You successfully clicked an alert", "JS Alert handling failed.");
    }
}
