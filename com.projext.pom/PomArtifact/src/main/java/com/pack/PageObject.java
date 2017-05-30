package com.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by User on 5/30/2017.
 */
public class PageObject {
    private WebDriver driver;

    public class LoginPage (WebDriver){
    PageFactory.initElements(driver, page.this);
    this.driver = driver;

    }
    @FindBy(name = "username")
    private WebElement username;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(name = "button")
    private WebElement login;

    public LoginPage typeUsermame(String usern){
        username.sendKeys(usern);
        return this;
    }
    public LoginPage typePassword(String pasw){
        password.sendKeys(pasw);
        return this;
    }
    public LoginPage clickButton(){
        login.click();
        return AdminPage(driver);
    }
}
