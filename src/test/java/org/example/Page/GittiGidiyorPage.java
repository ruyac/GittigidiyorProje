package org.example.Page;

import org.example.Base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.example.Constants.Constants.*;

public class GittiGidiyorPage extends BasePage {


    public GittiGidiyorPage(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = LogManager.getLogger(BasePage.class);

    public GittiGidiyorPage hoverToUserMenu() {
        logger.info("---User Menu'ye hover olunuyor.---");
        assertionPage(TITLE);
        hoverElement(USER_MENU);
        logger.info("---User Menu'ye hover olundu.---");
        return this;
    }
    public GittiGidiyorPage Login() {
        logger.info("---Üye girişi yapılıyor.---");
        click(LOGIN);
        sendKeys(USER_NAME,USER);
        sendKeys(PASSWORD,PW);
        click(LOGIN_ENTER);
        assertionPage(TITLE);
        logger.info("---Üye girişi yapıldı.---");
        return this ;
    }

    public GittiGidiyorPage Search(){
        logger.info(PRODUCT +"--- ürünü araması yapılıyor---");
        findElement(SEARCH);
        sendKeys(SEARCH,PRODUCT);
        click(FIND);
        logger.info(PRODUCT + " ürünü aratıldı.");
        return this ;

    }

    public GittiGidiyorPage nextPage(){
        logger.info("---İkinci sayfaya gidiliyor.---");
        scrollToElement(NEXT);
        click(NEXT);
        assertionUrl(SECOND_URL);
        logger.info("---İkinci sayfaya gidildi ve kontrol edildi.---");
        return this;
    }
    public GittiGidiyorPage randomClick(){
        randomItemClick(PRODUCT_LIST);
        logger.info("---Rastgele ürün seçildi.---");
        return this;
    }

    public GittiGidiyorPage FinalPart(){
        click(DUST_BIN);
        logger.info("---Sepetteki Ürün Silindi.---");
        return this;
    }

    public GittiGidiyorPage ürünAdetArttır(){
        logger.info("---Ürün adeti arttırılıyor.---");
        scrollToElement(INC_PRODUCT);
        click(INC_PRODUCT);
        logger.info("---Ürün adedi arttırıldı.---");
        return this;
    }

    public GittiGidiyorPage sepeteEkle(){
        logger.info("---Ürün sepete ekleniyor, sepete gidiliyor ve ürün adedi kontrol ediliyor.---");
        click(ADDToBASKET);
        click(GOToBASKET);
        Assert.assertEquals(findElement(TOTAL_PRICE).getText(), findElement(PRODUCT_PRICE).getText()); //fiyat kontrolü
        Assert.assertEquals(findElement(PRODUCT_COUNT).getText(), "Ürün Toplamı (2 Adet)");
        logger.info("---Ürün sepete eklendi, sepete gidildi ve adet kontrol edildi.---");
        return this;
    }




}

