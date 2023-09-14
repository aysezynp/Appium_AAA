package com.krafttech.tests;

import com.krafttech.utilities.App;
import com.krafttech.utilities.Device;
import com.krafttech.utilities.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Test_04 {

   AppiumDriver<MobileElement> driver;
   AppiumDriverLocalService service;
   Device device=Device.Pixel2;
   App app=App.ApiDemos;

    @Test
    public void test1() throws InterruptedException, MalformedURLException {

        Driver.runAppiumService();
        driver=Driver.getDriver(Device.Pixel2,App.ApiDemos);


        // driver.findElement(By.xpath("//*[@text='Continue']")).click();
        clickWithText("Continue");
        Thread.sleep(2000);
        clickWithText("OK");
        clickWithText("OK");
        clickWithText("API Demos");
        clickWithText("Accessibility");

        Thread.sleep(2000);
        driver.closeApp();
        service.stop();
    }
    
    void clickWithText(String text){
        driver.findElement(By.xpath("//*[@text='"+text+"']")).click();
    }

 }



