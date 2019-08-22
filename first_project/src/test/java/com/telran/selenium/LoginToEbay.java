package com.telran.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginToEbay extends TestBase {

    @Test
    public void loginTest() throws InterruptedException {
        driver.get("https://www.ebay.com");

        click(By.id("gh-ug"));

        click(By.id("userid"));
        driver.findElement(By.id("userid")).clear();
        driver.findElement(By.id("userid")).sendKeys("user123@mail.com");

        click(By.id("pass"));
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys("Aa123456");

        click(By.id("sgnBt"));

        Thread.sleep(10000);


    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }
}
