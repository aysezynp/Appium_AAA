package com.krafttech.tests;

import com.krafttech.TestBase;
import com.krafttech.utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Test_07 extends TestBase {


    By lTamam = By.id("android:id/button1");
    By LwebView = By.xpath("//*[@text='WebView']");

    @Test
    public void test1() throws InterruptedException, MalformedURLException {


        // driver.findElement(By.xpath("//*[@text='Continue']")).click();
        Utils.clickWithText("Continue");

        wait.until(ExpectedConditions.visibilityOfElementLocated(lTamam));
        Utils.clickWithText("OK");
        Utils.clickWithText("OK");
        Utils.clickWithText("API Demos");
        Utils.clickWithText("Accessibility");
        driver.navigate().back();
        Utils.clickWithText("Views");
        Utils.swipeV(.8, .2);//yukarı çek aşağı in
        Utils.swipeV(.2, .8);//2 den 8 e aşağı çeker ama yukarı

    }

    @Test
    public void test2() throws InterruptedException, MalformedURLException {


        Utils.clickWithText("Continue");

        wait.until(ExpectedConditions.visibilityOfElementLocated(lTamam));
        Utils.clickWithText("OK");
        Utils.clickWithText("OK");
        Utils.clickWithText("API Demos");
        Utils.clickWithText("Accessibility");
        driver.navigate().back();
        Utils.clickWithText("Views");
        Utils.swipeUntil(LwebView,.8,.2);
        Utils.clickWithText("WebView");

    }


}