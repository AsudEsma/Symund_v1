package com.symund.step_definitions;

import com.symund.pages.LoginPage;
import com.symund.pages.LogoutPage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.ConfigurationReader;
import com.symund.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogoutStepDefs {

    LoginPage loginPage = new LoginPage();
    LogoutPage logoutPage = new LogoutPage();

    @Given("the user logged in with valid credentials")
    public void the_user_logged_in_with_valid_credentials() {
        loginPage.login(ConfigurationReader.get("username"), ConfigurationReader.get("password"));
    }

    @And("the user clicks on the avatar icon")
    public void the_user_clicks_on_the_avatar_icon() {
        logoutPage.avatar.click();
        BrowserUtils.waitFor(3);
    }

    @When("the user clicks on logout button in the dropdown menu")
    public void the_user_clicks_on_logout_button_in_the_dropdown_menu() {
        logoutPage.logoutButton.click();
    }

    @Then("the user logged out and returns to the login page")
    public void the_user_logged_out_and_returns_to_the_login_page() {
        BrowserUtils.waitFor(3);
        Assert.assertFalse(Driver.get().getTitle().contains("Dashboard"));
    }

    @And ("the user clicks on the back button after logout")
    public void the_user_clicks_on_the_back_button_after_logout() {
        BrowserUtils.waitFor(3);
        Driver.get().navigate().back();
    }

    @Then("the user can not go to the home page after successfully logged out")
    public void the_user_can_not_go_to_the_home_page_after_successfully_logged_out() {
        BrowserUtils.waitFor(3);
        Assert.assertFalse(Driver.get().getTitle().contains("Dashboard"));
    }
}
