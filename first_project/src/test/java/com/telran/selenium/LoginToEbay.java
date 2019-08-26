package com.telran.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginToEbay extends TestBase {

    @Test
    public void loginTest() throws InterruptedException {

        openSite("https://www.ebay.com");

//init login
        initLogin();
//fill login form
        fillLoginForm("user123@mail.com", "Aa123456");

        clickLogin();

        Thread.sleep(10000);


    }

}
