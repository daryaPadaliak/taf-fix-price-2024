package by.itacademy.padaliak;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginPageTest extends BaseTest{
    @BeforeEach
    public void openLoginPage() {
        HomePage homePage = new HomePage(driver);
        homePage.clickOnLoginBtn();
    }

    @Test
    public void getAuthTitle(){
        LoginPage loginPage = new LoginPage(driver);
        Assertions.assertEquals("Вход", loginPage.getText());
    }

    @Test
    public void loginWithNegativeData () throws InterruptedException{
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickEmailItem();
        loginPage.inputEmail("teyut9888874566@gmail.ru");
        loginPage.inputPassword("Password1@");
        loginPage.clickCheckbox();
        loginPage.clickSubmitBtn();
        Assertions.assertEquals("Неверный логин или пароль. Проверьте введённые данные и попробуйте снова. Осталось попыток: 4", loginPage.getErrorText());
    }
}
