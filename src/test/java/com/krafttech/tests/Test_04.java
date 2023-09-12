package com.krafttech.tests;

import com.krafttech.utilities.App;
import com.krafttech.utilities.Device;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Test_03 {

   AppiumDriver<MobileElement> driver;
   AppiumDriverLocalService service;
   Device device=Device.Pixel2;
   App app=App.ApiDemos;

    @Test
    public void test1() throws InterruptedException, MalformedURLException {

        service=new AppiumServiceBuilder().withIPAddress("127.0.0.1") //service terminaldeki appiummu burdan açmak için ayrıca terminalden açmama gerek kalmıyor.
               // .usingPort(4723)
                .usingAnyFreePort()
                .build();
        service.clearOutPutStreams();
        service.start();

        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("appium:udid", device.udid);
        capabilities.setCapability("appium:version", device.version);
        capabilities.setCapability("appium:deviceName",device.deviceName);
        capabilities.setCapability("platformName", device.platformName);

        capabilities.setCapability("appium:appPackage", app.appPackage);
        capabilities.setCapability("appium:appActivity", app.appActivity);

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



