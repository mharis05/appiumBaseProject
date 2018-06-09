package appiumWork;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

public class PageObject {

    protected AndroidDriver<AndroidElement> driver = BaseTest.driver;

    public PageObject(AndroidDriver<AndroidElement> driver) {
        driver = BaseTest.driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
