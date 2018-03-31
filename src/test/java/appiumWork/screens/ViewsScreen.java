package appiumWork.screens;

import appiumWork.PageObject;
import appiumWork.screens.locators.ViewsScreenLocators;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.FindBy;

public class ViewsScreen extends PageObject{

    @FindBy(xpath = ViewsScreenLocators.listItemExpandableLists)
    private AndroidElement listItemExpandableLists;

    public ViewsScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    public void clickListItemExpandableLists() {
        listItemExpandableLists.click();
    }
}
