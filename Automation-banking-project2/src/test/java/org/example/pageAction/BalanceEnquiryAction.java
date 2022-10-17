package org.example.pageAction;

import org.example.pageElements.BalanceEnquiryElements;
import org.example.stepdefination.Commonsteps;
import org.openqa.selenium.WebDriver;

public class BalanceEnquiryAction {

    private WebDriver driver;
    BalanceEnquiryElements balanceEnquiryElements;

    public BalanceEnquiryAction(Commonsteps commonsteps) {
        this.driver = commonsteps.getDriver();
        this.balanceEnquiryElements=new BalanceEnquiryElements(driver);
    }
    public void clickonBalanceEnquiry(){
        balanceEnquiryElements.clickonBalanceenquiry.click();
    }
    public void Accountnumber(String Accountnumber){
        balanceEnquiryElements.AccountNumber.sendKeys(Accountnumber);
    }
    public void submmit(){
        balanceEnquiryElements.Summit.click();
    }
}
