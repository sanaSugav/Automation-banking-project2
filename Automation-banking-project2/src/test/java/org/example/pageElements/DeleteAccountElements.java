package org.example.pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteAccountElements {
    private WebDriver driver;

    @FindBy(xpath = "//input[@name='uid']")

    public WebElement userID;

    @FindBy(xpath = "//input[@name='password']")

    public WebElement password;

    @FindBy(name = "btnLogin")

    public WebElement LoginButton;

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[7]/a")
    public WebElement clickonDeleteAccount;

    @FindBy(xpath = "//input[@name='accountno']")
    public WebElement AccountNumber;

    @FindBy(name = "AccSubmit")
    public WebElement Submmitbutton;

    public DeleteAccountElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
