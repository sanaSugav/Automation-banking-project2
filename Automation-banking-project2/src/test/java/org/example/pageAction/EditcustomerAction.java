package org.example.pageAction;

import org.example.pageElements.EditcustomerElements;
import org.example.stepdefination.Commonsteps;
import org.openqa.selenium.WebDriver;

public class EditcustomerAction {
    private WebDriver driver ;

    EditcustomerElements editcustomerElements;

    public EditcustomerAction(Commonsteps commonsteps) {
        this.driver = commonsteps.getDriver();
        this.editcustomerElements=new EditcustomerElements(driver);
    }

    public void clickonEditcustomer(){
        editcustomerElements.clickonEditcustomer.click();
    }
    public void customerID(String customerID){
        editcustomerElements.customerID.sendKeys(customerID);
    }

    public void submit(){
       editcustomerElements.submitbutton.click();
    }


}
