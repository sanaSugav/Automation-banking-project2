package org.example.stepdefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageAction.NewcustomerAction;
import org.openqa.selenium.WebDriver;

public class Newcustomersteps {

   private WebDriver driver;

    NewcustomerAction newcustomerAction;

    public Newcustomersteps(Commonsteps commonsteps, NewcustomerAction newcustomerAction) {
        this.driver = commonsteps.getDriver();
        this.newcustomerAction = newcustomerAction;
    }
    @When("Enter I Enter {string} , {string} and click on login")
    public void enter_i_enter_and_click_on_login(String userID, String password) {
        newcustomerAction.userID(userID);
        newcustomerAction.password(password);
        newcustomerAction.ClickonLogin();
    }

    @When("enter {string} and click on gender")
    public void enter_and_click_on_gender(String customername) {
        newcustomerAction.Clickonnewcustomer();
         newcustomerAction.ename(customername);
           newcustomerAction.Clickongender();
         }

         @When("Enter {string} and address {string} and city {string}")
         public void enter_and_address_and_city(String dateofbirth, String address, String city){
         newcustomerAction.Dob(dateofbirth);
          newcustomerAction.address(address);
          newcustomerAction.city(city);
          }

        @When("Enter state {string} and pin {string} and telephone {string}")
        public void enter_state_and_pin_and_telephone(String state , String pin , String mobilenumber ){
         newcustomerAction.state(state);
         newcustomerAction.pin(pin);
         newcustomerAction.mobilenumber(mobilenumber);
        }

          @When("Enter emil {string} and click on submit")
           public void enter_emil_and_click_on_submit (String email){
             newcustomerAction.email(email);
             newcustomerAction.submit();

             driver.switchTo().alert().accept();
          }

         @Then("Submit should be succesful")
         public void submit_should_be_succesful () {
             System.out.println("it should be submit");
         }

    }
