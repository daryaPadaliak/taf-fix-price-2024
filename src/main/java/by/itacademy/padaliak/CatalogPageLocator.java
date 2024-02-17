package by.itacademy.padaliak;

import org.openqa.selenium.By;

public class CatalogPageLocator {
    final static By PODARKI_LYUBIMYM_ITEM = By.xpath("//div[@class='accordion']/button/a[@href='/catalog/podarki-lyubimym']");
    final static By FIRST_ITEM_IN_CATALOG = By.xpath("//*[@id=\"cp5211221\"]/div[2]/div/div/div[1]/a[1]/img");
    final static String FIRST_ITEM_TEXT_TITLE_EXPECTED = "Фоторамка \"Люблю\", With Love, 24х18,5 см, в ассортименте";
    final static By FAVORITES_BTN = By.xpath("//button[@class='favorites favorites']");
    final static By FAVORITES = By.xpath("//*[@id=\"app-header\"]/header/div/div[2]/div[4]/a[1]/span");
    final static By FIRST_ITEM_IN_FAVORITES = By.xpath("//*[@id=\"gp5211221\"]/div[2]/div/div/div[1]/a[1]/img");
    final static By FIRST_ITEM_TEXT_TITLE_ACTUAL = By.xpath("//*[@id=\"__layout\"]/div/div/div[3]/div/div/div/div/div[2]/div[2]/h1");


}
