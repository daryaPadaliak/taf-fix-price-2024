package by.itacademy.padaliak;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CatalogPage {
    ChromeDriver driver;

    public CatalogPage(ChromeDriver driver) {
        this.driver = driver;
    }

    public void clickOnPodarkiLyubimym() throws InterruptedException{
        WebElement podarki = driver.findElement(CatalogPageLocator.PODARKI_LYUBIMYM_ITEM);
        podarki.click();
        Thread.sleep(10000);
    }
    public void clickOnFirstItemInCatalog() throws InterruptedException{
        WebElement firstItem = driver.findElement(CatalogPageLocator.FIRST_ITEM_IN_CATALOG);
        firstItem.click();
        Thread.sleep(10000);
    }

    public void clickOnFavoritesItem() throws InterruptedException{
        WebElement favorites = driver.findElement(CatalogPageLocator.FAVORITES_BTN);
        favorites.click();
        Thread.sleep(10000);
    }

    public void clickFavorites() throws InterruptedException {
        WebElement favoritesItem = driver.findElement(CatalogPageLocator.FAVORITES);
        favoritesItem.click();
        Thread.sleep(20000);
    }

    public void clickFirstItemInFavorites() throws InterruptedException{
        WebElement firstItem = driver.findElement(CatalogPageLocator.FIRST_ITEM_IN_FAVORITES);
        firstItem.click();
        Thread.sleep(10000);
    }

    public String compareTextActual(){
        WebElement text = driver.findElement(CatalogPageLocator.FIRST_ITEM_TEXT_TITLE_ACTUAL);
        return text.getText();
    }

}
