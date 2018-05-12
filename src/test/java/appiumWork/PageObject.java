package appiumWork;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

public class PageObject {

    protected AndroidDriver<AndroidElement> driver;

    public PageObject(AndroidDriver<AndroidElement> driver) {
        this.driver = AndroidController.prepareAndroidForAppium(false,"ApiDemos-debug.apk");
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
