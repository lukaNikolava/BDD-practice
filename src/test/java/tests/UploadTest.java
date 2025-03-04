package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class UploadTest extends BaseTest {

    @Test
    public void uploadFile() {
        driver.get("https://the-internet.herokuapp.com/upload");

        Path projectPath = Paths.get(System.getProperty("user.dir"));
        Path filePath = projectPath.resolve("file/approved.png");

        WebElement uploadInput = driver.findElement(By.id("file-upload"));
        uploadInput.sendKeys(filePath.toString());

        driver.findElement(By.id("file-submit")).click();

        WebElement uploadedFiles = driver.findElement(By.id("uploaded-files"));
        Assert.assertEquals(uploadedFiles.getText(), "approved.png", "File upload failed or uploaded file name does not match.");
    }
}