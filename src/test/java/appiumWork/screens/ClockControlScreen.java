package appiumWork.screens;

import appiumWork.PageObject;
import appiumWork.screens.locators.ClockControlScreenLocators;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

import static appiumWork.steps.AndroidSteps.*;

public class ClockControlScreen extends PageObject{

    public ClockControlScreen(AndroidDriver<AndroidElement> driver){
        super(driver);
    }

    

    @AndroidFindBy(xpath = ClockControlScreenLocators.clockHour12Element)
    private AndroidElement clockHoursElement;

    public void clickOnHourValue(Integer hour){
       // String hourElement = clockHoursElement.getAttribute("clickable");
       // System.out.println("Content Desc is: " + hourElement);
        tap(clockHoursElement);
    }

    public void dragToHour(Integer hour){
        AndroidElement targetHourElement = driver.findElement(By.xpath(ClockControlScreenLocators.clockHour12Element.
                replaceAll("12",hour.toString())));
        pressHoldAndMoveFromOneElementToAnother(clockHoursElement,targetHourElement);
    }


}
