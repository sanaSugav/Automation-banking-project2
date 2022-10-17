package org.example.pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class NewcustomerElements {


    private WebDriver driver;

    @FindBy(xpath = "//input[@name='uid']")
    public WebElement userID;
     @FindBy(xpath = "//input[@name='password']")
     public WebElement password;
     @FindBy(name = "btnLogin")
     public WebElement Loginbutton;
     @FindBy(xpath = "/html/body/div[3]/div/ul/li[2]/a")
     public WebElement Clickonnewcustomer;
    @FindBy(name = "name")
    public WebElement entername ;
   @FindBy(name = "rad1")
    public   WebElement Clickongender;
   @FindBy(id = "dob")
   public WebElement Dob;
    @FindBy(name = "addr")
   public WebElement address;
    @FindBy(name = "city")
    public WebElement city;
    @FindBy(name = "state")
   public WebElement state;
   @FindBy(name = "pinno")
   public WebElement pin;
  @FindBy(name = "telephoneno")
  public WebElement mobilenumber;
  @FindBy(xpath = "//input[@name='emailid']")
  public WebElement email;
    @FindBy(name ="sub")
   public WebElement sub;

    public NewcustomerElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }
}
