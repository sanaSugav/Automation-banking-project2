package org.example.pageAction;

import org.example.pageElements.DeleteElements;
import org.example.stepdefination.Commonsteps;
import org.openqa.selenium.WebDriver;

public class DeleteAction {
    private WebDriver driver;
    DeleteElements deleteElements;

    public DeleteAction(Commonsteps commonsteps) {
        this.driver = commonsteps.getDriver();
        this.deleteElements=new DeleteElements(driver);
    }
    public void clickonDelete(){
        deleteElements.clickondeletecustomer.click();
    }
    public void customerID(String customerID){
     deleteElements.custmorID.sendKeys(customerID);
    }

    public void submit(){
        deleteElements.Submitbutton.click();
    }
}
