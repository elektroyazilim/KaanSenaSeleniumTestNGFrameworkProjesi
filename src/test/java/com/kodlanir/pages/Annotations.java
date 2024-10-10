package com.kodlanir.pages;

import com.kodlanir.utils.Config;
import com.kodlanir.utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class Annotations {
    public static WebDriver driver;
    @BeforeMethod
    public void beforeMethod() {

        driver = Driver.getDriver();
    }

}
