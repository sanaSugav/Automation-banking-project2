package org.example.stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pageAction.MinistatememntAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Ministatementsteps {

      private WebDriver driver;
      MinistatememntAction ministatememntAction;


    public Ministatementsteps(Commonsteps commonsteps,MinistatememntAction ministatememntAction) {
        this.driver = commonsteps.getDriver();
        this.ministatememntAction=ministatememntAction;
    }

    @Given("Enter account no {string} and Click on Submit button")
    public void enter_account_no_and_click_on_submit_button(String Accountnumber) {
      ministatememntAction.Accountnumber(Accountnumber);
      ministatememntAction.Submmit();
    }
    @Then("The ministatment submit Successfully")
    public void the_ministatment_submit_successfully() {
        System.out.println("mini statement submit successfull");
    }


}
