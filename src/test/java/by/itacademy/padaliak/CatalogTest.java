package by.itacademy.padaliak;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatalogTest extends BaseTest{
    @Test
    public void testFavoritesInCatalog () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        CatalogPage catalogPage = new CatalogPage(driver);
        homePage.clickOnMinskLocation();
        homePage.acceptCookies();
        homePage.clickOnCatalogItem();
        catalogPage.clickOnPodarkiLyubimym();
        catalogPage.clickOnFirstItemInCatalog();
        catalogPage.clickOnFavoritesItem();
        catalogPage.clickFavorites();
        catalogPage.clickFirstItemInFavorites();
        Assertions.assertEquals(CatalogPageLocator.FIRST_ITEM_TEXT_TITLE_EXPECTED, catalogPage.compareTextActual());

    }
}
