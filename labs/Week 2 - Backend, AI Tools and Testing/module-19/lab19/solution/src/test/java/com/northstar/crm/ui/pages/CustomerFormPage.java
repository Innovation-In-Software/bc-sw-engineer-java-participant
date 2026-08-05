package com.northstar.crm.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

/** Page Object — locate via data-testid only. */
public class CustomerFormPage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    public CustomerFormPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public CustomerFormPage open(String baseUrl) {
        driver.get(baseUrl + "/customers.html");
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("[data-testid='customer-id']")));
        return this;
    }

    public void fill(String id, String name, String email, String status) {
        type("[data-testid='customer-id']", id);
        type("[data-testid='full-name']", name);
        type("[data-testid='email']", email);
        type("[data-testid='status']", status);
    }

    public void submit() {
        driver.findElement(By.cssSelector("[data-testid='submit-customer']")).click();
    }

    public String resultText() {
        WebElement result = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("[data-testid='create-result']")));
        wait.until(d -> {
            String text = d.findElement(By.cssSelector("[data-testid='create-result']")).getText();
            return text != null && !text.isBlank();
        });
        return result.getText();
    }

    private void type(String css, String value) {
        WebElement el = driver.findElement(By.cssSelector(css));
        el.clear();
        el.sendKeys(value);
    }
}
