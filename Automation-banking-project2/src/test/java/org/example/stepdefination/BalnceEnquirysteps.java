package org.example.stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pageAction.BalanceEnquiryAction;
import org.openqa.selenium.WebDriver;

public class BalnceEnquirysteps {

    private WebDriver driver;
    BalanceEnquiryAction balanceEnquiryAction;

    public BalnceEnquirysteps(Commonsteps commonsteps,BalanceEnquiryAction balanceEnquiryAction) {
        this.driver = commonsteps.getDriver();
        this.balanceEnquiryAction=balanceEnquiryAction;
    }

    @Given("enter account no {string} And click on submit button")
    public void enter_account_no_and_click_on_submit_button(String AccountNumber) {
       balanceEnquiryAction.clickonBalanceEnquiry();
       balanceEnquiryAction.Accountnumber(AccountNumber);
       balanceEnquiryAction.submmit();
    }
    @Then("Balance enquiry successfully")
    public void balance_enquiry_successfully() {
        System.out.println("It should be succesfull");
    }

}

