package org.example.pageAction;

import org.example.pageElements.NewcustomerElements;
import org.example.stepdefination.Commonsteps;
import org.openqa.selenium.WebDriver;

public class NewcustomerAction {
    private WebDriver driver;

    NewcustomerElements newcustomerElements;

    public NewcustomerAction(Commonsteps commonsteps) {
        this.driver = commonsteps.getDriver();
        this.newcustomerElements = new NewcustomerElements(driver);
    }

    public void userID(String userID) {
        newcustomerElements.userID.sendKeys(userID);
    }

    public void password(String password) {
        newcustomerElements.password.sendKeys(password);
    }

    public void ClickonLogin() {
        newcustomerElements.Loginbutton.click();
    }

    public void Clickonnewcustomer() {
        newcustomerElements.Clickonnewcustomer.click();
    }

    public void ename(String customer) {
        newcustomerElements.entername.sendKeys(customer);
    }

    public void Clickongender() {
        newcustomerElements.Clickongender.click();
    }

    public void Dob(String Dob) {
        newcustomerElements.Dob.sendKeys(Dob);
    }

    public void address(String address) {
        newcustomerElements.address.sendKeys(address);
    }

    public void city(String city) {
        newcustomerElements.city.sendKeys(city);
    }

    public void state(String state) {
        newcustomerElements.state.sendKeys(state);
    }

    public void pin(String pin) {
        newcustomerElements.pin.sendKeys(pin);
    }


    public void mobilenumber(String mobilenumber) {
        newcustomerElements.mobilenumber.sendKeys(mobilenumber);
    }

    public void email(String email) {
        newcustomerElements.email.sendKeys(email);
    }

    public void submit(){
        newcustomerElements.sub.click();
    }


}