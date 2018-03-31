package appiumWork;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.BeforeClass;


import java.net.MalformedURLException;

public class BaseTest {

    protected static AndroidDriver<AndroidElement> driver;


    @BeforeClass
    public static void initDriver(){
        String appName = "ApiDemos-debug.apk";
        AndroidController myController = new AndroidController();

        try {
            driver = myController.prepareAndroidForAppium(appName);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
