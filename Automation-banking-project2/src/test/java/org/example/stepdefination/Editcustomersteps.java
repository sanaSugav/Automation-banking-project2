package org.example.stepdefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageAction.EditcustomerAction;
import org.openqa.selenium.WebDriver;

public class Editcustomersteps {

    private WebDriver driver;

    EditcustomerAction editcustomerAction;

    public Editcustomersteps(Commonsteps commonsteps ,EditcustomerAction editcustomerAction ) {
        this.driver = commonsteps.getDriver();
         this.editcustomerAction=editcustomerAction;
    }

    @When("Enter customerID {string} and click on submit button")
    public void enter_customer_id_and_click_on_submit_button(String customerID) throws InterruptedException {
     editcustomerAction.clickonEditcustomer();
     Thread.sleep(3000);
     editcustomerAction.customerID(customerID);
     Thread.sleep(3000);
     editcustomerAction.submit();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
    }
    @Then("Customer should be edit successfully")
    public void customer_should_be_edit_successfully() {
        System.out.println("It should be submit");
    }


}
