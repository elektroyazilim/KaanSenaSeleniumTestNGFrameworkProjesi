package com.kodlanir.tests;

import com.kodlanir.pages.LambdaRegisterPage;
import com.kodlanir.utils.Config;
import com.kodlanir.utils.Driver;
import com.kodlanir.pages.PomManager;
import com.kodlanir.utils.BrowserUtils;
import com.kodlanir.utils.Config;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.DriverAction;

import static com.kodlanir.pages.Annotations.driver;

public class LambdaRegisterTest extends PomManager {

    @Test
    public void LambdaRegisterRegister() {
        String url = Config.getProperty("lambdaRegisterURL");
        driver.get(url);

        Assert.assertTrue(driver.getCurrentUrl().contains(url));

        // BrowserUtils.hoverXYByJs(100, 200);
        getLambdaRegisterPage().UpmyAccount();
        getLambdaRegisterPage().clickMyAccount();
        getLambdaRegisterPage().firstNames("Aziz Kaan");
        getLambdaRegisterPage().lastnames("KARACA");
        getLambdaRegisterPage().emails("kaan@kaan.com");
        getLambdaRegisterPage().Phone("5556669922");
        getLambdaRegisterPage().pass("12345678912a");
        getLambdaRegisterPage().PasswordConfirms("12345678912a");
        getLambdaRegisterPage().letter();
        getLambdaRegisterPage().agrees();
        getLambdaRegisterPage().submits();
    }


}
