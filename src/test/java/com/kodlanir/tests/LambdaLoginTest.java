package com.kodlanir.tests;

import com.kodlanir.pages.PomManager;
import com.kodlanir.utils.BrowserUtils;
import com.kodlanir.utils.Config;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LambdaLoginTest extends PomManager{

    @Test
    public void loginPositiveScenario(){
        String url = Config.getProperty("baseUrl");
        driver.get(url);

        Assert.assertTrue(driver.getCurrentUrl().contains(url));

        BrowserUtils.moveToElement(getHomepage().myAccountMenu);
        getLambdaLoginPage().loginBtn.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("account/login"));

        getLambdaLoginPage().seteMail("senatest2@gmail.com");
        getLambdaLoginPage().setPassWord("12345");
        getLambdaLoginPage().setSubmitButton();

        Assert.assertEquals(getLambdaLoginPage().loginControlBtn.getText(), "Wish List");
    }

    @Test
    public void loginNegativeScenario1(){
        String url = Config.getProperty("baseUrl");
        driver.get(url);

        Assert.assertTrue(driver.getCurrentUrl().contains(url));

        BrowserUtils.moveToElement(getHomepage().myAccountMenu);
        getLambdaLoginPage().loginBtn.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("account/login"));

        getLambdaLoginPage().seteMail("senatest2@gmail.com");
        getLambdaLoginPage().setPassWord("123456"); //yanlış
        getLambdaLoginPage().setSubmitButton();

        Assert.assertFalse(driver.getCurrentUrl().contains("account/account"));
    }

    @Test
    public void loginNegativeScenario2(){
        String url = Config.getProperty("baseUrl");
        driver.get(url);

        Assert.assertTrue(driver.getCurrentUrl().contains(url));

        BrowserUtils.moveToElement(getHomepage().myAccountMenu);
        getLambdaLoginPage().loginBtn.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("account/login"));

        getLambdaLoginPage().eMail.sendKeys("senatest29@gmail.com"); //yanlış
        getLambdaLoginPage().passWord.sendKeys("12345");
        getLambdaLoginPage().submitButton.click();

        getLambdaLoginPage().seteMail("senatest29@gmail.com"); //yanlış
        getLambdaLoginPage().setPassWord("12345");
        getLambdaLoginPage().setSubmitButton();

        Assert.assertFalse(driver.getCurrentUrl().contains("account/account"));
    }
}
