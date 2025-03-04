package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class DownloadTest extends BaseTest {

    private final String downloadFilePath = System.getProperty("user.dir") + File.separator + "downloads";
    private final String fileName = "Test.txt";

    @BeforeMethod
    @Override
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> chromePrefs = new HashMap<>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", downloadFilePath);
        options.setExperimentalOption("prefs", chromePrefs);

        // Initialize WebDriver with options
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @Test
    public void downloadTest() {
        driver.get("https://the-internet.herokuapp.com/download");
        driver.findElement(By.linkText(fileName)).click();

        // Wait for file to be downloaded (max 10 sec)
        File file = new File(downloadFilePath + File.separator + fileName);
        int waitTime = 0;
        while (!file.exists() && waitTime < 10) {
            try {
                Thread.sleep(1000); // Check every second
                waitTime++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        Assert.assertTrue(file.exists(), "File is not downloaded!");
    }

}
