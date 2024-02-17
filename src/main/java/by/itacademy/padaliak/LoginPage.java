package by.itacademy.padaliak;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    ChromeDriver driver;
    public LoginPage(ChromeDriver driver) {
        this.driver = driver;
    }
    public String getText() {
        WebElement text = driver.findElement(LoginPageLocator.LOGIN_TITLE);
        return text.getText();
    }
    public void clickEmailItem() throws InterruptedException{
        WebElement emailItem = driver.findElement(LoginPageLocator.EMAIL_ITEM);
        emailItem.click();
        Thread.sleep(10000);
    }
    public void inputEmail(String str)throws InterruptedException{
        WebElement email = driver.findElement(LoginPageLocator.EMAIL_FIELD);
        email.sendKeys(str);
        Thread.sleep(10000);
    }

    public void inputPassword(String str) throws InterruptedException{
        WebElement password = driver.findElement(LoginPageLocator.PASSWORD_FIELD);
        password.sendKeys(str);
        Thread.sleep(10000);
    }

    public void clickCheckbox() {
        WebElement checkbox = driver.findElement(LoginPageLocator.PERSONAL_DATA_CHECKBOX);
        checkbox.click();
    }

    public void clickSubmitBtn() throws InterruptedException{
        WebElement submitBtn = driver.findElement(LoginPageLocator.SUBMIT_BTN);
        submitBtn.click();
        Thread.sleep(10000);
    }
    public String getErrorText() {
        WebElement text = driver.findElement(LoginPageLocator.TEXT);
        return text.getText();
    }

}
