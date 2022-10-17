package org.example.pageAction;

import org.example.pageElements.DeleteAccountElements;
import org.example.stepdefination.Commonsteps;
import org.openqa.selenium.WebDriver;

public class DeleteAccountAction {
    private WebDriver driver;
    DeleteAccountElements deleteAccountElements;

    public DeleteAccountAction(Commonsteps commonsteps) {
        this.driver = commonsteps.getDriver();
        this.deleteAccountElements=new DeleteAccountElements(driver);

    }
    public void userID(String userID){
        deleteAccountElements.userID.sendKeys(userID);
    }
    public void password(String password){
        deleteAccountElements.password.sendKeys(password);
    }
    public void ClickonLogin() {
        deleteAccountElements.LoginButton.click();
    }
    public void clinkonDeleteAccount(){
        deleteAccountElements.clickonDeleteAccount.click();

    }
    public void AccountNumber(String AccountNumber){
        deleteAccountElements.AccountNumber.sendKeys(AccountNumber);
    }
    public void Submit(){
        deleteAccountElements.Submmitbutton.click();
    }
}
