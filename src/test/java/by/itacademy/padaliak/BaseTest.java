package by.itacademy.padaliak;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    ChromeDriver driver;

    @BeforeEach
    public void openBrowser () throws InterruptedException {
        driver = new ChromeDriver();
        String url = "https://fix-price.by/";
        driver.navigate().to(url);
        driver.manage().window().maximize();
        Thread.sleep(20000);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterEach
    public void closeBrowser() {
        driver.quit();
    }
}
