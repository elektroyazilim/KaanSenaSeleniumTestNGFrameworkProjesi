package com.kodlanir.tests;

import com.kodlanir.pages.PomManager;
import com.kodlanir.utils.Config;
import com.kodlanir.utils.WebUI;
import org.testng.annotations.Test;

public class Deneme extends PomManager {

    @Test
    public void deneme()
    {
        WebUI webUI = new WebUI();
        webUI.openBrowser(Config.getProperty("baseUrl"));
        webUI.login("senatest2@gmail.com","12345");
    }
}
