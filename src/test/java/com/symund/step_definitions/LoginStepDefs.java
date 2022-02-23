package com.symund.step_definitions;

import com.symund.pages.LoginPage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.ConfigurationReader;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("the user logged in with valid credentials")
    public void the_user_logged_in_with_valid_credentials() {
        loginPage.loginValid();
    }

    @Then("the user lands on the homepage")
    public void the_user_lands_on_the_homepage() {
        Assert.assertEquals(ConfigurationReader.get("homepageUrl"), Driver.get().getCurrentUrl());
    }

    @Given("the user logged in with valid credentials by pressing on the Enter button on the keyboard")
    public void the_user_logged_in_with_valid_credentials_by_pressing_on_the_Enter_button_on_the_keyboard() {
        loginPage.loginByEnter();
    }

    @Given("the user puts an invalid {string} and a valid password")
    public void the_user_puts_an_invalid_and_a_valid_password(String invUsername) {
        loginPage.login(invUsername, ConfigurationReader.get("password"));
    }

    @Then("the user gets the notice message wrong id or pw")
    public void the_user_gets_the_notice_message_wrong_id_or_pw() {
        Assert.assertEquals(ConfigurationReader.get("noticeMessageWrong"), loginPage.getMsg());
    }

    @Given("the user puts a valid username and an invalid {string}")
    public void the_user_puts_a_valid_username_and_an_invalid(String invPassword) {
        loginPage.login(ConfigurationReader.get("username"), invPassword);
    }

    @Given("the user puts a blank username and a valid password")
    public void the_user_puts_a_blank_username_and_a_valid_password() {
        loginPage.login("", ConfigurationReader.get("password"));
    }

    @Then("the user gets the notice message blank")
    public void the_user_gets_the_notice_message_blank() {
        Assert.assertTrue(ConfigurationReader.get("noticeMessageEmpty").equals(loginPage.password.getAttribute("validationMessage"))
        || ConfigurationReader.get("noticeMessageEmpty").equals(loginPage.username.getAttribute("validationMessage")));
    }

    @Given("the user puts a valid username and a blank password")
    public void the_user_puts_a_valid_username_and_a_blank_password() {
        loginPage.login(ConfigurationReader.get("username"), "");
    }

    @Then("the user sees the password in a form of dots by default")
    public void the_user_sees_the_password_in_a_form_of_dots_by_default() {
        Assert.assertEquals("password", loginPage.password.getAttribute("type"));
    }

    @Given("the user enters valid credentials")
    public void theUserEntersValidCredentials() {
        BrowserUtils.waitForPageToLoad(20);
        loginPage.password.sendKeys(ConfigurationReader.get("password"));
    }

    @Given("the user clicks on eye button")
    public void the_user_clicks_on_eye_button() {
        loginPage.eyeBtn.click();
    }

    @Then("the user sees the password explicitly")
    public void the_user_sees_the_password_explicitly() {
        Assert.assertEquals("text", loginPage.password.getAttribute("type"));
    }

    @Given("the user sees forgot password link")
    public void the_user_sees_forgot_password_link() {
        Assert.assertTrue(loginPage.forgotPW.getText().contains("Forgot password"));
    }

    @Given("the user clicks forgot password button")
    public void the_user_clicks_forgot_password_button() {
        loginPage.forgotPW.click();
    }

    @Then("the user sees reset password button")
    public void the_user_sees_reset_password_button() {
        Assert.assertEquals("Reset password", loginPage.resetPW.getAttribute("value"));
    }

    @Given("the user can see valid username placeholder")
    public void the_user_can_see_valid_username_placeholder() {
        Assert.assertEquals(ConfigurationReader.get("usernamePlaceholder"), loginPage.username.getAttribute("placeholder"));
    }

    @Then("the user can see valid password placeholder")
    public void the_user_can_see_valid_password_placeholder() {
        Assert.assertEquals(ConfigurationReader.get("passwordPlaceholder"), loginPage.password.getAttribute("placeholder"));
    }

}
