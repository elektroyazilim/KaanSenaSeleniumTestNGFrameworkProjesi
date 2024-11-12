package com.kodlanir.pages;

import com.kodlanir.utils.BrowserUtils;
import com.kodlanir.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LambdaCartPage extends Base {
    @FindBy(css = "a[class='icon-left both text-reset']")
    private WebElement shopByCategoryBtn;

    @FindBy(xpath = "//li[5]//div[@class='icon svg-icon']")
    private WebElement subCategoryMP3;

    @FindBy(xpath = "//div[@class='carousel-item active']//img[@title='HTC Touch HD']")
    private WebElement product1;

    @FindBy(xpath = "//div[@id='entry_216841']//i[@class='fas fa-plus-circle']")
    private WebElement increaseProductBtn;

    @FindBy(css = "div[id='entry_216842']")
    private WebElement addToCartBtn;

    @FindBy(xpath = "//a[@class='btn btn-primary btn-block']")
    private WebElement viewCartBtn;

    @FindBy(css = "input[value='2']")
    private WebElement qtyUpdate;


    @FindBy(xpath = "//div//i[@class='fas fa-sync-alt']")
//    @FindBy(xpath = "//button[@data-original-title='Update']")
    private WebElement qtyUpdateBtn;

    @FindBy(xpath = "//a[text()='Checkout']")
    private WebElement checkoutBtn;

    public void clickShopByCategoryBtn() {
        shopByCategoryBtn.click();
    }

    public void clickSubCategoryMP3() {
        subCategoryMP3.click();
    }

    public void clickProduct1() {
        product1.click();
    }

    public void clickIncreaseProductBtn() {
        increaseProductBtn.click();
    }

    public void clickAddToCartBtn() {
        addToCartBtn.click();
    }

    public void clickViewCartBtn() {
        viewCartBtn.click();
    }

    public void setQtyUpdate(String qty) {
//        qtyUpdate.click();
//        qtyUpdate.clear();
        BrowserUtils.clearTxtboxByJs(qtyUpdate);
        qtyUpdate.sendKeys(qty);
    }

    public void clickQtyUpdateBtn() {

//        BrowserUtils.waitForClickability(qtyUpdateBtn,5);
//        qtyUpdateBtn.click();


        BrowserUtils.waitForVisibility(Driver.getDriver().findElement(By.xpath("//button[@data-original-title='Update' and contains(@aria-describedby,'tooltip')]")),16);

        WebElement bt = Driver.getDriver().findElement(By.xpath("//button[@data-original-title='Update' and contains(@aria-describedby,'tooltip')]"));
        String gg = bt.getAttribute("class");
        bt.click();
    }

    public void clickCheckoutBtn() {
        checkoutBtn.click();
    }
}
