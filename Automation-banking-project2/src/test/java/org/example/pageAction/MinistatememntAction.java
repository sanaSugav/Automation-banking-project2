package org.example.pageAction;

import org.example.pageElements.MinistatementElements;
import org.example.stepdefination.Commonsteps;
import org.openqa.selenium.WebDriver;

public class MinistatememntAction {
    private WebDriver driver;
    MinistatementElements ministatementElements;

    public MinistatememntAction(Commonsteps commonsteps) {
        this.driver = commonsteps.getDriver();
        this.ministatementElements=new MinistatementElements(driver);
    }
    public void clickonministatement(String ministatement){
        ministatementElements.clickonMinistatement.click();
    }
    public void Accountnumber(String Accountnumber){
        ministatementElements.Accountnumber.sendKeys(Accountnumber);
    }
    public void Submmit(){
        ministatementElements.submit.click();
    }
}
