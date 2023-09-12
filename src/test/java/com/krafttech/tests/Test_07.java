package com.krafttech.tests;

import com.krafttech.TestBase;
import com.krafttech.utilities.App;
import com.krafttech.utilities.Device;
import com.krafttech.utilities.Driver;
import com.krafttech.utilities.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Test_06 extends TestBase {



    By lTamam=By.id("android:id/button1");

    @Test
    public void test1() throws InterruptedException, MalformedURLException {


        // driver.findElement(By.xpath("//*[@text='Continue']")).click();
        clickWithText("Continue");

        wait.until(ExpectedConditions.visibilityOfElementLocated(lTamam));
        clickWithText("OK");
        clickWithText("OK");
        clickWithText("API Demos");
        clickWithText("Accessibility");



    }
    
    void clickWithText(String text){
        driver.findElement(By.xpath("//*[@text='"+text+"']")).click();
    }

 }



