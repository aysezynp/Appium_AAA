package com.krafttech.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Test_02 {

   AppiumDriver<MobileElement> driver;
   AppiumDriverLocalService service;

    @Test
    public void test1() throws InterruptedException, MalformedURLException {

        service=new AppiumServiceBuilder().withIPAddress("127.0.0.1") //service terminaldeki appiummu burdan açmak için ayrıca terminalden açmama gerek kalmıyor.
               // .usingPort(4723)
                .usingAnyFreePort()
                .build();
        service.clearOutPutStreams();
        service.start();

        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("appium:udid", "emulator-5554");
        capabilities.setCapability("appium:version", "11.0");
        capabilities.setCapability("appium:deviceName", "Pixel 2");
        capabilities.setCapability("platformName", "Android");

        capabilities.setCapability("appium:appPackage", "com.touchboarder.android.api.demos");
        capabilities.setCapability("appium:appActivity", "com.touchboarder.androidapidemos.MainActivity");

        //driver'ı ayarlayalım
        driver = new AndroidDriver<MobileElement>(service.getUrl(), capabilities);//service in oluşturduğu URL aldık

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



