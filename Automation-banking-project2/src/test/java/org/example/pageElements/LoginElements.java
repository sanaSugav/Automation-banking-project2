package org.example.pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginElements {
    private WebDriver driver;

    @FindBy(xpath = "//input[@name='uid']")

    public WebElement userID;

    @FindBy(xpath ="//input[@name='password']")

    public WebElement password;

    @FindBy(name = "btnLogin")

    public WebElement LoginButton;



    public LoginElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
