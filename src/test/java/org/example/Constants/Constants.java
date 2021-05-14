package org.example.Constants;

import org.openqa.selenium.By;

import java.security.PublicKey;

public class Constants {

    public static String WEBLINK = "https://www.gittigidiyor.com/";
    public static String TITLE = "GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi";
    public static String USER = "denemeaa416@gmail.com";
    public static String PW = "XDENEME333xx";
    public static String PRODUCT = "bilgisayar";
    public static String SECOND_URL = "https://www.gittigidiyor.com/arama/?k=bilgisayar&sf=2";
    public static final By USER_MENU = By.cssSelector("[data-cy='header-user-menu']");
    public static final By LOGIN = By.cssSelector("[data-cy='header-login-button']");
    public static final By USER_NAME = By.id("L-UserNameField");
    public static final By PASSWORD = By.id("L-PasswordField");
    public static final By LOGIN_ENTER = By.id("gg-login-enter");
    public static final By SEARCH = By.cssSelector("[data-cy='header-search-input']");
    public static final By FIND = By.cssSelector("[data-cy='search-find-button']");
    public static final By NEXT = By.className("next-link");
    public static final By PRODUCT_LIST = By.className("product-hslider-container");
    public static final By INC_PRODUCT = By.xpath("//a[@aria-label='Adeti Artır']");
    public static final By ADDToBASKET = By.id("add-to-basket");
    public static final By GOToBASKET = By.xpath("//span[text()='Sepetim']");
    public static final By TOTAL_PRICE = By.xpath("//div[@class='total-price']");
    public static final By PRODUCT_PRICE = By.xpath("(//p)[14]");
    public static final By PRODUCT_COUNT = By.xpath("//div[@class='gg-d-16 detail-text']");
    public static final By DUST_BIN = By.className("gg-icon-bin-medium");
}
