package appiumWork;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.BeforeClass;


public class BaseTest {

    public static AndroidDriver<AndroidElement> driver;

    @BeforeClass
    public static void initDriver(){
        String appName = "ApiDemos-debug.apk";;
            driver = AndroidController.prepareAndroidForAppium(false, appName);
    }
}
