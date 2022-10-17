package org.example.stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageAction.DeleteAction;
import org.openqa.selenium.WebDriver;

public class DeleteSteps {

  private WebDriver driver;

  DeleteAction deleteAction;

    public DeleteSteps(Commonsteps commonsteps ,DeleteAction deleteAction) {
        this.driver = commonsteps.getDriver();
        this.deleteAction=deleteAction;
    }

    @Given("enter customerID {string} And click on submit button")
    public void enter_customer_id_and_click_on_submit_button(String customerID) {
       deleteAction.clickonDelete();
       deleteAction.customerID(customerID);
       deleteAction.submit();
       driver.switchTo().alert().accept();
    }
    @Then("customer should be delete successfully")
    public void customer_should_be_delete_successfully() {
        System.out.println(" it shoud be submit");
    }

}
