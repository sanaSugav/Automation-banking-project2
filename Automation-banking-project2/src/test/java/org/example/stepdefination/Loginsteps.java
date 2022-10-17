package org.example.stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageAction.LoginAction;
import org.openqa.selenium.WebDriver;

public class Loginsteps {

     WebDriver driver;
    LoginAction loginAction;

    public Loginsteps(Commonsteps commonsteps , LoginAction loginAction) {
        this.driver =commonsteps.getDriver();
        this.loginAction= loginAction;
    }

    @Given("open application url in browser")
    public void open_application_url_in_browser() {
    driver.get("https://demo.guru99.com/v2/");
    }
    @When("Enter I Enter {string} , {string} and click on login page")
    public void enter_i_enter_and_click_on_login_page(String userID, String password) throws InterruptedException {
        loginAction.userID(userID);
        loginAction.password(password);
        loginAction.ClickonLogin();
        Thread.sleep(2000);

    }
    @Then("login should be successful")
    public void login_should_be_successful() {

    }

}
