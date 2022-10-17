package org.example.pageAction;

import org.example.pageElements.MinistatementElements;
import org.example.stepdefination.Commonsteps;
import org.openqa.selenium.WebDriver;

public class PageAction {
    private WebDriver driver;
    MinistatementElements ministatementElements;

    public PageAction(Commonsteps commonsteps) {
        this.driver = commonsteps.getDriver();
        this.ministatementElements.clickonMinistatement.click();


    }
}
