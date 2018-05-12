package appiumWork.util;

import appiumWork.BaseTest;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AppiumWaits extends BaseTest{

    public static void waitForSeconds(Integer seconds){
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }
    public static void sleepForSeconds(Integer seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static AndroidElement waitForVisibilityOfElement(AndroidElement androidElement){
        androidElement = (AndroidElement) (new WebDriverWait(driver,20))
                .until(ExpectedConditions.visibilityOf(androidElement));
        return androidElement;
    }
}
