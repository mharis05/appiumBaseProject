package appiumWork.screens;

import appiumWork.PageObject;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import static appiumWork.steps.AndroidSteps.*;

public class MainScreen extends PageObject{

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Views']")
    private AndroidElement listItemViews;

    public MainScreen(AndroidDriver<AndroidElement> driver){
        super(driver);
    }

    public void clickListItemViews(){
        tap(this.listItemViews);
    }





}
