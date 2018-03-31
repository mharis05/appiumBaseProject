package appiumWork.screens;

import appiumWork.PageObject;
import appiumWork.screens.locators.ExpandableListsScreenLocators;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.FindBy;

public class ExpandableListsScreen extends PageObject{

    @FindBy(xpath = ExpandableListsScreenLocators.listItemCustomAdapter)
    private AndroidElement listItemCustomAdapter;

    public ExpandableListsScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    public void clickCustomAdaperListItem(){
        listItemCustomAdapter.click();
    }
}
