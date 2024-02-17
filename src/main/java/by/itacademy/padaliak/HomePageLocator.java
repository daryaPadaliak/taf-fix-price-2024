package by.itacademy.padaliak;

import org.openqa.selenium.By;

public class HomePageLocator {
    final static By COPYRIGHT = By.xpath("//div[@class='logo-container']/p[@class='copyright copyright-desktop'][2]");
    final static By LOGIN_BTN = By.cssSelector("button.link");
    final static By LOCATION_MINSK_YES_BTN = By.xpath("//button[@class='button normal']");
    final static By CATALOG_ITEM = By.className("link-text");
    final static By ACCEPT_COOKIES = By.xpath("//div[@class='controls']/button[3]");
}
