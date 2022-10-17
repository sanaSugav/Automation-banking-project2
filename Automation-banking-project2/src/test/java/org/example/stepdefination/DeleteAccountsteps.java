package org.example.stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageAction.DeleteAccountAction;
import org.openqa.selenium.WebDriver;

public class DeleteAccountsteps {
    private WebDriver driver;
    DeleteAccountAction deleteAccountAction;

    public DeleteAccountsteps(Commonsteps commonsteps) {
        this.driver = commonsteps.getDriver();
        this.deleteAccountAction = deleteAccountAction;
    }
    @Given("Enter I Enter {string} , {string} And click on login page")
    public void enter_i_enter_and_click_on_login_page(String userID, String password) {
        deleteAccountAction.userID(userID);
        deleteAccountAction.password(password);
        deleteAccountAction.ClickonLogin();

   }


    @When("Enter accountnumber {string} And Click on Submitbutton")
    public void enter_accountnumber_and_click_on_submitbutton(String AccountNumber) {
        deleteAccountAction.clinkonDeleteAccount();
        deleteAccountAction.AccountNumber(AccountNumber);
        deleteAccountAction.Submit();

    }
    @Then("Account should be Delete successfully")
    public void account_should_be_delete_successfully() {
        System.out.println("Account should be deleted successfully");
    }

}
