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
}
