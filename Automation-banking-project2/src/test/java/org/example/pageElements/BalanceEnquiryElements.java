package org.example.pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BalanceEnquiryElements {
    private WebDriver driver;

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[8]/a")
    public WebElement clickonBalanceenquiry;

    @FindBy(xpath = "//input[@name='accountno']")
    public WebElement AccountNumber;

    @FindBy(xpath = "//input[@name='AccSubmit']")
    public WebElement Summit;

    public BalanceEnquiryElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
