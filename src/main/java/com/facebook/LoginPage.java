package com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By username = By.xpath("//*[@id='email']");
    By password = By.xpath("//*[@id='pass']");
    By loginButton = By.xpath("//*[@id='u_0_b']");

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void enterUsername()
    {
        driver.findElement(username).sendKeys("pushkarmorey555@gmail.com");
    }

    public void enterPassword()
    {
        driver.findElement(password).sendKeys("pushkarpm2430");
    }

    public void clickOnLoginButton()
    {
        driver.findElement(loginButton).click();
    }
}
