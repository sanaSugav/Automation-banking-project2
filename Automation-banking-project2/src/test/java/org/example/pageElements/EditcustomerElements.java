package org.example.pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditcustomerElements {

   private WebDriver driver;

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[3]/a")
    public WebElement clickonEditcustomer;

    @FindBy(name = "cusid")
    public WebElement customerID;

    @FindBy(name = "AccSubmit")
    public WebElement submitbutton;

    public EditcustomerElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
