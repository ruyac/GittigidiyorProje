package org.example.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Base.BaseTest;
import org.example.Page.GittiGidiyorPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GittiGidiyorPageTest extends BaseTest {
    GittiGidiyorPage GittiGidiyorPage;
    private static Logger logger = LogManager.getLogger(GittiGidiyorPageTest.class);

    @Before
    public void before() {
        logger.info("---Driver ayağa kaldırılıyor---");
        GittiGidiyorPage = new GittiGidiyorPage(getWebDriver());
        logger.info("---Driver ayağa kaldırıldı---");
    }

    @Test
    public void testLogin() throws InterruptedException {
        logger.info("---Gitti Gidiyor Testi Başlıyor---");
        GittiGidiyorPage.hoverToUserMenu().Login().Search().nextPage().randomClick().ürünAdetArttır().sepeteEkle().FinalPart();
        logger.info("---Test Başarıyla Bitti---");
    }

    @After
    public void after() throws InterruptedException {
        logger.info("---Driver Kapatılıyor---");
        tearDown();
    }
}