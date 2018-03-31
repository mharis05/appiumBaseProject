package appiumWork.util;

import appiumWork.BaseTest;

import java.util.concurrent.TimeUnit;

public class AppiumWaits extends BaseTest{

    public static void waitForSeconds(Integer seconds){
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }
}
