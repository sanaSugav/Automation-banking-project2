package org.example.stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pageAction.EditAccountAction;
import org.example.pageAction.EditcustomerAction;
import org.openqa.selenium.WebDriver;

public class EditAccountsteps {
    private WebDriver driver;
    EditAccountAction editAccountAction;

    public EditAccountsteps(Commonsteps commonsteps ,EditAccountAction editAccountAction) {
        this.driver = commonsteps.getDriver();
        this.editAccountAction=editAccountAction;
    }

    @Given("Enter Accountnumber {string} and click on submitbutton")
    public void enter_accountnumber_and_click_on_submitbutton(String AccountNumber) {
       editAccountAction.clickonEditAccount();
       editAccountAction.AccountNumber(AccountNumber);
       editAccountAction.Submmit();
    }
    @Then("customer should be Edit Account successfully")
    public void customer_should_be_edit_account_successfully() {
        System.out.println("It Should successful edit Account");
    }

}
