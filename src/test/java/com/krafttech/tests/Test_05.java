package com.krafttech.tests;

import com.krafttech.utilities.App;
import com.krafttech.utilities.Device;
import com.krafttech.utilities.Driver;
import com.krafttech.utilities.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Test_05 {

   AppiumDriver<MobileElement> driver;

   WebDriverWait wait;
   By lTamam=By.id("android:id/button1");

    @Test
    public void test1() throws InterruptedException, MalformedURLException {

        driver= Utils.openApp(Device.Pixel2,App.ApiDemos);
        wait=new WebDriverWait(driver,10);

        // driver.findElement(By.xpath("//*[@text='Continue']")).click();
        clickWithText("Continue");
        wait.until(ExpectedConditions.visibilityOfElementLocated(lTamam));
        clickWithText("OK");
        clickWithText("OK");
        clickWithText("API Demos");
        clickWithText("Accessibility");

        Thread.sleep(2000);
        driver.closeApp();
        Driver.stopAppiumService();

    }
    
    void clickWithText(String text){
        driver.findElement(By.xpath("//*[@text='"+text+"']")).click();
    }

 }



