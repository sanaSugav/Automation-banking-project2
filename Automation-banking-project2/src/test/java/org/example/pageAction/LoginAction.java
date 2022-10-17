package org.example.pageAction;

import org.example.pageElements.LoginElements;
import org.example.stepdefination.Commonsteps;
import org.openqa.selenium.WebDriver;

public class LoginAction {
  private   WebDriver driver;
    LoginElements loginElements;

    public LoginAction(Commonsteps commonsteps) {
        this.driver = commonsteps.getDriver();
        this.loginElements=new LoginElements(driver);
    }
    public void userID(String userID){
        loginElements.userID.sendKeys(userID);
    }
    public void password(String password){
        loginElements.password.sendKeys(password);
    }
    public void ClickonLogin(){
        loginElements.LoginButton.click();
    }
}
