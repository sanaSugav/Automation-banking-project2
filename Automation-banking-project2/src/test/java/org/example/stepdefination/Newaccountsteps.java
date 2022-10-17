package org.example.stepdefination;

import io.cucumber.java.en.Given;
import org.example.pageAction.NewaccountAction;
import org.openqa.selenium.WebDriver;

public class Newaccountsteps {

  private WebDriver driver;
    NewaccountAction newaccountAction;

    public Newaccountsteps(Commonsteps commonsteps ,NewaccountAction newaccountAction) {
        this.driver = commonsteps.getDriver();
        this.newaccountAction=newaccountAction;
    }

    @Given("enter customerID {string} And add initial deposite {string} And click on submit button")
    public void enter_customer_id_and_add_initial_deposite_and_click_on_submit_button(String customerID, String initialdeposit) {
     newaccountAction.clickonNewaccount();
     newaccountAction.customerID(customerID);
     newaccountAction.initialdeposite(initialdeposit);
     newaccountAction.submmit();
     driver.switchTo().alert().accept();

    }

}
