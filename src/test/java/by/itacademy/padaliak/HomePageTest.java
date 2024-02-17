package by.itacademy.padaliak;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseTest{
    @Test
    public void testLogin () throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        Assertions.assertEquals("© Fix Price, 2024\n" +
                "Все права защищены", homePage.getCopyrightText());
    }
}
