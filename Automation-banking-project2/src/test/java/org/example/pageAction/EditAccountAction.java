package org.example.pageAction;

import org.example.pageElements.EditAccountElemets;
import org.example.stepdefination.Commonsteps;
import org.openqa.selenium.WebDriver;

public class EditAccountAction {

    private WebDriver driver;
    EditAccountElemets editAccountElemets;

    public EditAccountAction(Commonsteps commonsteps) {
        this.driver = commonsteps.getDriver();
        this.editAccountElemets=new EditAccountElemets(driver);
    }
    public void clickonEditAccount(){
        editAccountElemets.clickonEditAccount.click();
    }
    public void AccountNumber(String AccountNumber){
        editAccountElemets.Accountnumber.sendKeys(AccountNumber);
    }
    public void Submmit(){
        editAccountElemets.Submmitbutton.click();
    }
}
