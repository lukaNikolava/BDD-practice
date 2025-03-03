package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.UUID;

public class DynamicControlsTest extends BaseTest {

    @Test
    public void dynamicControls() {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        WebElement button = driver.findElement(By.xpath("//button[text()='Enable']"));
        button.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement input = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));

        String randomText = generateRandomText();

        input.sendKeys(randomText);

        String typedText = input.getAttribute("value");
        Assert.assertEquals(typedText, randomText, "The typed text does not match the random text.");

        System.out.println("Random text sent: " + randomText);
        System.out.println("Typed text: " + typedText);
    }

    private String generateRandomText() {
        return UUID.randomUUID().toString();
    }
}