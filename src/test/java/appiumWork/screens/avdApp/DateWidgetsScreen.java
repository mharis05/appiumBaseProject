package appiumWork.screens.avdApp;

import appiumWork.PageObject;
import appiumWork.screens.avdApp.locators.DateWidgetsScreenLocators;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import static appiumWork.steps.AndroidSteps.tap;

public class DateWidgetsScreen extends PageObject{
    public DateWidgetsScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = DateWidgetsScreenLocators.listItemInline)
    private AndroidElement listItemInline;

    public void clickListItemInline(){
        tap(listItemInline);
    }
}
