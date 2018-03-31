package appiumWork.screens;

import appiumWork.PageObject;
import appiumWork.screens.locators.CustomAdapterScreenLocators;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CustomAdapterScreen extends PageObject {

    @FindBy(xpath = CustomAdapterScreenLocators.listItemPeopleNames)
    private AndroidElement listItemPeopleNames;

    TouchAction customAction = new TouchAction(driver);

    public CustomAdapterScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    public void tapAndHoldListItemPeopleNames(Integer seconds) {
        customAction.press(listItemPeopleNames)
                .waitAction(Duration.ofSeconds(seconds)).release().perform();
    }
}
