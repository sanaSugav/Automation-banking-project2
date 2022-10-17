package org.example.pageAction;

import org.example.pageElements.LoginElements;
import org.example.pageElements.LogoutElements;
import org.example.pageElements.MinistatementElements;
import org.example.stepdefination.Commonsteps;
import org.openqa.selenium.WebDriver;

public class LogoutAction {
    private WebDriver driver;
   LogoutElements logoutElements;

    public LogoutAction(Commonsteps commonsteps) {
        this.driver = commonsteps.getDriver();
        this.logoutElements=new LogoutElements(driver);
          }
          public void Clickonlogout(){
            logoutElements.clickonlogoutbutton.click();
          }
}
