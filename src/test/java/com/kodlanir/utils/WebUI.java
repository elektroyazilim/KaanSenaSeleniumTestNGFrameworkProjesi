package com.kodlanir.utils;

import com.kodlanir.pages.PomManager;

public class WebUI extends PomManager {

    public void login(String email, String password)
    {
        BrowserUtils.moveToElement(getHomepage().myAccountMenu);
        getLambdaLoginPage().clickLoginMenuBtn();
        getLambdaLoginPage().seteMail(email);
        getLambdaLoginPage().setPassWord(password);
        getLambdaLoginPage().clickSubmitButton();
    }

    public void openBrowser(String url)
    {
        driver.get(url);
    }
}
