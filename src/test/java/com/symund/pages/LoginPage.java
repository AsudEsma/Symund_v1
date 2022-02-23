package com.symund.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "user")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "submit-form")
    public WebElement submit;

    public void login(String userName, String password) {
        this.userName.sendKeys(userName);
        this.password.sendKeys(password);
        submit.click();
    }

    public void loginByEnter(String userName, String password) {
        this.userName.sendKeys(userName);
        this.password.sendKeys(password);
        this.password.sendKeys(Keys.ENTER);
    }
}
