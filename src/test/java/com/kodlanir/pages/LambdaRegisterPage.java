package com.kodlanir.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LambdaRegisterPage extends Base{
    @FindBy(xpath = "//ul[@class='mz-sub-menu-96 dropdown-menu show']//li[@class][2]//a[@class='icon-left both dropdown-item']//div[1]//span[@class='title']")
    public WebElement registerBtn;

    @FindBy(id = "input-firstname")
    public WebElement firstName;

    @FindBy(id = "input-lastname")
    public WebElement lastName;

    @FindBy(id = "input-email")
    public WebElement email;

    @FindBy(id = "input-telephone")
    public WebElement phone;

    @FindBy(id = "input-password")
    public WebElement password;

    @FindBy(id = "input-confirm")
    public WebElement rePassword;

    @FindBy(css = "div.custom-checkbox")
    public WebElement policyCheckBox;

    @FindBy(xpath = "//label[@for='input-newsletter-yes']")
    public WebElement yesRadioBtn;

    @FindBy(css = "input[value='Continue']")
    public WebElement continueBtn;

}
