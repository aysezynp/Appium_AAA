package com.krafttech;

import com.krafttech.utilities.App;
import com.krafttech.utilities.Device;
import com.krafttech.utilities.Driver;
import com.krafttech.utilities.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TestBase {
    protected AppiumDriver<MobileElement> driver;
    protected WebDriverWait wait;
    @BeforeTest
    public void setUp() {
        driver= Utils.openApp(Device.Pixel2, App.ApiDemos);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait=new WebDriverWait(driver,10);


    }

    @AfterTest
    public void tearDown() {

        driver.closeApp();
        Driver.stopAppiumService();
    }
}
