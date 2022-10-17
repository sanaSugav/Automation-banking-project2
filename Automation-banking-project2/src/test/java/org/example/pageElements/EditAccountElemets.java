package org.example.pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditAccountElemets {
    private WebDriver driver;


    @FindBy(xpath = "/html/body/div[3]/div/ul/li[6]/a")
    public WebElement clickonEditAccount;

    @FindBy(name = "accountno")
    public WebElement Accountnumber;

    @FindBy(name ="AccSubmit" )
    public WebElement Submmitbutton;


    public EditAccountElemets(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
