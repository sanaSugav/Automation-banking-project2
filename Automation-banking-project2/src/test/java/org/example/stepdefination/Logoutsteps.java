package org.example.stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pageAction.LogoutAction;
import org.openqa.selenium.WebDriver;

public class Logoutsteps {
    private WebDriver driver;
    LogoutAction logoutAction;

    public Logoutsteps(Commonsteps commonsteps ,LogoutAction logoutAction) {
        this.driver = commonsteps.getDriver();
        this.logoutAction=logoutAction;
    }

    @Given("click on logout button")
    public void click_on_logout_button() {
     logoutAction.Clickonlogout();
    }
    @Then("Log out successfully")
    public void log_out_successfully() {
        System.out.println("logout successfully");
    }
}
