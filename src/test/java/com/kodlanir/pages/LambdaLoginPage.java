package com.kodlanir.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LambdaLoginPage extends Base{
    @FindBy(xpath = "//ul[contains(@class,'show')]//*[contains(text(),'Login')]")
    public WebElement loginBtn;

    @FindBy(id = "input-email")
    public WebElement eMail;

    @FindBy(id = "input-password")
    public WebElement passWord;

    @FindBy(css = "input[value='Login']")
    public WebElement submitButton;

    @FindBy(xpath = "//a[text()=' Wish List']")
    public WebElement loginControlBtn;

    public void seteMail(String email){
        eMail.sendKeys(email);
    }

    public void setPassWord(String psw){
        passWord.sendKeys(psw);
    }

    public void setSubmitButton(){
        submitButton.click();
    }
}
