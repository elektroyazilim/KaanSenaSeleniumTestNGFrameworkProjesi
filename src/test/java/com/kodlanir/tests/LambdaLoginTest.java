package com.kodlanir.tests;

import com.kodlanir.pages.PomManager;
import com.kodlanir.utils.Config;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LambdaLoginTest extends PomManager{

    @Test
    public void loginPositiveScenario(){
        String url = Config.getProperty("baseUrl");
        driver.get(url);

        Assert.assertTrue(driver.getCurrentUrl().contains(url));

        Actions act = new Actions(driver);
        act.moveToElement(getHomepage().myAccountMenu).perform();

        getLambdaLoginPage().loginBtn.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("account/login"));

        getLambdaLoginPage().eMail.sendKeys("senatest2@gmail.com");
        getLambdaLoginPage().passWord.sendKeys("12345");
        getLambdaLoginPage().submitButton.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("account/account"));

        driver.close();
    }

    @Test
    public void loginNegativeScenario1(){
        String url = Config.getProperty("baseUrl");
        driver.get(url);

        Assert.assertTrue(driver.getCurrentUrl().contains(url));

        Actions act = new Actions(driver);
        act.moveToElement(getHomepage().myAccountMenu).perform();

        getLambdaLoginPage().loginBtn.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("account/login"));

        getLambdaLoginPage().eMail.sendKeys("senatest2@gmail.com");
        getLambdaLoginPage().passWord.sendKeys("123456"); //yanlış
        getLambdaLoginPage().submitButton.click();

        Assert.assertFalse(driver.getCurrentUrl().contains("account/account"));

        driver.close();
    }

    @Test
    public void loginNegativeScenario2(){
        String url = Config.getProperty("baseUrl");
        driver.get(url);

        Assert.assertTrue(driver.getCurrentUrl().contains(url));

        Actions act = new Actions(driver);
        act.moveToElement(getHomepage().myAccountMenu).perform();

        getLambdaLoginPage().loginBtn.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("account/login"));

        getLambdaLoginPage().eMail.sendKeys("senatest29@gmail.com"); //yanlış
        getLambdaLoginPage().passWord.sendKeys("12345");
        getLambdaLoginPage().submitButton.click();

        Assert.assertFalse(driver.getCurrentUrl().contains("account/account"));

        driver.close();
    }
}
