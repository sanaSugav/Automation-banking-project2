package org.example.pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewaccountElements {
    private WebDriver driver;


    @FindBy(xpath = "/html/body/div[3]/div/ul/li[5]/a")
    public WebElement ClikonnewAccount;
    @FindBy(name = "cusid")
    public WebElement customerID;
    @FindBy(xpath = "input[@name='inideposit']")
    public WebElement initialdeposit;
    @FindBy(name = "button2")
     public WebElement Submmitbutton;

    public NewaccountElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

}
