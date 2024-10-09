package com.kodlanir.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static com.kodlanir.pages.Annotations.driver;


public class LambdaRegisterPage extends Base {
    @FindBy(xpath = "//ul[contains(@class, 'mz-sub-menu-96')]//li[2]")
    WebElement myAccount;
    @FindBy(xpath = "//ul [contains(@class,'navbar-nav horizontal')]//li[6]//a[@class= 'icon-left both nav-link dropdown-toggle']")
    WebElement myAccountUp;
    @FindBy(id = "input-firstname")
    WebElement firstName;
    @FindBy(id = "input-lastname")
    WebElement lastname;
    @FindBy(id = "input-email")
    WebElement email;
    @FindBy(id = "input-telephone")
    WebElement phoneNumber;
    @FindBy(id = "input-password")
    WebElement password;
    @FindBy(id = "input-confirm")
    WebElement passwordConfirm;
    @FindBy(xpath = "//label[@for='input-newsletter-yes']")
    WebElement newslatter;
    @FindBy(css = "div.custom-control.custom-checkbox.custom-control-inline")
    WebElement agree;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement submit;


    public void clickMyAccount() {
        myAccount.click();
    }

    public void UpmyAccount() {
        Actions actions = new Actions(driver);
        actions.moveToElement(myAccountUp).perform();

    }

    public void firstNames(String name) {

        firstName.sendKeys(name);
    }

    public void lastnames(String nameLast) {


        lastname.sendKeys(nameLast);
    }

    public void emails(String emailName) {

        email.sendKeys(emailName);
    }

    public void Phone(String tNumber) {

        phoneNumber.sendKeys(tNumber);
    }

    public void pass(String Passwords) {

        password.sendKeys(Passwords);

    }

    public void PasswordConfirms(String Confirms) {


        passwordConfirm.sendKeys(Confirms);
    }

    public void letter() {

        newslatter.click();
    }

    public void agrees() {
        agree.click();
    }

    public void submits() {

        submit.click();
    }

}
