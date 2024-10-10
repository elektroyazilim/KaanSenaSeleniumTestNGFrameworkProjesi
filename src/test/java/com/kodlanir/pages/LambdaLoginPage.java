package com.kodlanir.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LambdaLoginPage extends Base{
    @FindBy(xpath = "//ul[contains(@class, 'mz-sub-menu-96')]//li[1]//a//div")
    public WebElement loginBtn;

    @FindBy(id = "input-email")
    public WebElement eMail;

    @FindBy(id = "input-password")
    public WebElement passWord;

    @FindBy(css = "input[value='Login']")
    public WebElement submitButton;
}
