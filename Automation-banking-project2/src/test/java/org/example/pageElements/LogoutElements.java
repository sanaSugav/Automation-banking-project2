package org.example.pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutElements {
    private WebDriver driver;
    @FindBy(xpath = "/html/body/div[3]/div/ul/li[11]/a")
    public WebElement clickonlogoutbutton;


    public LogoutElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
