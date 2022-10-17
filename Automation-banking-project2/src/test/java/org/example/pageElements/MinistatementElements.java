package org.example.pageElements;

import org.example.stepdefination.Commonsteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MinistatementElements {
    private WebDriver driver;

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[9]/a")
    public WebElement clickonMinistatement;

    @FindBy(xpath = "//input[@name='accountno']")
    public WebElement Accountnumber;

    @FindBy(xpath = "//input[@name='AccSubmit']")
    public WebElement submit;


    public MinistatementElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
