package by.itacademy.padaliak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    ChromeDriver driver;

    public HomePage(ChromeDriver driver) {
        this.driver = driver;
    }

    public String getCopyrightText() throws InterruptedException{
        WebElement copyright = driver.findElement(HomePageLocator.COPYRIGHT);
        Thread.sleep(10000);
        return copyright.getText();
    }

    public void clickOnLoginBtn() {
        WebElement loginBtn = driver.findElement(HomePageLocator.LOGIN_BTN);
        loginBtn.click();
    }
    public void clickOnCatalogItem() throws InterruptedException{
        WebElement loginBtn = driver.findElement(HomePageLocator.CATALOG_ITEM);
        loginBtn.click();
        Thread.sleep(25000);
    }
    public void clickOnMinskLocation() {
        WebElement loginBtn = driver.findElement(HomePageLocator.LOCATION_MINSK_YES_BTN);
        loginBtn.click();
    }

    public void acceptCookies() {
        WebElement cookies = driver.findElement(HomePageLocator.ACCEPT_COOKIES);
        cookies.click();
    }
}
