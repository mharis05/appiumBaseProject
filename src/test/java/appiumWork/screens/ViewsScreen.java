package appiumWork.screens;

import appiumWork.PageObject;
import appiumWork.screens.locators.ViewsScreenLocators;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import static appiumWork.steps.AndroidSteps.*;

public class ViewsScreen extends PageObject{

    @AndroidFindBy(xpath = ViewsScreenLocators.listItemExpandableLists)
    private AndroidElement listItemExpandableLists;

    @AndroidFindBy(uiAutomator = ViewsScreenLocators.listItemDateWidgets)
    private AndroidElement listItemDateWidgets;

    public ViewsScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    public void clickListItemExpandableLists() {
        tap(listItemExpandableLists);
    }

    public void clickListItemDateWidgets(){
        tap(listItemDateWidgets);
    }
}
