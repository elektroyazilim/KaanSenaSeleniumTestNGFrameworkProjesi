package com.kodlanir.tests;

import com.kodlanir.pages.PomManager;
import com.kodlanir.utils.BrowserUtils;
import com.kodlanir.utils.Config;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LambdaRegisterTest extends PomManager {

    @Test
    public void registerPositiveScenario(){
        String url = Config.getProperty("baseUrl");
        driver.get(url);

        Assert.assertTrue(driver.getCurrentUrl().contains(url));

        BrowserUtils.moveToElement(getHomepage().myAccountMenu);
        getLambdaRegisterPage().registerBtn.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("account/register"));

        getLambdaRegisterPage().setFirstName("Karan");
        getLambdaRegisterPage().setLastName("Efe");
        getLambdaRegisterPage().setEmail("karanefe@gmail.com");
        getLambdaRegisterPage().setPhone("05052719052");
        getLambdaRegisterPage().setPassword("10082023");
        getLambdaRegisterPage().setRePassword("10082023");
        getLambdaRegisterPage().setYesRadioBtn();
        getLambdaRegisterPage().setPolicyCheckBox();
        getLambdaRegisterPage().setContinueBtn();

        Assert.assertEquals(getSuccessPage().successText.getText(), "Your Account Has Been Created!");
    }
}
