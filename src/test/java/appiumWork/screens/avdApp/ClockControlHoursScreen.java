package appiumWork.screens.avdApp;

import appiumWork.PageObject;
import appiumWork.screens.avdApp.locators.ClockControlScreenLocators;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

import static appiumWork.steps.AndroidSteps.*;

public class ClockControlHoursScreen extends PageObject{

    public ClockControlHoursScreen(AndroidDriver<AndroidElement> driver){
        super(driver);
    }


    @AndroidFindBy(xpath = ClockControlScreenLocators.clockHour12Element)
    private AndroidElement clockHours12Element;


    public void clickOnHourValue(Integer hour){
        tap(clockHours12Element);
    }

    public void dragToHour(Integer hour){
        AndroidElement targetHourElement = driver.findElement(By.xpath(ClockControlScreenLocators.clockHour12Element.
                replaceAll("12",hour.toString())));
        pressHoldAndMoveFromOneElementToAnother(clockHours12Element,targetHourElement);
    }


}
