package com.kodlanir.pages;

import com.kodlanir.utils.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LambdaLoginPage extends Base{
    @FindBy(xpath = "//ul[contains(@class,'show')]//*[contains(text(),'Login')]")
    private WebElement loginMenuBtn;

    @FindBy(id = "input-email")
    private WebElement eMail;

    @FindBy(id = "input-password")
    private WebElement passWord;

    @FindBy(css = "input[value='Login']")
    private WebElement submitButton;

    @FindBy(xpath = "//a[text()=' Wish List']")
    private WebElement loginControlBtn;

    public void clickLoginMenuBtn()
    {
        BrowserUtils.waitForVisibility(loginMenuBtn,5);
        loginMenuBtn.click();
    }

    public void seteMail(String email){
        eMail.sendKeys(email);
    }

    public void setPassWord(String psw){
        passWord.sendKeys(psw);
    }

    public void clickSubmitButton(){
        submitButton.click();
    }

    public String getLoginControlBtnText() {
        return loginControlBtn.getText();
    }
}
