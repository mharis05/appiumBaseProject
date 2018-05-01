package appiumWork;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class _DriverConfig {
/*

    private static String appName = "ApiDemos-debug.apk";

    AndroidDriver<AndroidElement> driver;


    @BeforeSuite
    public void initDriver(){
        AndroidController myController = new AndroidController();

        try {
            driver = myController.prepareAndroidForAppium(appName);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }*/

/*    @Test
    public void navigateToCustomAdapterAndLongPressOnPropleNames(){

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElementById("android:id/checkbox").click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();

    }

    @Test
    public void clockControlSetTest(){

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().class(\"android.widget.TextView\")").size());
    }*/


}
