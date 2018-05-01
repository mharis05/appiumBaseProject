package appiumWork.screens;

import appiumWork.PageObject;
import appiumWork.screens.locators.CustomAdapterScreenLocators;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import java.time.Duration;
import static appiumWork.steps.AndroidSteps.*;

public class CustomAdapterScreen extends PageObject {

    @AndroidFindBy(xpath = CustomAdapterScreenLocators.listItemPeopleNames)
    private AndroidElement listItemPeopleNames;

    public CustomAdapterScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    public void tapAndHoldListItemPeopleNames(Integer seconds) {
        pressAndHoldElement(listItemPeopleNames,2);
    }
}
