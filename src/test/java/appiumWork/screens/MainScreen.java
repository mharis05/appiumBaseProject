package appiumWork.screens;

import appiumWork.PageObject;
import appiumWork.screens.locators.MainScreenLocators;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainScreen extends PageObject{

    @FindBy(xpath = "//android.widget.TextView[@text='Views']")
    private AndroidElement listItemViews;

    public MainScreen(AndroidDriver<AndroidElement> driver){
        super(driver);
    }

    public void clickListItemViews(){
        this.listItemViews.click();
    }





}
