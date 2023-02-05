package org.random.tests;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class RandomTests {

    static WebDriver driver;
    static WebDriverWait wait;

    @BeforeEach
    void setUp() {

        System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/chromedriver_mac64/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }

    @Test
    void randomNumber() {

        System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/chromedriver_mac64/chromedriver");


        driver.get("https://www.random.org/");
        wait.until(
                ExpectedConditions.frameToBeAvailableAndSwitchToIt(
                        By.cssSelector("#homepage-generator iframe")));

        driver.findElement(By.cssSelector("[value=\"Generate\"]")).click();

    }

    @AfterAll
    static void tearDown() {
        driver.quit();

    }
}
