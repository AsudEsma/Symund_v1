package com.symund.pages;

import com.symund.utilities.BrowserUtils;
import com.symund.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    @FindBy(id = "user")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "submit-form")
    public WebElement submit;

    @FindBy(css = ".warning.wrongPasswordMsg")
    public WebElement noticeWrong;

    @FindBy (xpath = "//*[@type='password']")
    public WebElement dotsPW;

    @FindBy (xpath = "(//*[@type='text'])[2]")
    public WebElement visiblePW;

    @FindBy(css = ".toggle-password")
    public WebElement eyeBtn;

    @FindBy(id = "lost-password")
    public WebElement forgotPW;

    @FindBy(id = "reset-password-submit")
    public WebElement resetPW;

    public void loginValid () {
        BrowserUtils.waitForPageToLoad(20);
        username.sendKeys(ConfigurationReader.get("username"));
        password.sendKeys(ConfigurationReader.get("password"));
        submit.click();
        BrowserUtils.waitForPageToLoad(20);
    }

    public void login (String id, String pw) {
        BrowserUtils.waitForPageToLoad(20);
        username.sendKeys(id);
        password.sendKeys(pw);
        submit.click();
    }

    public void loginByEnter() {
        BrowserUtils.waitForPageToLoad(20);
        username.sendKeys(ConfigurationReader.get("username"));
        password.sendKeys(ConfigurationReader.get("password") + Keys.ENTER);
    }

    public String getMsg() {
        return noticeWrong.getText();
    }

}
