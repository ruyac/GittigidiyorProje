package org.example.Base;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;
import java.util.Random;

public class BasePage {

    private static Logger logger = LogManager.getLogger(BasePage.class);

    WebDriver driver = null;
    WebDriverWait wait = null;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 60);
    }

    public void assertionPage(String text) {
        Assert.assertEquals(text, driver.getTitle());
        logger.info("---Doğru Sayfada Olduğumuz Kontrol Edildi---");
    }

    public void assertionUrl(String text) {
        Assert.assertEquals(text, driver.getCurrentUrl());
        logger.info("---Doğru Linkte Olduğumuz Kontrol Edildi---");
    }

    public WebElement findElement(By by) {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return driver.findElement(by);
    }

    public List<WebElement> findElements(By by) {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return driver.findElements(by);
    }

    public void sendKeys(By by, String text) {
        findElement(by).sendKeys(text);
        logger.info("---Belirlenen alana "+ text + " Yazıldı.---");
    }


    public void click(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
        findElement(by).click();

    }

    public void hoverElement(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();
    }

    public void scrollToElement(By by) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", findElement(by));

    }

    public void randomItemClick(By by) {
        Random rand = new Random();
        findElements(by).get(rand.nextInt(findElements(by).size())).click();
    }

}
