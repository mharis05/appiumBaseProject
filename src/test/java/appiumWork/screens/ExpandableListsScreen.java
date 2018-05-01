package appiumWork.screens;

import appiumWork.PageObject;
import appiumWork.screens.locators.ExpandableListsScreenLocators;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import static appiumWork.steps.AndroidSteps.*;

public class ExpandableListsScreen extends PageObject{

    @AndroidFindBy(xpath = ExpandableListsScreenLocators.listItemCustomAdapter)
    private AndroidElement listItemCustomAdapter;

    public ExpandableListsScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    public void clickCustomAdaperListItem(){
        tap(listItemCustomAdapter);
    }
}
