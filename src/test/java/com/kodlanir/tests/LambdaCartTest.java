package com.kodlanir.tests;

import com.kodlanir.pages.PomManager;
import com.kodlanir.utils.Config;
import com.kodlanir.utils.WebUI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LambdaCartTest extends PomManager {
    @Test
    public void cartTest() throws InterruptedException {
        //login olduk
        WebUI webUI = new WebUI();
        webUI.openBrowser(Config.getProperty("baseUrl"));
        webUI.login("senatest2@gmail.com","12345");

        getLambdaCartPage().clickShopByCategoryBtn();
        getLambdaCartPage().clickSubCategoryMP3();
        getLambdaCartPage().clickProduct1();
        getLambdaCartPage().clickIncreaseProductBtn();
        getLambdaCartPage().clickAddToCartBtn();
        getLambdaCartPage().clickViewCartBtn();

        Assert.assertTrue(driver.getCurrentUrl().contains("checkout/cart"));

        getLambdaCartPage().setQtyUpdate("5");
        getLambdaCartPage().clickQtyUpdateBtn();

        /*String expectedText = " Success: You have modified your shopping cart! ";
        String actualText = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
        Assert.assertEquals(actualText, expectedText);*/

        Thread.sleep(3000);

    }
}
