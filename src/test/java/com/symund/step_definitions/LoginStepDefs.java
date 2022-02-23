package com.symund.step_definitions;

import com.symund.pages.LoginPage;
import com.symund.utilities.ConfigurationReader;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStepDefs {
    @Given("the user logged in with valid credentials")
    public void the_user_logged_in_with_valid_credentials() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(ConfigurationReader.get("username"), ConfigurationReader.get("password"));
    }

    @Then("the user lands on the homepage")
    public void the_user_lands_on_the_homepage() {
        Assert.assertEquals(ConfigurationReader.get("homepageUrl"),Driver.get().getCurrentUrl());
    }

    @Given("the user logged in with valid credentials by pressing on the Enter button on the keyboard")
    public void the_user_logged_in_with_valid_credentials_by_pressing_on_the_Enter_button_on_the_keyboard() {
        LoginPage loginPage = new LoginPage();
        loginPage.loginByEnter(ConfigurationReader.get("username"), ConfigurationReader.get("password"));
    }

    @Given("the user puts an invalid {string} and a valid password")
    public void the_user_puts_an_invalid_and_a_valid_password(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user gets the notice message wrong id or pw")
    public void the_user_gets_the_notice_message_wrong_id_or_pw() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("the user puts a valid username and an invalid {string}")
    public void the_user_puts_a_valid_username_and_an_invalid(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("the user puts a blank username and a valid password")
    public void the_user_puts_a_blank_username_and_a_valid_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user gets the notice message blank")
    public void the_user_gets_the_notice_message_blank() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("the user puts a valid username and a blank password")
    public void the_user_puts_a_valid_username_and_a_blank_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user sees the password in a form of dots by default")
    public void the_user_sees_the_password_in_a_form_of_dots_by_default() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("the user clicks on eye button")
    public void the_user_clicks_on_eye_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user sees the password explicitly")
    public void the_user_sees_the_password_explicitly() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("the user sees forgot password link")
    public void the_user_sees_forgot_password_link() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("the user clicks forgot password button")
    public void the_user_clicks_forgot_password_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user sees reset password button")
    public void the_user_sees_reset_password_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("the user can see valid username placeholder")
    public void the_user_can_see_valid_username_placeholder() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user can see valid password placeholder")
    public void the_user_can_see_valid_password_placeholder() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
