package appiumWork.screens;

import appiumWork.PageObject;
import appiumWork.screens.locators.ClockControlScreenLocators;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

import static appiumWork.steps.AndroidSteps.pressHoldAndMoveFromOneElementToAnother;

public class ClockControlMinutesScreen extends PageObject{

    public ClockControlMinutesScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = ClockControlScreenLocators.clockMinute00Element)
    private AndroidElement clockMinutes00Element;


    public void dragToMinute(Integer minute){
        AndroidElement targetMinuteElement = driver.findElement(By.xpath(ClockControlScreenLocators.clockMinute00Element.
                replaceAll("0",minute.toString())));
        pressHoldAndMoveFromOneElementToAnother(clockMinutes00Element,targetMinuteElement);
    }
}
