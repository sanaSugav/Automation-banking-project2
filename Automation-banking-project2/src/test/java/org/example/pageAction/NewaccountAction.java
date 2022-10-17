package org.example.pageAction;

import org.example.pageElements.NewaccountElements;
import org.example.stepdefination.Commonsteps;
import org.openqa.selenium.WebDriver;

public class NewaccountAction {
    private WebDriver driver;
    NewaccountElements newaccountElements;

    public NewaccountAction(Commonsteps commonsteps) {
        this.driver = commonsteps.getDriver();
        this.newaccountElements=new NewaccountElements(driver);
    }
    public void clickonNewaccount(){
        newaccountElements.ClikonnewAccount.click();
    }
    public void customerID(String customerID){
        newaccountElements.customerID.sendKeys(customerID);
    }
    public void initialdeposite(String initialdeposite){
        newaccountElements.initialdeposit.sendKeys(initialdeposite);
    }
    public void submmit(){
        newaccountElements.Submmitbutton.click();
    }
}
