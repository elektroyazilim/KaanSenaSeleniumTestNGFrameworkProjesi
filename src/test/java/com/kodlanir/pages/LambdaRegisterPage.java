package com.kodlanir.pages;

import com.kodlanir.utils.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.stream.Stream;

public class LambdaRegisterPage extends Base{
    @FindBy(xpath = "//ul[@class='mz-sub-menu-96 dropdown-menu show']//li[@class][2]//a[@class='icon-left both dropdown-item']//div[1]//span[@class='title']")
    private WebElement registerMenuBtn;

    @FindBy(id = "input-firstname")
    private WebElement firstName;

    @FindBy(id = "input-lastname")
    private WebElement lastName;

    @FindBy(id = "input-email")
    private WebElement email;

    @FindBy(id = "input-telephone")
    private WebElement phone;

    @FindBy(id = "input-password")
    private WebElement password;

    @FindBy(id = "input-confirm")
    private WebElement rePassword;

    @FindBy(css = "div.custom-checkbox")
    private WebElement policyCheckBox;

    @FindBy(xpath = "//label[@for='input-newsletter-yes']")
    private WebElement yesRadioBtn;

    @FindBy(css = "input[value='Continue']")
    private WebElement continueBtn;

    public void clickRegisterMenuBtn()
    {
        BrowserUtils.waitForVisibility(registerMenuBtn,5);
        registerMenuBtn.click();
    }

    public void setFirstName(String name){
        firstName.sendKeys(name);
    }

    public void setLastName(String surname){
        lastName.sendKeys(surname);
    }

    public void setEmail(String eMail){
        email.sendKeys(eMail);
    }

    public void setPhone(String phoneNumber){
        phone.sendKeys(phoneNumber);
    }

    public void setPassword(String psw){
        password.sendKeys(psw);
    }

    public void setRePassword(String rePsw){
        rePassword.sendKeys(rePsw);
    }

    public void setPolicyCheckBox(){
        policyCheckBox.click();
    }

    public void setYesRadioBtn(){
        yesRadioBtn.click();
    }

    public void setContinueBtn(){
        continueBtn.click();
    }
}
