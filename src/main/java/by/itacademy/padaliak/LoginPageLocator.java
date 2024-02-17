package by.itacademy.padaliak;

import org.openqa.selenium.By;

public class LoginPageLocator {
    final static By LOGIN_TITLE = By.className("form-title");
    final static By EMAIL_ITEM = By.xpath("//div[@class='multi-toggle']/button[@class='button toggle small']");
    final static By EMAIL_FIELD = By.xpath("//input[@type='email']");
    final static By PASSWORD_FIELD = By.xpath("//*[@id=\"modal\"]/div/div[1]/div[3]/div/input");
    final static By PERSONAL_DATA_CHECKBOX = By.xpath("//div[@class='checkbox-field']");
    final static By SUBMIT_BTN = By.xpath("//button[@class='button enter-button normal']");
    final static By TEXT = By.xpath("//div[@class='error']");

}
