package com.kodlanir.tests;

import com.kodlanir.pages.PomManager;
import com.kodlanir.utils.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LambdaRegisterTest extends PomManager {

    @Test
    public void registerPositiveScenario(){
        String url = Config.getProperty("baseUrl");
        driver.get(url);

        Assert.assertTrue(driver.getCurrentUrl().contains(url));

        Actions act = new Actions(driver);
        act.moveToElement(getHomepage().myAccountMenu).build().perform();
        
        getLambdaRegisterPage().registerBtn.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("account/register"));

        getLambdaRegisterPage().firstName.sendKeys("Sena");
        getLambdaRegisterPage().lastName.sendKeys("Efee");
        getLambdaRegisterPage().email.sendKeys("senatest2@gmail.com");
        getLambdaRegisterPage().phone.sendKeys("03125896574");
        getLambdaRegisterPage().password.sendKeys("12345");
        getLambdaRegisterPage().rePassword.sendKeys("12345");
        getLambdaRegisterPage().yesRadioBtn.click();
        getLambdaRegisterPage().policyCheckBox.click();
        getLambdaRegisterPage().continueBtn.click();

        getLambdaRegisterPage().email.click();

        Assert.assertEquals(getSuccessPage().successText.getText(), "Your Account Has Been Created!");

        driver.quit();
    }

}
