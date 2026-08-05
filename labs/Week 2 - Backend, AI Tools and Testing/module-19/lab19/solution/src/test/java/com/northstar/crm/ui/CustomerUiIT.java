package com.northstar.crm.ui;

import com.northstar.crm.ui.pages.CustomerFormPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CustomerUiIT {

    @LocalServerPort
    int port;

    WebDriver driver;

    @BeforeAll
    static void setupDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void openBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new", "--window-size=1280,900", "--disable-gpu");
        driver = new ChromeDriver(options);
    }

    @AfterEach
    void quit() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    void createCustomerViaUi() {
        String baseUrl = "http://localhost:" + port;
        CustomerFormPage page = new CustomerFormPage(driver).open(baseUrl);
        page.fill("CUS-2001", "Ui Customer", "ui.customer@example.com", "PROSPECT");
        page.submit();
        String result = page.resultText();
        assertTrue(result.contains("CUS-2001"), () -> "expected CUS-2001 in: " + result);
    }
}
