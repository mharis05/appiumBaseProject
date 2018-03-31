package appiumWork;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AndroidController {



    public AndroidDriver<AndroidElement> prepareAndroidForAppium(String appName) throws MalformedURLException {

        File appDir = new File("/home/haris/AppiumWork/AppiumProject/apps");
        File app = new File(appDir, appName);
        DesiredCapabilities capabilities = new DesiredCapabilities();
        //capabilities.setCapability("device","avd2");

        //mandatory capabilities
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "avd2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);

        //other caps
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        return new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
}
