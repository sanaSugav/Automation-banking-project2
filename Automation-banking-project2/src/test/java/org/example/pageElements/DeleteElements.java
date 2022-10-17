package org.example.pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteElements {
    private WebDriver driver;

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[4]/a")
    public WebElement clickondeletecustomer;

    @FindBy(name = "cusid")
    public WebElement custmorID;

    @FindBy(name = "AccSubmit")
    public WebElement Submitbutton;


    public DeleteElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
